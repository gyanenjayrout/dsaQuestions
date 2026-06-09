package PrefixSum;

import java.util.HashMap;

public class LongestSubarraySum_LESS_KWithNegatives {

    public static int findMaxLengthSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0, maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
        	
            sum += arr[i];

            // If sum is exactly k, update maxLength
            if (sum == k) {
                maxLength = i + 1;
            }

            // If (sum - k) exists in the map, update maxLength
            if (prefixSumMap.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(sum - k));
            }

            // Store the first occurrence of the sum
            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println("Maximum length of subarray with sum ≤ " + k + ": " + findMaxLengthSubarray(arr, k));
    }
}

/*
 * import java.util.HashMap;

public class LongestSubarraySumLEKWithNegatives {

    public static int findMaxLengthSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0, maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum is exactly k, update maxLength
            if (sum == k) {
                maxLength = i + 1;
            }

            // If (sum - k) exists in the map, update maxLength
            if (prefixSumMap.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(sum - k));
            }

            // Store the first occurrence of the sum
            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println("Maximum length of subarray with sum ≤ " + k + ": " + findMaxLengthSubarray(arr, k));
    }
}

 */
 

