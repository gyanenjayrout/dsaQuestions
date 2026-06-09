package LinkedList;



public class MergeTwoSortedLists {
	
	static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
	
	public static ListNode  createLinkedList(int [] arr)
	{
		if( arr.length ==0)
		{
			return null;
		}
		
		ListNode head = new ListNode(arr[0]);
		
		ListNode currhead =  head;
		
		for(int  i=1;i<arr.length;i++)
		{
			currhead.next = new ListNode(arr[i]);
			currhead  =currhead.next;
					
		}
		
	return head;
		
		
	}
	
	
	private static void printLinkedList(ListNode head) {
		// TODO Auto-generated method stub
		ListNode currhead  =  head;
		
		while(currhead !=null)
		{
			
			System.out.print(currhead.val + "->") ;
			currhead = currhead.next;
		}
		System.out.println("null");
	}
	
	
	private static ListNode mergerTwoLinkedList(ListNode l1, ListNode l2) {
		// TODO Auto-generated method stub
		
		ListNode  dummy  = new ListNode(-1);
		
		ListNode  currhead = dummy;
		
		while(l1 !=null && l2 !=null)
		{
			if(l1.val<l2.val)
			{
				currhead.next = l1;
				
				l1 = l1.next;
				/*
				 * We only attached the current node, not the rest of the list separately.

Next iteration, we need to pick the next node.
				 */
			}else 
			{
				currhead.next = l2;
				
				l2 = l2.next;
			}
			
			currhead = currhead.next;
		}
		
		if(l1 !=null)
		{
			currhead.next = l1;
			
			/*
			 * Here, we are attaching all remaining nodes at once.

currhead.next = l1 automatically links the rest of the list.

We do NOT advance l1 = l1.next because we want to attach the entire tail, not just one node.
			 */
		}
		else
		{
			currhead.next = l2;
		}
		
		return dummy.next;
	}

	

	
	public static void main(String[] args) {
		int[] list1Values = {1, 2, 4};
        int[] list2Values = {1, 3, 4};

        // Create two linked lists directly from arrays
        ListNode list1 = createLinkedList(list1Values);
        ListNode list2 = createLinkedList(list2Values);
        
        System.out.println("List 1: ");
        printLinkedList(list1);
        System.out.println();

        System.out.println("List 2: ");
        printLinkedList(list2);
        
        
         ListNode mergedLsit =  mergerTwoLinkedList(list1, list2);
         System.out.println();
         
         printLinkedList(mergedLsit);

	}


	

	

}
