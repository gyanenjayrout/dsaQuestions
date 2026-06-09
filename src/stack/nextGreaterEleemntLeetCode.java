package stack;

public class nextGreaterEleemntLeetCode {
	/*
	 * Time = O(n1 * n2)
Space = O(1) extra
	 */
	    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

	        int[] result = new int[nums1.length];

	        for (int i = 0; i < nums1.length; i++) {

	            int index = -1;
	            result[i] = -1;

	            // find nums1[i] in nums2
	            for (int j = 0; j < nums2.length; j++) {
	                if (nums2[j] == nums1[i]) {
	                    index = j;
	                    break;
	                }
	            }

	            // search right side
	            for (int j = index + 1; j < nums2.length; j++) {
	                if (nums2[j] > nums1[i]) {
	                    result[i] = nums2[j];
	                    break;
	                }
	            }
	        }

	        return result;
	    }
	
}
