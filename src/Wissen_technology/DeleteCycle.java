package Wissen_technology;

import LinkedList.Deletecycleinalinkedlist;
//import LinkedList.Deletecycleinalinkedlist.ListNode;

//import LinkedList.Deletecycleinalinkedlist.ListNode;

//import LinkedList.Deletecycleinalinkedlist.ListNode;

//import LinkedList.Deletecycleinalinkedlist.ListNode;

public class DeleteCycle {
	  // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    public static void main(String[] args) {
    	// Example linked list with a cycle
        ListNode head = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creates a cycle
        DeleteCycle solution = new DeleteCycle();
        ListNode cycleStart = solution.detectCycle(head);

        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }
        
        solution.removeCycle(head);
        if (solution.detectCycle(head) == null) {
            System.out.println("Cycle successfully removed.");
        } else {
            System.out.println("Cycle not removed.");
        }
	}
    public ListNode detectCycleMeetingPoint(ListNode head) {
    	if(head ==null) return null;
    	
    	ListNode slow = head;
    	ListNode fast = head;
    	
    	while(fast!=null && fast.next !=null)
    	{
    		slow= slow.next;
    		fast = fast.next.next;
    		if(slow == fast)
        	{
        		return slow;
        	}
    	}
    	
    	return null;
    }
    
  
    
    public ListNode detectCycle(ListNode head)
    {
    	if(head ==null)
    	{
    		return null;
    	}
    	
    	ListNode meetingpoint = detectCycleMeetingPoint( head);
    	
    	if(meetingpoint ==null)
    	{
    		return null;
    	}
    	
    	  ListNode start = head;
    	
    	while(start !=meetingpoint)
    	{
    		start = start.next;
    		meetingpoint = meetingpoint.next;
    	}
    	
    	return start;
    }
    
    public void removeCycle(ListNode head) {
    	
    	ListNode cycleStart = detectCycle(head);
    	
    	  if (cycleStart == null) {
              // No cycle detected, nothing to remove
              return;
          }
    	ListNode ptr = cycleStart;
    	
    	while(ptr.next!=cycleStart)
    	{
    		ptr = ptr.next;
    	}
    	
    	ptr.next =null;
    	
    }
}
