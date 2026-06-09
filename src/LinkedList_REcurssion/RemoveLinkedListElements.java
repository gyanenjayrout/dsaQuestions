package LinkedList_REcurssion;



public class RemoveLinkedListElements {
	
	static class ListNode {
	    int val;
	    ListNode next;

	    // Constructor to create a new node
	    ListNode(int val) {
	        this.val = val;
	        this.next = null;
	    }
	}
	
	
    public static ListNode removeElements(ListNode head, int val) {
    	/*
    	if(head ==null)
    		return null;
    	
    	
    		
    	head.next = removeElements(head.next, val);
    	
    	if(head.val ==val)
    	{
    		return head.next;
    	}
    	else
    	{
    		return head;
    	}
    	
    	*/
    	
    	while(head !=null && head.val ==val)
    	{
    		head = head.next;
    	}
    	if(head ==null)
    	{
    		return null;
    	}
    	
    	ListNode curr = head;
    	
    	while(curr !=null && curr.next !=null)
    	{
    		if(curr.next.val ==val)
    		{
    			curr.next = curr.next.next;
    		}
    		else
    		{
    			curr = curr.next;
    		}
    		
    	}
    	
    	return head;
    	
    	

    }
    
 // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
    
    public static void main(String[] args) {
		
    	// Creating the linked list [1, 2, 6, 3, 4, 5, 6]
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(6);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(4);
        ListNode sixth = new ListNode(5);
        ListNode seventh = new ListNode(6);

        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        // Value to remove
        int val = 6;

        // Print original list
        System.out.println("Original List:");
        printList(head);

        // Remove nodes with value 'val'
        ListNode updatedHead = removeElements(head, val);

        // Print updated list
        System.out.println("\nUpdated List after removing " + val + ":");
        printList(updatedHead);
    }
	
}
	
	
	


