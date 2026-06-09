package LinkedList;

public class FindNthNodeANDdelete {
	
	
	static Node head;
	
	static class Node
	{
		 int data;  // Data stored in the node
		 Node next; // Reference to the next node in the list

		    // Constructor to initialize the node with data
		    public Node(int data) {
		        this.data = data;
		        this.next = null;
		    }
	}
	
	
	
	
	static class LinkedList
	{
		
		
		public  static void addLast(int data)
		{
			
		Node newNode = new Node(data);
			if(head== null)
			{
				head  = newNode;
				return ;
			}
			
			
			Node curr  =head;
			
			while(curr.next !=null)
			{
				curr = curr.next;
			}
			
			curr.next = newNode;
		}
		
		
		
		
		public static void display()
		{
			if(head ==null)
			{
				return ;
			}
			
			Node currhead = head;
			
			while(currhead !=null)
			{
				System.out.print(currhead.data + " ->");
				currhead = currhead.next;
				
			}
			 System.out.println("null");
		}
		
		
		public Node removeNthFromEnd(Node head, int n) {
			
			if(head.next == null)
	        {
	            return null;
	        }

			
			int size =0;
			if(n==size)
	        {

	            // coz the nth node to be delete = size-n+1; (5-5+1)= 1 {1st node}
	            //it will be our 1st node;
	            //so head need to point to our next node
	            return head.next;
	        }
			Node currhead = head;
			
			while(currhead !=null)
			{
				currhead = currhead.next;
				size++;
			}
			
//			int i=0;
//			int indextosearch = size-n-1;
			
			int i=1;
			
			int indextosearch = size-n;
			
			
			Node prev  = head;
			
			while(i<indextosearch)
			{
				prev =prev.next;
				i++;
			}
			
			prev.next = prev.next.next;
			return head;
			
			
			
			
			
			
		}
	}
	
	
	
	
	
		
	
	
	public static void main(String[] args) {
		 LinkedList ll = new LinkedList();

	        System.out.println("After adding 1:");
	        ll.addLast(1);
	      

	        System.out.println("After adding 2:");
	        ll.addLast(2);
	      
	        System.out.println("After adding 3:");
	        ll.addLast(3);
	   
	        
	        ll.addLast(4);
	    
	        
	        ll.addLast(5);
	        ll.display(); // Output: 1 -> 2 -> 3 -> null
	        
	        ll.removeNthFromEnd(head, 2);
	        
	        ll.display();
	        
	    }
	

}
