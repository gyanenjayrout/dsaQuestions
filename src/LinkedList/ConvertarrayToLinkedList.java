package LinkedList;

public class ConvertarrayToLinkedList {
	
	
	 static class ListNode {
	    int val;
	    ListNode next;

	    ListNode() {}

	    ListNode(int val) { 
	        this.val = val; 
	    }

	    ListNode(int val, ListNode next) { 
	        this.val = val; 
	        this.next = next; 
	    }
	}
	
	public static ListNode arrayToLinkedList(int[] arr) {
        ListNode dummy = new ListNode(-1); // Temporary node to start the list
        ListNode current = dummy;

        for (int value : arr) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next; // Return the actual head
    }

	
	
	
	public static void main(String[] args) {
        int[] list1 = {1, 2, 4};
        int[] list2 = {1, 3, 4};

        // Convert arrays to linked lists
        ListNode linkedList1 = arrayToLinkedList(list1);
        ListNode linkedList2 = arrayToLinkedList(list2);

        // Print the linked lists
        printLinkedList(linkedList1);
        printLinkedList(linkedList2);
    }
	
	public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}
