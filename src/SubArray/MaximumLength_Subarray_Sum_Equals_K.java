package SubArray;
import java.util.*;
public class MaximumLength_Subarray_Sum_Equals_K {
	/*
	 * Problem: Find the length of the longest subarray whose sum equals k.
Approaches:


If you need to find the maximum subarray sum that equals K, the approach is similar to the
 "Subarray Sum Equals K" problem, but instead of 
counting occurrences, we track the maximum subarray length that satisfies the condition.
    HashMap + Prefix Sum:
    Tracks the first occurrence of a prefix sum and calculates the difference when sum - k is found.
	 */
	
	public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 4, 5};
        int k = 7;
        System.out.println("Maximum length of subarray with sum " + k + " = " + maxSubarrayLength(arr, k));
        
       int length = maxSubarrayLengthbrutforce(arr,k);
        System.out.println(length);
    }

	private static int maxSubarrayLengthbrutforce(int[] arr, int k) {
		// TODO Auto-generated method stub
		int maxlength =0;
		for(int i=0;i<arr.length;i++)
		{
			int sum =0;
			for(int j=i;j<arr.length;j++)
			{
				sum = sum+arr[j];
				
				if(sum==k)
				{
					maxlength = Math.max(maxlength, j-i+1);
				}
			}
		}
		return maxlength;
	}

	private static int maxSubarrayLength(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer>prefixIndex  = new HashMap<>();
		
		prefixIndex.put(0, -1);
		int maxlength =0;
		int prefixsum =0;
		
		for(int j=0;j<arr.length;j++)
		{
			
			prefixsum  += arr[j];
			
			if(prefixIndex.containsKey(prefixsum-k))
			{
				int  i = prefixIndex.get(prefixsum-k);
				//This line retrieves the earliest index i where (prefixSum - k) was first encountered.
				
				/*
				 * j - (i + 1) + 1 = j - i
				 */
				
				maxlength =  Math.max(maxlength, j-i);
			}
			/*
			 * This means that if prefixSum - k exists in the hashmap, then the 
			 * subarray from index i+1 to j has sum k
			 * 
			 * Why maxLength = Math.max(maxLength, j - i);?

Once we know that the subarray from (i+1 to j) sums to k, we update maxLength:
maxLength=max⁡(maxLength,j−i)
maxLength=max(maxLength,j−i)

    j - i gives the length of the subarray.

    We take the maximum length so far.
			 */
			
		
			prefixIndex.putIfAbsent(prefixsum ,j);
			
			//This ensures that we store only the first occurrence of a prefixSum (to maximize subarray length).
			
			
			
			
			
		}
		
		return maxlength;
	}

}
/*
 * 
 * Key Interview Takeaways

    Why store only the first occurrence of prefix[j]?

        To maximize the length of the subarray.
        
        🔍 Purpose of prefixIndex.put(0, -1)

This initialization handles the edge case where a subarray from index 0 to j has a sum equal to k.

Let’s understand it with a dry run.

    Why initialize {0: -1}?

        To handle cases where the subarray starts from index 0.
        Why prefixIndex.put(0, -1); is Used?
        
        int[] arr = {1, 2, 3};
int k = 6;

Prefix Sum at each step:
Index (j)	arr[j]	prefixSum	prefixSum - k	Exists?
   0	     1	     1	          -5	            ❌
   1	     2	     3            -3             	❌
   2	     3	     6	           0	    ✅ (yes, from prefixIndex.put(0, -1))
   
   i = prefixIndex.get(0) = -1;
length = j - i = 2 - (-1) = 3
        

This is a key trick in prefix sum problems. It ensures that we correctly handle cases
 where the subarray starting from index 0 itself sums to k.
 we  need to track lengths, just count valid subarrays
 
 🚀 Conclusion
Problem Type	                                Use {0: -1}?                      	Why?
Find max-length subarray with sum k          	✅ Yes                 	We need to track the starting index
Count subarrays with sum k	                      ❌ No                	We only care about counts, not lengths

    How is this different from counting subarrays?

        Instead of maintaining a count, we track the longest valid subarray.

This approach is highly efficient and is a common interview problem. 🚀

*/
