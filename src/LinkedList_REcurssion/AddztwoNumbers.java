package LinkedList_REcurssion;

import java.util.Iterator;
import java.util.LinkedList;


/*
 * Key Differences
Approach	Time Complexity      	       Space Complexity	                   Explanation
Brute Force	 O(n+m)O(n+m)         	       O(n+m)O(n+m)	Converts           linked lists to integers, adds them, and converts back to a linked list.
Optimal	     O(max⁡(n,m))O(max(n,m))        O(max⁡(n,m))O(max(n,m))	       Adds digits directly while keeping track of the carry, avoiding the need for integer conversion.
 */
public class AddztwoNumbers {
	
	public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
		
		
		Iterator<Integer> it1 = l1.iterator();
		Iterator<Integer> it2 = l2.iterator();
		
		 LinkedList<Integer> result = new LinkedList<>();
		
		int carry = 0;
		
		while(it1.hasNext() || it2.hasNext() || carry>0)
		{
			int sum =carry;
			
			if(it1.hasNext())
			{
				sum = sum+ it1.next();
			}
			
			if(it2.hasNext())
			{
				sum  =sum+it2.next();
			}
			
			carry =sum/10;
			
			result.add(sum%10);
//			if sum = 10
			//Update carry: carry = sum / 10 = 10 / 10 = 1 (Carry is 1).
             //Add current digit to result: result.add(sum % 10) = result.add(10 % 10) = result.add(0).
			
		}
		
		
		return  result;
	}
	
/*
	    // Method signature for solving the problem
	    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
	    	
	    	//convertion of Linkedlist to number
	    	
	    	int num1= 0;
	    	int num2 = 0;
	    	int sum =0;
	    	int multiplier =1;
	    	
	    	for(int digit : l1)
	    	{
	    	 	num1 = num1+digit *multiplier;
	    	 	
	    	 	multiplier  = multiplier*10;
	    	 	
	    	 	
	    	}
	    	
	    	System.out.println(num1);
	    	multiplier = 1; // Reset multiplier for the second list
	    	
	    	for(int digit : l2)
	    	{
	    	 	num2 = num2+digit *multiplier;
	    	 	
	    	 	multiplier  = multiplier*10;
	    	 	
	    	 	
	    	}
	    	System.out.println(num2);
	    	
	    	sum = num1+num2;
	    	
	    	// Convert the sum back into a linked list
	        LinkedList<Integer> result = new LinkedList<>();
	        
	        
	        if(sum==0)
	        {
	        	result.add(0);
	        }
	        else
	        {
	        	while(sum>0)
	        	{
	        		result.add(sum%10);
	        		sum = sum/10;
	        	}
	        }
	    	
	    	
	    	
	    	
	    	
	    	
	        // Implementation to be done here
	        return result; //[2, 4, 3, 5, 6, 4]
	    }
	    
	    */
	    
	    public static void main(String[] args) {
	        // Create two linked lists for the input numbers
	        LinkedList<Integer> l1 = new LinkedList<>();
	        LinkedList<Integer> l2 = new LinkedList<>();

	        // Add elements to the first linked list
	        l1.add(2);
	        l1.add(4);
	        l1.add(3);

	        // Add elements to the second linked list
	        l2.add(5);
	        l2.add(6);
	        l2.add(8);

	        // Call the method to add the two numbers
	        LinkedList<Integer> result = addTwoNumbers(l1, l2);

	        // Print the result
	        System.out.println(result);
	    }
	}
