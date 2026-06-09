package stack;

public class LinkedList {
	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			
			this.data = data;
			
		}
	}
		
		
		
	static class stack
	{
		static Node head;
		
		public static  boolean isEmpty()
		{
			return head ==null;	
		}
		
		public static void push(int daata)
		{
			Node newNode = new Node(daata);
			
			if(isEmpty())
			{
				head  =newNode;
				return;
			}
			
			newNode.next  =head;
			head = newNode;
			
			
		}
		
		
		public static int  pop()
		{
			if(isEmpty())
			{
				return -1; 
			}
			
			int top  = head.data;
			
			head = head.next;
			return top;
			
		}
		
		
		public static  int peek()
		{
			
			if(isEmpty())
				
			{
				return -1;
			}
			
			int top  = head.data;
			
			return top;
			
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
	stack.push(1);
	stack.push(2);
	stack.push(3);
	
	
	while(!stack.isEmpty())
	{
		System.err.println(stack.pop());
	}
		
	}
	
	
	
	

}
