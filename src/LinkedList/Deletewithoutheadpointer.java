package LinkedList;

import LinkedList.ArrayToLinkedList.Node;
import LinkedList.Deletecycleinalinkedlist.ListNode;

public class Deletewithoutheadpointer {
	
	 static class ListNode {
	        int val;
	        ListNode next;

	        ListNode(int x) {
	            val = x;
	            next = null;
	        }
	    }
	 
	static void deleteNode(ListNode node) 
	 {
		 if(node ==null || node.next ==null)
		 {
			 return;
		 }
		 
		 
		 node.val = node.next.val; //Copy next value:
		 node.next = node.next.next; //Skip next node:
	 }
	
public static  void printlist(ListNode head)
	
	{
		if(head == null)
		{
			
			return;
		}
		
		ListNode curr = head;
		
		while(curr !=null)
		{
			System.out.print(curr.val +"->");
			curr = curr.next;
		}
		System.out.println("null");
	}

	
	
	public static void main(String[] args) {
		ListNode head =  new ListNode(1);
		ListNode second  = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth  = new ListNode(4);
		ListNode five  = new ListNode(5);
		
		head.next = second;
		second.next = third;
		
		third.next = fourth;
		fourth.next =five;
		
		
System.out.println("Before deletion of third node");
		printlist(head);
		
		System.out.println();
		
		deleteNode(third); 
		
		System.out.println("Before deletion of third node");	
		printlist(head);
		
	}

}
