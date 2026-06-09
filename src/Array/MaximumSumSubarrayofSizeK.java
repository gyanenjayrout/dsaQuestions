package Array;

public class MaximumSumSubarrayofSizeK {
	
	
	
	  public int maximumSum(int[] nums, int k) {
		  int currsum=0;
		  int maxsum =0;
		  int n = nums.length;
		  
		  // Calculate the sum of the first window of size k
		  for(int i=0;i<k;i++)
		  {
			currsum += nums[i];  
		  }
		  
		  maxsum= currsum;  // Initialize maxSum with the first window's sum
		  
		  for(int i=k;i<n;i++)
		  { 
			  // Add the next element and remove the element going out of the window
			  currsum += nums[i]- nums[i-k];
			  
			  maxsum  = Math.max(maxsum, currsum);
			// Update maxSum if currentSum is larger
	        }

		
		return maxsum;
	  
	  }
	
	
	public static void main(String[] args) {
		int[] nums1 = {1, 2, 9, 9, 9};
        int k1 = 3;
        
        int[] nums2 = {4, 4, 4};
        int k2 = 3;

        int[] nums3 = {1, 5, 4, 2, 9, 9, 9};
        int k3 = 3;

        // Create an instance of the Solution class
        MaximumSumSubarrayofSizeK solution = new MaximumSumSubarrayofSizeK();

        // Test the method and print results
        System.out.println("Maximum Sum of Subarray of Size " + k1 + ": " + solution.maximumSum(nums1, k1)); // Output: 27
        System.out.println("Maximum Sum of Subarray of Size " + k2 + ": " + solution.maximumSum(nums2, k2)); // Output: 12
        System.out.println("Maximum Sum of Subarray of Size " + k3 + ": " + solution.maximumSum(nums3, k3)); // Output: 15
    }

}
