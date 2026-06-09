package SlididngWindow;

public class SubArrayBeauty {
	public int[] getSubarrayBeauty(int[] nums, int k, int x) {

	    int n = nums.length;
	    int[] result = new int[n - k + 1];

	    // bucket for values from -50 to 50
	    int[] freq = new int[101];

	    int start = 0;

	    for (int end = 0; end < n; end++) {

	        // add current number to bucket
	        freq[nums[end] + 50]++;

	        // when window size becomes k
	        if (end - start + 1 == k) {

	            // find x-th smallest
	            int count = 0;
	            int beauty = 0;

	            for (int i = 0; i < 101; i++) {
	                count += freq[i];
	                if (count >= x) {
	                    int value = i - 50;
	                    beauty = value < 0 ? value : 0;
	                    break;
	                }
	            }

	            result[start] = beauty;

	            // remove left element before sliding
	            freq[nums[start] + 50]--;
	            start++;
	        }
	    }

	    return result;
	}


}
