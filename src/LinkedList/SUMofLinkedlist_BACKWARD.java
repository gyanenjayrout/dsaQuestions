package LinkedList;

/*
 * 2 -> 4 -> 3
5 -> 6 -> 4

represented:

342 + 465
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class SUMofLinkedlist_BACKWARD {

	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 
		 ListNode dummy = new ListNode(0);
		 ListNode current = dummy;
		 
		 int carry =0;
		 
		 while(l1.next !=null || l2.next != null || carry !=0)
		 {
			 
			 int sum = carry;
			 while(l1 !=null)
			 {
				 sum = sum+l1.val;
				 l1 = l1.next;
			 }
			 
			 while(l2 !=null)
			 {
				 sum = sum+l2.val;
			     l2 = l2.next;
			 }
			 
			 
			 int cary = sum/10;
			 
			 current.next = new ListNode(sum%10);
			 current = current.next;
		 }
		 
		 return dummy.next;
		 
	 }
	
}
