package LinkedList;

import LinkedList.FindNthNodeANDdelete.Node;

public class removeNthFromEnd {

	
	static class ListNode
	{
		 int data;  // Data stored in the node
		 ListNode next; // Reference to the next node in the list

		    // Constructor to initialize the node with data
		    public ListNode(int data) {
		        this.data = data;
		        this.next = null;
		    }
	}
	
	public static ListNode removeNthNode(ListNode head, int n)
	{
		if(head == null) return null;
		
		ListNode dummy = new ListNode(0);
		 dummy.next = head;
		
		ListNode slow = dummy;
		ListNode fast = dummy;
		
		for(int i=0;i<n;i++)
		{
			fast = fast.next;
		}
		
		while(fast.next !=null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		
		return dummy.next;
	}
	
	public static void display(ListNode head)
	{
		if(head ==null)
		{
			return ;
		}
		
		ListNode currhead = head;
		
		while(currhead !=null)
		{
			System.out.print(currhead.data + " ->");
			currhead = currhead.next;
			
		}
		 System.out.println("null");
	}
	
	public static void main(String[] args) {
		 
		ListNode  head = new ListNode(1);
		ListNode  second = new ListNode(2);
		ListNode  third = new ListNode(3);
		ListNode  fourth = new ListNode(4);
		ListNode  fifth = new ListNode(5);
		head.next = second;
		second.next= third;
		third.next = fourth;
		fourth.next = fifth;
		
		display(head);
		
		ListNode  newhead =removeNthNode(head, 3);
		
		display(newhead);;
		
		
		
	}
	
}
