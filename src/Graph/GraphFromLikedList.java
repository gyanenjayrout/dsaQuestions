package Graph;

import java.util.*;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}
/*
 
1 : [2]
2 : [3]
3 : [4]
4 : []

 */
public class GraphFromLikedList {

	
	//Convert Linked List → Graph (Adjacency List) Directed
	//Directed Graph , each node only points to its next node.
	public static Map<Integer, List<Integer>> convertToGraph(ListNode head) {
		 
		Map<Integer,List<Integer>> graph = new HashMap<>();
		
		ListNode curr = head;
		
		while(curr !=null)
		{
			graph.putIfAbsent(curr.val, new ArrayList<>());
			
			if(curr.next !=null)
			{
				graph.get(curr.next).add(curr.next.val);
			}
			
			curr = curr.next;
		}
		
		return graph;
	} 
	
	
	//Convert Linked List → Graph (Adjacency List) UN-Directed
	//But in an Undirected Graph, both nodes should point to each other.
	/*
	 1 — 2
     2 — 3
     3 — 4
     
     1 : [2]
     2 : [1,3]
     3 : [2,4]
     4 : [3]

	 */
		public static Map<Integer, List<Integer>> convertToGraph2(ListNode head) {
			
			Map<Integer, List<Integer>> graph = new HashMap<>();
			
			ListNode curr= head;
			while(curr !=null && curr.next != null)
			{
				graph.putIfAbsent(curr.val, new ArrayList<>());
				graph.putIfAbsent(curr.next.val, new ArrayList<>());
				
				graph.get(curr.val).add(curr.next.val);
				graph.get(curr.next.val).add(curr.val);
				
				curr = curr.next;
				
			}
			
			return graph;
		
		}
		
		
		public static void main(String[] args) {
			ListNode node1 = new ListNode(1);
			ListNode node2 = new ListNode(2);
			ListNode node3 = new ListNode(3);
			ListNode node4 = new ListNode(4);
			
			
			node1.next = node2;
			node2.next = node3;
			node3.next = node4;
			
			ListNode head = node1;
			
			convertToGraph(head);
			convertToGraph2(head);
		}
}
