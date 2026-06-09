package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	class Node
	{
		int key, val;
		Node prev ,next;
		
		public Node(int key, int val) {
			// TODO Auto-generated constructor stub
			this.key= key;
			this.val =val;
			
		}
		
	}
	private final int capacity;
	private Map<Integer, Node> cache;
	private  final Node head, tail;
	
	 public LRUCache(int capacity)
	 {
		 this.capacity =capacity;
		 this.cache = new HashMap<>();
		 head = new Node(0, 0); // dummy head
	      tail = new Node(0, 0); // dummy tail
	      
	      head.next= tail;
	      tail.prev= head;
		 
	 }
	 
	 
	 

	    public int get(int key) {
	    	
	    	if(!cache.containsKey(key)) return -1;
	    	Node node = cache.get(key);
	    	remove(node);
	    	insertToFront(node);
	    	return node.val;	
	    }

	    public void put(int key, int value) {
	    	
	    	if(cache.containsKey(key))
	    	{
	    		remove(cache.get(key));
	    		cache.remove(key); // remove from map tooo
	    		 /*
	    		  * If key exists:

                     Remove node from list

                      Remove key from map


                      Then insert the new node.
	    		  */
	    	}
	    	
	    	if(cache.size() == capacity)
	    	{
	    		cache.remove(tail.prev.key);
	    		remove(tail.prev);
	    	}
	    	
	    	Node node  = new Node(key, value);
	    	insertToFront(node);
	    	cache.put(key, node);
	    	
	    	
	    }


		private void insertToFront(Node node) {
			// TODO Auto-generated method stub
			node.next = head.next;
			node.prev = head;
			head.next.prev = node;
			   head.next = node;
		}




		private void remove(Node node) {
			// TODO Auto-generated method stub
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}
		
		public static void main(String[] args) {
	        LRUCache cache = new LRUCache(2); // capacity = 2

	        cache.put(1, 1);
	        cache.put(2, 2);
	        System.out.println(cache.get(1)); // returns 1
	        cache.put(3, 3); // evicts key 2
	        System.out.println(cache.get(2)); // returns -1 (not found)
	        cache.put(4, 4); // evicts key 1
	        System.out.println(cache.get(1)); // returns -1 (not found)
	        System.out.println(cache.get(3)); // returns 3
	        System.out.println(cache.get(4)); // returns 4
	    }

}
