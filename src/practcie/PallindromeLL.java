package practcie;


public class PallindromeLL {
	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data) {
			// TODO Auto-generated constructor stub
			
			this.data = data;
			
		}
	}
	
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next = new Node(2);
		head.next.next=new Node(1);

		
		System.out.println(isPalindrome(head));

	}


	private static boolean isPalindrome(Node head) {
		// TODO Auto-generated method stub
		 // Edge case: If list is empty or has one node, it's a palindrome
        if (head == null || head.next == null) {
            return true;
        }

		
		Node middle = findmiddle(head); // end of the 1st half
		
		Node sechalffast = reversse(middle.next);
		
		Node firsthalfstart = head;
		while(sechalffast !=null)
		{
			if(firsthalfstart.data != sechalffast.data)
			{
				return false;
			}
			firsthalfstart =  firsthalfstart.next;
			sechalffast = sechalffast.next;
		}
		
		
				
		return true;
	}
	
	


	private static Node reversse(Node head) {
		// TODO Auto-generated method stub
		
		if(head ==null || head.next ==null)
		{
			return head;
		}
		
		Node prev = null;
		Node curr = head;
		
		while(curr !=null)
		{
			Node nextznode = curr.next;
			
		 curr.next = prev;
		 
		 prev = curr;
		 curr= nextznode;
		}
		
		
		
		return prev;
	}


	private static Node findmiddle(Node head) {
		
		Node slow= head;
		Node fast = head;
		
		while(fast.next !=null && fast.next.next !=null)
			
			
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		
		// TODO Auto-generated method stub
		return slow;
	}

}
