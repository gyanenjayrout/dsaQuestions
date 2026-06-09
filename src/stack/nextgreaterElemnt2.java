package stack;

import java.util.*;

public class nextgreaterElemnt2 {

	    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        Map<Integer, Integer> map = new HashMap<>();
	        Stack<Integer> stack = new Stack<>();

	        for (int num : nums2) {
	            while (!stack.isEmpty() && stack.peek() < num) {
	                map.put(stack.pop(), num);
	            }
	            stack.push(num);
	        }

	        int[] result = new int[nums1.length];
	        for (int i = 0; i < nums1.length; i++) {
	            result[i] = map.getOrDefault(nums1[i], -1);
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	    	nextgreaterElemnt2 sol = new nextgreaterElemnt2();
	        int[] nums1 = {2, 4};
	        int[] nums2 = {1, 2, 3, 4};
	        int[] result = sol.nextGreaterElement(nums1, nums2);
	        System.out.println(Arrays.toString(result)); // Output: [3, -1]
	    }
	}



