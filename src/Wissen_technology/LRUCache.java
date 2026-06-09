package Wissen_technology;

import java.util.HashMap;
import java.util.Map;

//import LinkedList.LRUCache;

public class LRUCache {
  class Node
  {
	  int Key, Value;
	  Node prev, next;
	  
	  public Node(int key , int val) {
		// TODO Auto-generated constructor stub
	this.Key =key;
	this.Value = val;
	  }
		  
  }
  
  private final int capccity;
  private final Map<Integer, Node> cache;
  private final Node head;
  private final Node tail;
   public LRUCache(int capacity) {
	// TODO Auto-generated constructor stub
	   this.capccity = capacity;
       this.cache = new HashMap<>();
       this.head = new Node(0,0);
       this.tail = new Node(0,0);
       
       
       head.next = tail;
       tail.prev = head;
       
  	   
}
   public int get(int key)
   {
	   if(!cache.containsKey(key)) return -1;
	   
	   Node node = cache.get(key);
	   remove(node);
	   insertToFront(node);
	   return node.Value;
	   
   }
   
   
   public void put(int key , int val)
   {
	   if(cache.containsKey(key))
	   {
		   remove(cache.get(key));
		   
	   }
	   
	   if(cache.size()==capccity)
	   {
		   cache.remove(tail.prev.Key);
		   remove(tail.prev);
	   }
	   
	   Node node = new Node(key, val);
	   
	   insertToFront(node);
	   cache.put(key, node);
   }
   
   public void insertToFront(Node node)
   {
	   
	   node.next =head.next;
	   node.prev = head;
	   node.next.prev = node;
	   head.next = node;
	   
   }
   
   public void remove(Node node)
   {
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
