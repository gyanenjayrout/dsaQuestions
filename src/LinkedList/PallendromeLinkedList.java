package LinkedList;
/*
 * 📊 Key Differences at a Glance:
Condition	                                                      Use Case	                                          Why It Works
while(faster.next != null && faster.next.next != null)	    Finding the middle of a linked list	           Ensures fast can move two steps safely. 
                                                                                                         Stops when fast reaches the end.
                                                                                                         
while(fast != null && fast.next != null)	                Detecting a cycle in a linked list	      Ensures fast moves safely without null access.
                                                                                                        Stops if a cycle is found.
 */
import java.util.*;
public class PallendromeLinkedList {
	
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
	
	
//	  public static boolean isPalindrome(Node head) {
//		  
//		  
//		   StringBuilder sb = new  StringBuilder(); 
//		   Node current = head;
//		   while(current!=null)
//		   {
//			   sb.append(current.data);
//			   current = current.next;
//		   }
//		   
//		   String original = sb.toString();
//		   String reverString = sb.reverse().toString();
//		   
//		   return original.equals(reverString);
//		   
//		   
//		   
//	  }
	
	
	
//	public static boolean isPalindrome(Node head)
//	{
//		List<Integer> list = new ArrayList<>();
//		
//		Node current = head;
//		while(current !=null)
//		{
//			list.add(current.data);
//			current = current.next;
//		}
//		
//		int start = 0;
//		int end = list.size()-1;
//		
//		while(start<end)
//		{
//			if(!list.get(start).equals(list.get(end)))
//			{
//				return false;
//			}
//			start++;
//			end--;
//		}
//		return true;
//	}
	
	
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(1);
		
		System.out.println(isPalindrome(head));  // Output: true
	}

	private static boolean isPalindrome(Node head) {
		Node middle = MiddleOFlinkedList(head);
		Node secondHead = reverselinkedList(middle);
		
		Node firstNode = head;
		while (secondHead != null) {
			if (firstNode.data != secondHead.data) {
				return false;
			}
			firstNode = firstNode.next;
			secondHead = secondHead.next;
		}
		return true;
	}

	private static Node reverselinkedList(Node head) {
		Node prev = null;
		Node curr = head;
		while (curr != null) {
			Node nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
	}

	private static Node MiddleOFlinkedList(Node head) {
		if (head == null) return null;
		
		Node slow = head;
		Node fast = head;
		/*
		 * You should first check fast != null, then fast.next != null,
because if fast is already null, fast.next will give NullPointerException.
		 */
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
