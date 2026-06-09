package Array;

import java.util.*;

 public class maximumSubarraySumwithDistnictk {
	 
	 
	
	     public long maximumSubarraySum(int[] nums, int k) {
	         int start = 0;
	         long currentSum = 0;
	         long maxSum = 0;
	         HashSet<Integer> set = new HashSet<>();
	         HashMap<Integer, Integer> freqMap = new HashMap<>();
	         
	         for (int end = 0; end < nums.length; end++) {
	             int num = nums[end];
	             
	             // Add new element to the window
	             currentSum += num;
	             freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	             set.add(num);
	             
	             // If element count exceeds 1, it's not a valid distinct window
	             while (freqMap.get(num) > 1) {
	                 int startNum = nums[start];
	                 currentSum -= startNum;
	                 freqMap.put(startNum, freqMap.get(startNum) - 1);
	                 if (freqMap.get(startNum) == 0) {
	                     set.remove(startNum);
	                     freqMap.remove(startNum);
	                 }
	                 start++;
	             }
	             
	             // Check if window size is exactly k
	             if (end - start + 1 == k && set.size() == k) {
	                 maxSum = Math.max(maxSum, currentSum);
	             }
	         }
	         
	         return maxSum;
	     }
	 public static void main(String[] args) {
		
	}

}

