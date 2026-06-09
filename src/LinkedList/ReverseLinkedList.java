package LinkedList;

public class ReverseLinkedList {
	
	static Node head;
	
	static class Node {
	    int val;
	    Node next;
	    Node(int val) { this.val = val; }
	}
	
	
	/*Why newheadNode = 4?

    In the first recursive call (with head = 1), reverseUsingRecursion(head.next) ultimately returns the last node of the original list as the new head.
    In the deepest recursion (when head = 4), the function simply returns head because it's the last node, and the recursion unwinds by reversing the links
     while returning the original last node (4), which will be the new head of the reversed list.
    Each call returns the same newheadNode (which is 4) upwards, ensuring that the last node of the original list is always returned as the head of the reversed list.

Final Answer:
After all the recursive calls unwind, the new head of the reversed list is always 4, which is the first node that was returned in the base case (from the last node).
	
*/


	public static Node reverseUsingREcurssion(Node head) {
	    // Base case: if head is null or there is only one node, return head
	    if (head == null || head.next == null) {
	        return head;
	    }

	    // Recursive call to reverse the rest of the list
	    Node newheadNode = reverseUsingREcurssion(head.next);

	    // Reverse the current node's pointer
	    head.next.next = head;  // Make the next node point back to the current node{ 5.next = 4 (Reverse the pointer) }
	    head.next = null;       // Set the current node's next pointer to null to avoid cycle  { 4.next = null (Break the old link) }
	    
	 

	    // Return the new head of the reversed list
	    return newheadNode;
	}
	
	public static Node reverseUsingIteration(Node head) {
	    if (head == null || head.next == null) {
	        return head;  // No need to reverse if list is empty or has only one node
	    }

	    Node prev = head;       // Start prev as head
	    Node currhead = head.next; // Start currhead as the node after head
	    head.next = null;       // Set the original head's next to null to mark the end of the reversed list

	    while (currhead != null) {
	        Node nexthead = currhead.next;  // Save the next node
	        
	        currhead.next = prev;           // Reverse the pointer of the current node to point to prev

	        // Move prev and currhead one step forward
	        prev = currhead;
	        currhead = nexthead;
	    }

	    // After the loop, prev is the new head of the reversed list
	    head = prev;
	    return head;
	}

	
	public static void printlinkedlIst(Node head)
	{
		
		if(head ==null)
		{
			return;
		}
		
		Node currhead = head;
		
		while(currhead !=null)
		{
			System.out.print(currhead.val +"->");
			currhead = currhead.next;
		}
		
		System.out.println("null");
		
	}
	
	
//	/
	/*
	
	Algorithm Steps:

    Find the Middle Node:
        Use the slow and fast pointer technique to find the middle. When the fast pointer reaches the end, the slow pointer will point to the middle of the list.
        For 1 -> 2 -> 3 -> 2 -> 1, the middle is 3.

    Reverse the Second Half:
        Reverse the portion of the list starting after the middle.
        Original list: 1 -> 2 -> 3 -> 2 -> 1
        After reversal: 1 -> 2 -> 3 <- 2 <- 1

    Compare First Half with Reversed Second Half:
        Start comparing nodes from the head and the reversed second half.
        For odd-length lists, the middle element (3 in this case) is ignored because it doesn't affect the palindrome property.

What Happens to 3?

When comparing the two halves:

    The first half is 1 -> 2.
    The reversed second half is also 1 -> 2.
    The middle node (3) is skipped because it naturally separates the two halves.

Example Walkthrough:

For the list 1 -> 2 -> 3 -> 2 -> 1:

    Find the middle:
        Slow pointer at 3 (middle).

    Reverse second half:
        Original second half: 2 -> 1
        Reversed: 1 -> 2

    Compare halves:
        First half: 1 -> 2
        Reversed second half: 1 -> 2
        Compare:
            1 == 1 → Match
            2 == 2 → Match

Since all comparisons match, the list is a palindrome.
	
	*/
	
	public static void main(String[] args) {
		Node head   = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		
		printlinkedlIst(head);
		
		head = reverseUsingREcurssion(head);
		
		printlinkedlIst(head);
		
		
		head = reverseUsingIteration(head);
	    System.out.println("List after iterative reversal:");
	    printlinkedlIst(head);
	}

}
