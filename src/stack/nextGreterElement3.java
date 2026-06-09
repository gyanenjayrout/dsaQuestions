package stack;

import java.util.*;

public class nextGreterElement3 {
	
	public static void main(String[] args) {
		int []arr=  {5 ,6, 3, 2, 1};
		
		int result [] = findNextGreaterElemnt(arr);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] findNextGreaterElemnt(int[] arr) {
		// TODO Auto-generated method stub
		
		 int n = arr.length;
		    int[] result = new int[n];
		    Stack<Integer> stack = new Stack<>();
		 
//        for (int i = 0; i < n; i++) {
//          result[i] = -1;
//          // Brute force search
//          for (int j = 1; j < n; j++) {
//              int index = (i + j) % n; // Circular index
//              if (arr[index] > arr[i]) {
//                  result[i] = arr[index];
//                  break;
//              }
//          }
//      }
		    
		    Arrays.fill(result, -1);
		    
		    for (int i = 0; i < 2 * n; i++) {
		        while (!stack.isEmpty() && arr[stack.peek()] <= arr[i % n]) {
		            result[stack.pop()] = arr[i % n];
		        }
		        if (i < n) {
		            stack.push(i);
		        }
		    }
		
		

		return result;
	}
	

}

/*
 * 
 * 
 *  {5 ,6, 3, 2, 1};
 * Step 2: Iterate Twice Over Array

We iterate twice (i = 0 to 9) and use i % n to handle circular behavior.
Iteration (i)	i % n	arr[i % n]	Stack Before	Stack After	                   Result After Change
0	              0	     5	          []	             [0]	                      [-1, -1, -1, -1, -1]
1	              1      6	          [0]	             [1] (pop 0)                   [6,  -1, -1, -1, -1]
2	              2	     3	          [1]	             [1, 2]     	               [6, -1, -1, -1, -1]
3	              3	     2	         [1, 2]	            [1, 2, 3]	                   [6, -1, -1, -1, -1]
4	              4      1	        [1, 2, 3]	        [1, 2, 3, 4]                   	[6, -1, -1, -1, -1]
5	              0 	 5	      [1, 2, 3, 4]	        [1, 2, 5] (pop 4, 3)	         [6, -1, 5, 5, 5]
6	              1	     6	         [1, 2, 5]	         [1, 2, 5, 6]	                [6, -1, 5, 5, 5]
7	              2	     3	        [1, 2, 5, 6]	    [1, 2, 5, 6, 2]	                  [6, -1, 5, 5, 5]
8	              3      2        	[1, 2, 5, 6, 2]    	[1, 2, 5, 6, 2, 3]	             [6, -1, 5, 5, 5]
9	               4	 1	      [1, 2, 5, 6, 2, 3]	 [1, 2, 5, 6, 2, 3, 4]	           [6, -1, 5, 5, 5]

*/
