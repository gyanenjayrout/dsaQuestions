package LinkedList;

import java.util.HashSet;
import java.util.Set;



//import LinkedList.ArrayToLinkedList.Node;

public class RemoveDUPlLICATEFROMSOrtedLL {
	
//	 Remove duplicates from a linked list that is sorted.
//	Node head;
	 static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	
//	public void AddFirst( int data)
//	{
//		Node newNode = new Node(data);
//		
//		if(head == null)
//		{
//			head  = newNode;
//		}
//		
//		newNode.next = head;
//		head =newNode;
//		
//	}
	// optimal Approach
	 
	 public static Node RemoveDuplicate(Node head)
		{
		 
		 if(head  ==null)
		 {
			 return null;
		 }
		 
		 HashSet<Integer> seen = new HashSet<>();
		 
		 Node currNode = head;
		 
		 seen.add(currNode.data);
		 
		 while(currNode.next != null)
		 {
			 if(seen.contains(currNode.next.data))
			 {
				 currNode.next =currNode.next.next;
			 }
			 else
			 {
				 seen.add(currNode.next.data);
				 currNode = currNode.next;
			 }
		 }
			
		 return head;
		 
		 
		}
	 
	 /*
	  * 
	public static Node RemoveDuplicate(Node head)
	{
		if (head == null) {
            return null;
        }
		
		Node curr = head;
		while(curr !=null && curr.next !=null)
		{
			if(curr.data ==curr.next.data)
			{
				curr.next = curr.next.next;
			}else
			{
				curr=curr.next;
			}
		

		}
		
		return head;
		
	}
	
	*/
	
	
	public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
	
	
	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(4);
		
	
		System.out.println("Original List:");
        printList(head);

        head = RemoveDuplicate(head);

        System.out.println("List after removing duplicates:");
        printList(head);
	}

}
