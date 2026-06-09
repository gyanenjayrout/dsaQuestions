package Array;

import java.util.*;

public class NextGreaterEleemnt {
	
	public static void main(String[] args) {
		int[] arr = {4, 5, 2, 10, 8};
        int [] result  =nextGreaterElement(arr);
        
        System.out.println(Arrays.toString(result));
	}
/*
	private static int [] nextGreaterElement(int[] arr) {
		// TODO Auto-generated method stub
		
		
		 int n = arr.length;
		    int[] result = new int[n];
		    Arrays.fill(result, -1); // Fills the entire array with -1
		    for(int i=0;i<n;i++)
		    { 
		    	for(int j = i+1;j<n;j++)
		    	{
		    		if(arr[j]>arr[i])
		    		{
		    			result[i] = arr[j];
		    			break;
		    		}
		    		
		    		
		    	}
		    }
		  return result;  
		    
	}
	
	*/

	private static int[] nextGreaterElement(int[] arr) {
		// TODO Auto-generated method stub
		 int n = arr.length;
		 int[] result = new int[n];
		 
		 Stack<Integer> stack =  new Stack<>();
		 
		 for(int i=n-1;i>=0;i--)
		 {
			 
			 if(!stack.isEmpty()  && stack.peek()<=arr[i])
			 {
				 stack.pop();
			 }
			 
			 result[i] = stack.isEmpty()? -1: stack.peek();
			 
			 stack.push(arr[i]);
		 }
		
		return result;
	}

}

/*
 * Why Use a Monotonic Decreasing Stack?

    Efficiently Find Next Greater Element (NGE):

        If a new element is greater than the top of the stack, we pop elements until we find a larger one or the stack becomes empty.

        This ensures that the top of the stack is always the next greater element for incoming elements.

    Eliminates Unnecessary Comparisons:

        Each element is pushed only once and popped at most once, leading to O(N) time complexity.

Given arr = [4, 5, 2, 10, 8], let's use a monotonic decreasing stack to find the Next Greater Element (NGE) for each element.
Algorithm:

    Traverse the array from right to left.

    Maintain a monotonic decreasing stack (top element is always the closest greater element).

    While the stack is not empty and stack.peek() ≤ arr[i], pop the stack (since it's not useful anymore).

    If the stack is not empty, the top element is the next greater element for arr[i].

    Push arr[i] onto the stack.
 */
