package SubArray;

import java.util.Arrays;

//return the sum of maximm subArray of size k
public class MaximumSumSubarrayofSizeK {
	
	
	public static void main(String[] args) {
		int arr [] = {2, 1, 5, 1, 3, 2}, K = 3;
		 
		// output : 9 
		// max sub array of size k = [5,1,3]
		
		int maximumSubArrySmk = maximumSubArrySmvalue(arr, K);
		
		int[] maximumSubArry = maximumSubArrySizek(arr, K); 
		
		System.out.println(maximumSubArrySmk);
		
		System.out.println(Arrays.toString(maximumSubArry));
		
		
	}
	
	private static int maximumSubArrySmvalue(int[] arr, int k) {
		// TODO Auto-generated method stub
	/* brutforce	
		int maxsum =  Integer.MIN_VALUE;
		
		for(int i=0;i<=arr.length-k;i++)
		{
			
			int currsm = 0;
			
			for(int j= i;j<i+k;j++)
			{
				currsm  = currsm+arr[j];
			}
			
			maxsum = Math.max(maxsum, currsm);
			
		}
		
		
		return maxsum;
		
		*/
		
		int maxSum = Integer.MIN_VALUE; // Track the maximum sum
	    int currentSum = 0;            // Current window sum
	    int start = 0;                 // Start index of the current window

	    // Compute the sum of the first window
	    for (int i = 0; i < k; i++) {
	        currentSum += arr[i];
	    }
	    maxSum = currentSum;

	    // Slide the window
	    for (int end = k; end < arr.length; end++) {
	        currentSum += arr[end] - arr[start];
	        start++;

	        // Update the maximum sum
	        if (currentSum > maxSum) {
	            maxSum = currentSum;
	        }
	    }

	    return maxSum;
	}
 
	
	

	private static int[] maximumSubArrySizek(int[] arr, int k) {
		// TODO Auto-generated method stub
		int maxsum =  Integer.MIN_VALUE;
		
		int start =0;
		
		for(int i=0;i<=arr.length-k;i++)
		{
			
			int currsm = 0;
			
			for(int j= i;j<i+k;j++)
			{
				currsm  = currsm+arr[j];
			
				
			}
			
			if(currsm>maxsum)
			{
				maxsum =currsm;
				start = i;
			}
			
		}
		/*
		 * Time Complexity

       Brute-force approach: O(n×k)
        Outer loop runs O(n−k+1)
        Inner loop calculates the sum of subarrays in O(k)
		 */
		
		int[] result=  new int [k];
		for(int i=0;i<result.length;i++)
		{
			result[i]= arr[start+i];
		}
		return result;
	}

	

}
