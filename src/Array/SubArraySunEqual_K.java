package Array;
import java.util.*;
public class SubArraySunEqual_K {
	/*
	 * Problem: Find the total number of subarrays whose sum equals a given value k.
Approaches:

    HashMap + Prefix Sum (handles negative values):
    Tracks cumulative sums (prefixSum) and checks if prefixSum - k exists.
    Sliding Window (only for positive values):
    Uses a two-pointer approach to adjust the window size dynamically.
    
    we are going take presfixsum arary and calclate the prefix sum 
	 */
	
	
	public static void main(String[] args) {
int arr [ ]= {1,0,1,2,1,0,4,1,3};
		int []arr2 = {1,2,3,4,5};
		
		
		int k = 4;
		int subarraySum = subarraySum(arr, k);
		
		int subarraySum2 = subarraySum(arr2, 7);
		
		System.out.println(subarraySum);
		System.out.println(subarraySum2);
	}

	private static int subarraySum(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        prefixSumMap.put(0, 1); // To handle cases where prefixSum == k

        int count = 0, prefixSum = 0;

        for (int num : arr) {
            prefixSum += num;

            // Check if there exists a subarray sum = k
            if (prefixSumMap.containsKey(prefixSum - k)) {
                count += prefixSumMap.get(prefixSum - k);
            }

            // Store current prefixSum in map
            prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
	}

//	private static int subarraySum(int[] nums, int k) {
//		// TODO Auto-generated method stub
//		int count =0;
//		int start  =0;
//		int end =0;
//		for(int i=0;i<nums.length;i++)
//		{
//			
//			int sum  =0;
//			for(int j =i;j<nums.length;j++)
//			{
//				 sum = sum+nums[j];
//				
//				if(sum ==k)
//				{
//					count++;
//				}
//			}
//		}
//		
//		return count;
//	}

}
