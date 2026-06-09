package PrefixSum;
import java.util.*;
public class count_subarrays_w0ith_equal_0s_and_1s {
	public int countSubarrays(int[] arr) {
	    Map<Integer, Integer> map = new HashMap<>();
	    int sum = 0, count = 0;
	    map.put(0, 1);  // To count subarrays starting from index 0 
	    //Always put map.put(0, 1) before the loop to handle subarrays starting from index 0.

	    for (int num : arr) {
	        // Convert 0 to -1
	        sum += (num == 0) ? -1 : 1;

	        if (map.containsKey(sum)) {
	            count += map.get(sum);  // add all previous occurrences
	        }

	        map.put(sum, map.getOrDefault(sum, 0) + 1);
	    }

	    return count;
	}
	
	
	public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        map.put(0, -1);  // 💡 prefix sum 0 at index -1

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : 1;

            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);  // store first occurrence only
            }
        }

        return maxLength;
    }


}
/*
✅ So why those specific indices?

You're not adding count because of index, you're adding because the current prefix sum was seen before.
 Every time that happens, it means a subarray (or multiple) from an earlier index to this index has sum zero → equal 1s and 0s.
💡 Key Point:

    If a prefix sum repeats, it means the subarray between those occurrences has net zero sum — which, after 0 → -1 conversion, 
    means equal number of 0s and 1s.
    
    
    💡 Why this guarantees correctness:

    Any time we see a prefix sum again, we know the subarray in between adds to 0, because sum didn't change.

    This works regardless of whether the prefix sum is 0, 1, -1, 5, -3 — doesn't matter.

    By counting how many times we’ve seen a particular sum, we find how many subarrays end at current index and have net sum 0.

✅ Final thought (How to explain to interviewer):

    “This approach works because we’re tracking prefix sums and using the idea that if the same sum appears again, then the subarray in between must have sum 0 — i.e., equal 1s and 0s after converting 0 to -1. 
    That’s why we use a map to count how many times each prefix sum occurred.”
*/