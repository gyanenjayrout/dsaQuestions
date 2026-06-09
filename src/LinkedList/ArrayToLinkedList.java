package LinkedList;

public class ArrayToLinkedList {
  Node head;
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
	
	 public void arrayToLinkedList(int[] arr) 
	 {
		 for(int num:arr)
		 {
			 arrlast(num);
		 }
	 }
	
	
	private void arrlast(int num) {
		// TODO Auto-generated method stub
		Node newNode = new Node(num);
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		newNode.next=head;
		head =newNode;
		
	}
	
	public void printlist()
	
	{
		if(head == null)
		{
			
			return;
		}
		
		Node curr = head;
		
		while(curr !=null)
		{
			System.out.println(curr.data);
			curr = curr.next;
		}
	}


	public static void main(String[] args) {
		ArrayToLinkedList ll = new ArrayToLinkedList();
		int[] arr = {1, 2, 3, 4, 5};
		
		ll.arrayToLinkedList(arr);
		ll.printlist();
	}

}
