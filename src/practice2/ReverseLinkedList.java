package practice2;

import practice2.DeleteNthNodeLinkedList.Node;

public class ReverseLinkedList {
	
	static Node head;
	
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
	
	public static Node ReverseLinkedlist(Node head)
	{
		
		if(head ==null || head.next ==null)
		{
			return head;
		}
		
		
		Node newNode = ReverseLinkedlist(head.next);
		
		head.next.next= head;
		head.next =null;
		
		return newNode;
	}
	
	public static Node ReverseLinkedlistItteration(Node head)
	{
		if (head == null || head.next == null) {
	        return head;  // No need to reverse if list is empty or has only one node
	    }
		
		Node prev  =null;
		Node curr  = head;
		
		while(curr!=null)
		{
			Node currnext = curr.next;
			
			curr.next  = prev;
			
			prev = curr;
			curr = currnext;
		}
		return prev;
		
		
	}
	
	public static void display(Node head)
	{
		if(head == null)
		{
			System.out.println("Empty");
		}
		
		Node currhead= head;
		
		while(currhead !=null)
		{
			
			System.out.print(currhead.data + "->");
			currhead = currhead.next;
		}
		System.out.println("null");
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		Node  head =  new Node(1);
		Node second = new Node(2);
		
		Node third  = new Node(4);
		
		Node forth = new Node(5);
		
		head.next  =second;
		second.next = third;
		third.next =forth;
		forth.next = null;
		display(head);
		
//		Node newNoe = ReverseLinkedlist(head);
//		
//		
//		display(newNoe);
		
		Node headd = ReverseLinkedlistItteration(head);
		display(headd);
		
		
	}

}
