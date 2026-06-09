package LinkedList;

import java.util.HashMap;

import LinkedList.CreateLinkedList.Node;

public class CycleInALinkedList {
	
	static class Node
	{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next =null;
			// TODO Auto-generated constructor stub
		}
		
		
	}
	
	
	
	public static boolean hascycle(Node head)
	{
	
		 Node slow =head;
		 Node fast = head;
		 if(head ==null)
		 {
			 return false;
		 }
		 
		 while(fast !=null && fast.next !=null)
		 {
			 fast = fast.next.next;
			 slow = slow.next;
		 }
		 
		 /*
		  * ✅ 2. while(fast != null && fast.next != null)

			👉 Use Case: Detecting a cycle in a linked list (Floyd’s Cycle Detection Algorithm)
			
			Why this condition?
			
			    We check fast != null to ensure we are not at the end of the list.
			    We check fast.next != null to ensure the next node exists before moving two steps.
		  */
		 
		 if(fast != slow)
		 {
			 return false;
		 }
		 
		 return true;
		 
		 
	}
/*	
	public static boolean hascycle(Node head)
	{
		HashMap<Node, Boolean> visitedNode = new HashMap<>();
		
		if(head ==null)
		{
		return false;	
		}
		
		Node curr = head;
		
		while(curr !=null)
		{
			if(visitedNode.containsKey(curr))
			{
				return true;
			}
		visitedNode.put(curr, true);
		curr = curr.next;
			
		}
		return false;
		
		
	}
	*/
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next = new Node(2);
		head.next.next=new Node(2);
		head.next.next.next = new Node(1);
		
		System.out.println(hascycle(head));
		
	}

}
