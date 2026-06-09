package practice2;
/*
 * ✅ Approach: Sliding Window

Since the array contains positive numbers, the product can only increase if we add elements. 
So, we can use a sliding window (or two-pointer) technique:

    Use a left pointer to track the start of the window.
    Move the right pointer to expand the window.
    Keep multiplying elements inside the window.
    If the product ≥ k, shrink the window by moving the left pointer.
    At each step, the number of valid subarrays is determined by the window size.
 */
public class numSubarrayProductLessThanK {
	public static void main(String[] args) {
		int [] nums = {10,5,2,6};
		int k = 100;
		
		 int res  = numSubarrayProductLessThanK(nums, k);
		 
		 System.out.println(res);
	}

	private static int numSubarrayProductLessThanK(int[] nums, int k) {
		// TODO Auto-generated method stub
		int start=0;
		int product =1;
		int count =0;
		
		for(int end =0;end<nums.length;end++)
		{
			product = product * nums[end];
			
			while(start<=end && product>=k)
			{
				product /= nums[end];
				start++;
			}
			count = count+ -start+1;
			
		}
		return count;
	}

}
