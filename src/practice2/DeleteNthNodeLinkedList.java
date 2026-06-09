package practice2;



public class DeleteNthNodeLinkedList {
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
		
		public static void addLast( int data)
		{
			Node newnode  = new Node(data);
			
		    if(head ==null)
		    {
		    	head = newnode;
		    	return;
		    }
		    
		    Node currhead  = head;
		    
		    while(currhead.next !=null)
		    {
		    	currhead =currhead.next;
		    }
		    
		    currhead.next = newnode;
		}

		
		public static void display()
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
		
		public static void Addfast(int data)
		{
			Node newnode  = new Node(data);
			if(head ==null)
			{
				head =  newnode;
			}
			
			newnode.next = head;
			head = newnode;
			
			return ;
		}
		
		
		public static  void removeNthFromEnd(Node head, int n)
		{
			if(head ==null)
			{
				return;
			}
			
			int size =0;
			
			Node currhead = head;
			
			while(currhead !=null)
			{
				currhead = currhead.next;
				size++;
			}
			
			//1->2->3->4->5
			
			int indextosearch= size -n;
			
			int i =1;
			
			Node prev = head;
			while(i<indextosearch)
			{
				prev  =prev.next;
				i++;
			}
			
			prev.next = prev.next.next;	
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		

        
        LinkedList.addLast(1);
      

      
        LinkedList.addLast(2);
      
        
        LinkedList.addLast(3);
   
        
        LinkedList.addLast(4);
    
        
        LinkedList.addLast(5);
        LinkedList.display(); // Output: 1 -> 2 -> 3 -> null
        
        LinkedList.removeNthFromEnd(head, 2);
        
        LinkedList.display();
        
		
	}
	

}
