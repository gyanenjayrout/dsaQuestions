package SubArray;

import java.util.HashMap;
//count the total numbeer of subArray  of any length sum is equal to k from an array containg negetive numbers  
public class COuntSubarraySumEqual_to_k
 {
	
	public static void main(String[] args) {
		int arr [ ]= {1,0,1,2,1,0,4,1,3};
		
		int k = 4;
		int subarraySum = subarraySum(arr, k);
		
		System.out.println(subarraySum);
		/*    Subarray [1, 0, 1, 2] contributes 1 to the count.
    Subarray [0, 1, 2, 1] contributes 1 to the count.
    Subarray [0, 1, 2, 1, 0] contributes 1 to the count.
    Subarray [0, 4] contributes 1 to the count.
    Subarray [1, 3] contributes 1 to the count.

Additionally, there are 3 more occurrences that the algorithm counts:

    Subarray [0, 1, 2, 1] is a subarray of [0, 1, 2, 1, 0], so it's counted again.
    Subarray [1, 2, 1] is a subarray of [1, 0, 1, 2, 1, 0], so it's counted again.
    Subarray [2, 1] is a subarray of [1, 0, 1, 2, 1, 0], so it's counted again.*/
		
	}
	public static int subarraySum(int[] nums, int k) {
	
		int start  =0;
		int end =0;
		int count  =0;
		
		for(int i=0;i<nums.length;i++)
		{
			int sum  =0;
			
			for(int j =i;j<nums.length;j++)
			{
				sum  =sum+nums[j];
				
				
				if(sum ==k)
				{
					count++;
					start =i;
					end =j;
					System.out.println( " start: "+ start +" , end   : " + end);
					
				}
				
			}
		}
				
				
				
	return count;
	
	}

	/*
	
	public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;

        // HashMap to store the frequency of each prefix sum
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // Initialize with sum 0 to count subarrays starting from index 0
        //if If the sum at current index is exactly k, then:

//    sum - k = 0
//
//    So, if we have prefix sum 0 recorded in the map → it contributes to a valid subarray

        for (int num : nums) {
            sum += num; // Cumulative sum up to the current index

            // Check if (sum - k) exists in the map
            if (prefixSumMap.containsKey(sum - k)) {
                count += prefixSumMap.get(sum - k); // Add the count of prefix sums that satisfy the condition
            }

            // Update the frequency of the current sum in the map
            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }

        return count; // Return the total count of subarrays with sum equal to k
    }
    */

}
