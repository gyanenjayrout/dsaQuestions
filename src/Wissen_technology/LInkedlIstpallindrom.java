package Wissen_technology;



public class LInkedlIstpallindrom {
	static class Node
	{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next =null;
			// TODO Auto-generated constructor stub
		}
		
	}
	
	public static void main(String[] args) {

		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next = new Node(2);
		head.next.next=new Node(2);
		head.next.next.next = new Node(1);
		
		System.out.println(isPalindrome(head));
	}

	private static boolean isPalindrome(Node head) {
		// TODO Auto-generated method stub
		
	    Node middle = MiddleOFlinkedList(head);
	    
	    Node SeconHead = reverselinkedList(middle);
	    
	    
	    Node firstNode = head;
	    
	    while(SeconHead !=null)
	    {
	    	
	    	if(firstNode.data != SeconHead.data)
	    	{
	    		return false;
	    	}
	    	firstNode = firstNode.next;
	    	SeconHead = SeconHead.next;
	    }
		return true;
	}

	private static Node reverselinkedList(Node head) {
		// TODO Auto-generated method stub
		
		Node prev =  null;
		Node curr = head;
		
		while(curr !=null)
		{
			Node nextNode = curr.next;
			curr.next= prev;
			
			prev = curr;
			curr = nextNode;
			
		}
		
		return prev;
	}

	private static Node MiddleOFlinkedList(Node head) {
		// TODO Auto-generated method stub
		if(head==null) return null;
		
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
