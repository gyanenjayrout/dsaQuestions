package practcie;

import practcie.reverseLinkedList.Node;

public class REveerseLinkedList {
	static class Node 
	{
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			this.next = null;
			
			
		}
	}
	
	public static Node reverseLinkedlist(Node head )
	{
		if(head== null)
		{
			return null;
		}
		if(head.next ==null)
		{
			return head;
		}
		Node prev = null;
		Node curr = head;
		
		while(curr !=null)
		{
			Node nextnode  = curr.next;
			curr.next = prev;
			
			prev =curr;
			curr = nextnode;
		}
		return prev;
	}
	
	public static Node reverseLIneedlistresussion(Node head)
	{
		if(head ==null || head.next==null)
		{
			return head;
		}
		/*
		 * At reverseList(5):

		    Returns node 5 (the new head of the reversed list).
		
		At reverseList(4): ListNode newHead = reverseList(head.next);
		 */
		
		
		Node newNode  = reverseLIneedlistresussion(head.next);
		
		head.next.next = head; // 5.next = 4 (Reverse the pointer)
		head.next = null;      // 4.next = null (Break the old link)
		
		return newNode;
		/*
		 * Time Complexity (TC): O(n) (Linear time – each node is processed once).
             Space Complexity (SC): O(n) (Recursive stack depth).
		 */
	}
	
	
	
	public static void printList(Node head)
	{
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		
		Node curr = head;
		
		while(curr!=null)
		{
			System.out.print(curr.data + " --->");
			curr = curr.next;
		}
		
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		
		Node head =  new Node(1);
		Node second =  new  Node(2);
		Node third =  new  Node(3);
		Node fourth =  new  Node(4);
		Node five =  new  Node(5);
		
		
		head.next = second;
		
		second.next = third;
		
		third.next = fourth;
		fourth.next = five;
		
		System.out.print("Original List: ");
        printList(head);

		head = reverseLinkedlist(head);
		printList(head);
		
		
		head =reverseLIneedlistresussion(head);
		
		printList(head);
		
		 
	}

}
