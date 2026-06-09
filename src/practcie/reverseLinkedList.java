package practcie;



public class reverseLinkedList {

	
static Node head;
	
	static class Node {
	    int val;
	    Node next;
	    Node(int val) { this.val = val; }
	}
	
	
	public static void main(String[] args) {
		
		Node head =  new Node(1);
		Node second =  new  Node(2);
		Node third =  new  Node(3);
		Node fourth =  new  Node(4);
		Node five =  new  Node(5);
		
		
		head.next = second;
		
		second.next = third;
		
		third.next = fourth;
		fourth.next = five;
		
		System.out.print("Original List: ");
        printLIst(head);

		head = reverALinkedList(head);
		printLIst(head);
		
		
	}


	private static Node reverALinkedList(Node head) {
		// TODO Auto-generated method stub
		
		Node prev = null;
		Node curr = head;
			
		while(curr !=null)
		{
			Node nextnode = curr.next;
			
			curr.next  =prev;
			
			prev = curr;
			curr =nextnode;
		}
		return prev;
	}
	
	
	public static  void printLIst(Node head)
	{
		Node curr = head;
		
		while(curr !=null)
		{
			
			System.out.print(curr.val +"->");
			curr =curr.next;
		}
		
		System.out.println("null");
	}
	
}
