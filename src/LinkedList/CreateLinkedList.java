package LinkedList;

public class CreateLinkedList {
	
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
	
	public void AddFirst( String data)
	{
		Node newnode = new Node(data);
		if(head== null)
		{
			head = newnode;
			return;
		}
		
		newnode.next = head;
		head = newnode;
	}
	
	public void addLast(String data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		Node currhead  = head;
		
		while(currhead.next !=null)
		{
			currhead = currhead.next;
		}
		currhead.next=newNode;
		
	}
	
	public void printlist()
	{	
		if(head == null)
		{
			System.out.println("List Is Empty");
			return;
		}
		
      Node currhead  = head;
		
		while(currhead != null)
		{
			 System.out.print(currhead.data + " -> ");
			currhead = currhead.next;
			size++;
		}
		
		  System.out.println("null");
	}
	
	public void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List Is Empty");
			return;
		}
		head=head.next;
		size--;
	}
	
	
	public void deleeteLast()
	{
		if(head==null)
		{
			System.out.println("List Is Empty");
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		
		Node LastNode = head;
		Node SecLastNode  = head.next;
		
		while(SecLastNode.next !=null)
		{
			SecLastNode = SecLastNode.next;
			LastNode = LastNode.next;
			
		}
		LastNode.next=null;
		size--;
		
	}
	
	public void deleteNthNode(int position )
	{
		if (head == null || position < 0 || position >= size) {
            System.out.println("Invalid Position");
            return;
        }
		
		int serachindex = size-position;
		
		
		int i=1;
		Node prev = head;
		while(i<serachindex)
		{
			prev= prev.next;
			i++;
		}
		
		prev.next =prev.next.next;
		size--;
//		return head;
	}
	
	public static void main(String[] args) {
		
		CreateLinkedList ll = new CreateLinkedList();
		
		ll.AddFirst("a");
		ll.AddFirst("is");
		ll.AddFirst("it");
//		ll.printlist();
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
		
		
		
	}
	
	

}
