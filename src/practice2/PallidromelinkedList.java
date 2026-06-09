package practice2;

/*1->2->3->2>1->null
 
 
 1->2->3->2<-1
          |
         \ /
         null

*/
import java.util.*;
public class PallidromelinkedList {
	
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
	
	public static boolean isPalindrome(Node head)
	{
		
		Node middleNode = findMiddle(head);
		Node sechalfFirst = reveerse(middleNode.next);
		
		
		Node currhead = head;
		
		
		while(sechalfFirst !=null)
		{
			if(currhead.data !=sechalfFirst.data )
			{
				return false;
			}
			currhead = currhead.next;
			sechalfFirst =sechalfFirst.next;
		}
		
		return true;
		
	}
	
	private static Node reveerse(Node head) {
		// TODO Auto-generated method stub
		if(head ==null || head.next==null)
		{
			return head;
		}
		
		Node prev = null;
		
		Node curr  =head;
		while(curr !=null)
		{
			Node currnext = curr.next;
			
			curr.next=  prev;
			
			prev =curr;
			curr =currnext;
		}
		
		
		return prev;
	}

	private static Node findMiddle(Node head) {
		// TODO Auto-generated method stub
		
		if(head ==null || head.next==null)
		{
			return head;
		}
		
		Node slow  = head;
		Node fast = head;
		
		
		while(fast !=null && fast.next!=null)
		{
			slow = slow.next;
			fast  =fast.next.next;
		}
		
		return slow;
	}

	/*
	public static boolean isPalindrome(Node head)
	{
		if(head == null)
		{
			System.out.println("empty");
		}
		
		List<Integer> list =  new ArrayList<Integer>(); 
		
		if(head.next ==null)
		{
			System.out.println(head.data);
			
		}
		
		
		Node currhead =head;
		while(currhead!=null)
		{
			list.add(currhead.data);
			currhead = currhead.next;
		}
		
		int left = 0;
		int right = list.size()-1;
		
		while(left<right)
		{
			
			if(!list.get(left).equals(list.get(right)))
			{
				return false;
			}
			
			left++;
			right--;
			
		}

		return true;
		
//		List<Integer> reversed = new ArrayList<>(list);
//        Collections.reverse(reversed); // Reverse the list
        
//        return list.equals(reversed);

	}
	
	*/
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next = new Node(2);
		head.next.next=new Node(2);
		head.next.next.next = new Node(1);
		
		System.out.println(isPalindrome(head));
	}
	
	

}
