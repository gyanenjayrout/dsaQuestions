package practcie;



public class Deletecycleinalinkedlist {
	
	static class ListNode
	{
		int data;
		ListNode next;
		
		public ListNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
			
		}

		
	}
	
	private ListNode detectCycle(ListNode head) {
		// TODO Auto-generated method stub
		
		if(head ==null)
		{
			return null;
		}
		
		ListNode meet = detectCycleMeetingPoint(head);
		
		 // If there is no cycle, return null
        if (meet == null) {
            return null;
        }

        // Move one pointer from the head and one from the meeting point
        ListNode start = head;
        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        return start;
	}
	
	private ListNode detectCycleMeetingPoint(ListNode head) {
		// TODO Auto-generated method stub
	ListNode slow = head;
	ListNode  fast = head;
	
	while(fast !=null && fast.next!=null)
	{
		fast=  fast.next.next;
		slow = slow.next;
		 // If they meet, there is a cycle
        if (slow == fast) {
            return slow;
        }
	}
	
		return null;
	}
	
	public void deletecycle(ListNode head) {
		// TODO Auto-generated method stub
		ListNode cycleStart =  detectCycle(head);
		
		if (cycleStart == null) {
            // No cycle detected, nothing to remove
            return;
        }

	ListNode ptr =  cycleStart;
	
	while(ptr !=cycleStart)
	{
		ptr = ptr.next;
	}
	
	ptr.next = null;
	}
	

	public static void main(String[] args) {
		
				ListNode head =  new ListNode(1);
		ListNode second  = new ListNode(2);
		ListNode third  = new ListNode(3);
		ListNode fourth  = new ListNode(4);
		ListNode five  = new ListNode(5);
		
		
		head.next = second;
		second.next = third;
		
		third.next = fourth;
		fourth.next =five;
		five.next = second;
		Deletecycleinalinkedlist ll = new Deletecycleinalinkedlist();
		
		ListNode cycleStart  = ll.detectCycle(head);
		
		 if (cycleStart != null) {
	            System.out.println("Cycle starts at node with value: " + cycleStart.data);
	        } else {
	            System.out.println("No cycle detected.");
	        }
		 
		 
		ll.deletecycle(head);
		
		ll.deletecycle(head);

        if (ll.detectCycle(head) == null) {
            System.out.println("Cycle successfully removed.");
        } else {
            System.out.println("Cycle not removed.");
        }
	}

	

}
