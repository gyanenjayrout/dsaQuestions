package Wissen_technology;

import LinkedList.CreateLinkedList;

public class CreateaLinleList {
	Node head;
	static int size=0;
	
	class Node
	{
		String data;
		Node next;
		
	public Node(String data)
		{
		this.data =data;
		next =null;
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		CreateaLinleList ll = new CreateaLinleList();
		
		ll.AddFirst("a");
		ll.AddFirst("is");
		ll.AddFirst("it");
		ll.printlist();
		ll.addLast("Linked");
		ll.addLast("list");
		ll.printlist();
		System.out.println(size);
		ll.deleteNthNode(2);
		ll.printlist();
		
//		ll.deleteFirst();
//		ll.printlist();
//		ll.deleeteLast();
//		ll.printlist();
//		System.out.println(size);
		
		
		
	}




	private void deleeteLast() {
		// TODO Auto-generated method stub
		if(head ==null)
		{
			System.out.println("List Is Empty");
			return;
		}
		
		Node currethead = head;
		Node seconhead = head.next;
		
		while(seconhead.next !=null)
		{
			currethead= currethead.next;
			seconhead = seconhead.next;
			
		}
		
		currethead.next= null;
		size--;
	}




	private void deleteFirst() {
		// TODO Auto-generated method stub
		if(head ==null)
		{
			System.out.println("List Is Empty");
//			return;
			return ;
		}
		
		
		head = head.next;
		size--;
	}




	private void deleteNthNode(int postion) {
		// TODO Auto-generated method stub
		if(head==null || postion<0 ||postion>size)
		{
			System.out.println("Invalid postion");
		}
		
		int searchIndex = size-postion;
		
		int i =1;
		
		Node currNode  = head;
		
		while(i<searchIndex)
		{
			currNode = currNode.next;
			i++;
		}
		
		currNode.next = currNode.next.next;
		size--;
		
		
	}




	private void printlist() {
		// TODO Auto-generated method stub
		if(head ==null) 
		{
			System.out.println("Node is Empty");
		
		}
		
		Node currhead  = head;
		
		while(currhead !=null)
		{
			System.out.print(currhead.data +"  ->");
			
			
			currhead = currhead.next;
		}
		System.out.println("NULL");
	}




	private void addLast(String data) {
		// TODO Auto-generated method stub
		Node newNode  = new Node(data);
	  if(head ==null)
	  {
		 head=  newNode; 
		 return ;
	  }
	  
	  Node currhead = head;
	  
	  while(currhead.next !=null)
	  {
		  currhead = currhead.next;
		
		  
	  }
	  
	  currhead.next = newNode;
	  size++;
	}




	private void AddFirst(String data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);
		if(head ==null)
		{
			head = newNode;
			 size++;    // ✅ Add size++ here
			return;
		}
		
		newNode.next = head;
		head  = newNode;
		  size++;
	}
	
}
