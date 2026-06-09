package LinkedList_REcurssion;

public class AddztwoLinledListUsingRecurrsion {
	
	
	
	static class ListNode {
	    int val;
	    ListNode next;

	    // Constructor to create a new node
	    ListNode(int val) {
	        this.val = val;
	        this.next = null;
	    }
	}
	
	
	
	private static ListNode addTwoNumbersUsingDummyNode(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub
		
		/*
		 * Dummy Node:

    The dummyNode is a helper node that helps simplify the construction of the result list. It acts as a placeholder to easily return the result later.

Traverse the Linked Lists (l1 and l2):

    Initialization: You start by initializing dummyNode and a curr pointer that will traverse the result linked list.
    While Loop: The loop continues as long as there are nodes in l1 or l2. This ensures that the entire length of the longer list is processed.

Sum the Digits:

    Inside the loop:
        The sum starts at 0 for each iteration.
        If l1 has a node, you add its value to the sum and move l1 to the next node.
        If l2 has a node, you add its value to the sum and move l2 to the next node.
        Add any carry from the previous iteration to the sum.

Update Carry:

    The carry is updated by taking the quotient of sum / 10, and the current node's value is the remainder of sum % 10.

Create New Node and Move Pointer:

    A new node is created with the digit corresponding to sum % 10, and it is added to the result linked list.
    The curr pointer is moved to the newly created node to continue building the list.

Check for Carry:

    After the loop ends, if there is still a carry (i.e., carry > 0), you create an additional node to store the carry value.

Return the Result:

    Finally, you return dummyNode.next because dummyNode is just a placeholder, and the actual result starts from the next node.
		 */
		
	    ListNode dummy = new ListNode(-1); 
	    ListNode  curr = dummy;
	    
	    int carry  =0;
	    
	    
	    while(l1!=null || l2!=null)
	    {
	    	int sum= 0;
	    	
	    	if(l1 !=null)
	    	{
	    		sum= sum+l1.val;
	    		
	    		l1 =l1.next;
	    	}
	    	
	    	if(l2 !=null)
	    	{
	    		sum= sum+l2.val;
	    		
	    		l2 =l2.next;
	    	}
	    	
	    	 sum = sum+carry;
	    	 
	    	 carry = sum/10;
	    	 
	    	 ListNode node  = new ListNode(sum %10);
	    	 
	    	 curr.next = node;
	    	 curr =curr.next;
	    	
	    	
	    	
	    }
	    
	    
	    if (carry > 0) {
            curr.next = new ListNode(carry);
        }
    	
		
		return dummy.next;
	}
	    
	    public static ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
			// TODO Auto-generated method stub
	    	
	    	/*
	    	 * 
	    	 * Recursive Function addTwoNumbers:

    This method takes three arguments: l1, l2 (the two linked lists), and carry (the carry from the previous addition).
    Base Case: When both lists are null and there's no carry, we return null, signaling the end of the result list.
    Recursive Case: We add the values of the current nodes (if available) along with the carry. We then create a new node to store the current digit (sum % 10) and recursively call addTwoNumbers for the next digits (pass the updated carry, which is sum / 10).

	    	 */
	    	
	    	if (l1 == null && l2 == null && carry == 0) {
	            return null;
	        }

	    	
	    	int sum = carry;
	    	
	    	
	    	if(l1!=null )
	    	{
	    		sum = sum+l1.val;
	    		
	    		l1 = l1.next;	
	    	}
	    	
	    	if(l2 !=null)
	    	{
	    		sum = sum +l2.val;
	    		l2 = l2.next;
	    	}
	    	
	    	 // Create a new node for the current digit (sum % 10)
	        ListNode currentNode = new ListNode(sum % 10); //O(max(n1, n2)
	    	
	    	
	        currentNode.next = addTwoNumbers(l1, l2 , sum/10); 
	        //Thus, the number of recursive calls will be the maximum length of the two linked lists, i.e., max(n1, n2).
	        //The recursion depth is equal to the number of nodes in the longer of the two linked lists (max(n1, n2)).
			return currentNode;
			
//Time Complexity (TC): O(max(n1, n2)) — Where n1 and n2 are the lengths of the two input linked lists.
//			Space Complexity (SC): O(max(n1, n2)) — Due to the recursion stack and the space needed to store the result.
		}
	    
	    public static void printList(ListNode head) {
	        ListNode curr = head;
	        while (curr != null) {
	            System.out.print(curr.val + " ");
	            curr = curr.next;
	        }
	        System.out.println();
	    }
	    
	    
	    
	    
	 public static void main(String[] args) {
	        // Creating first linked list: l1 = [1, 4, 3]
	        ListNode l1 = new ListNode(1);
	        l1.next = new ListNode(4);
	        l1.next.next = new ListNode(3);

	        // Creating second linked list: l2 = [5, 6, 4]
	        ListNode l2 = new ListNode(5);
	        l2.next = new ListNode(6);
	        l2.next.next = new ListNode(4);

	        // Create Solution object to call the addTwoNumbers method
	        
	        ListNode result = addTwoNumbers(l1, l2 ,0);
	        
	        ListNode result2 = addTwoNumbersUsingDummyNode(l1, l2);

	        // Print the result linked list
	        printList(result);  // Expected output: [7, 0, 8] (807 in reverse)
	        
	        printList(result2);
	    }

	

}


	
