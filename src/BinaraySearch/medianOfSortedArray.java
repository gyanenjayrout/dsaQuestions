package BinaraySearch;

public class medianOfSortedArray {

	public static void main(String[] args) {
		medianOfSortedArray solution = new medianOfSortedArray();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = solution.findMedianSortedArrays__BrutFOrceeeeee(nums1, nums2);
        double median2 = solution.findMedianSortedArrays_Bettterrrrrrrrrrrrr(nums1, nums2);
        double median3 = solution.findMedianSortedArrays___Optimal(nums1, nums2);
        
        System.out.println("BrutFOrceeeeee Median is: " + median); // Output: 2.0
        System.out.println("Bettterrrrrrrrrrrrr Median is: " + median2); // Output: 2.0
        System.out.println("Optimal Median is: " + median3); // Output: 2.0
    }

public double findMedianSortedArrays__BrutFOrceeeeee(int[] nums1, int[] nums2) {
    int i=0;
    int j  =0;
    int k =0;

    int res[] = new int[nums1.length+nums2.length];

    while(i<nums1.length && j<nums2.length)
    {
        res[k++] =(nums1[i]<nums2[j])?nums1[i++] :nums2[j++];
    }

    while(i<nums1.length) res[k++] = nums1[i++];
    while(j<nums2.length) res[k++] = nums2[j++];

    
    int n = res.length;

    if(n%2== 1)
    {
        return res[n/2];
    }

    return (double) ((double)res[n/2] + (double)(res[n/2]-1))/2.0;
}


public double findMedianSortedArrays_Bettterrrrrrrrrrrrr(int[] nums1, int[] nums2) {
    int n = nums1.length + nums2.length;
    int i = 0, j = 0, count = 0;
    int median1 = 0, median2 = 0;
    int mid1 = (n - 1) / 2, mid2 = n / 2;

    while (count <= mid2) {
        int val;
        if (i < nums1.length && (j >= nums2.length || nums1[i] < nums2[j])) {
        	
        	/*
        	 * Use if (i < nums1.length && (j >= nums2.length || ...))
        	 *  when you care only about values during merge (e.g., counting steps, finding median).
        	 */
            val = nums1[i++];
        } else {
            val = nums2[j++];
        }

        if (count == mid1) median1 = val;
        if (count == mid2) median2 = val;
        count++;
    }

    return n % 2 == 0 ? (median1 + median2) / 2.0 : median2;
}

public double findMedianSortedArrays___Optimal(int[] nums1, int[] nums2) {
    int n1 = nums1.length, n2 = nums2.length;
    if (n1 > n2) return findMedianSortedArrays___Optimal(nums2, nums1); // ensure binary search on smaller array

    int low = 0, high = n1;
    int left = (n1 + n2 + 1) / 2;

    while (low <= high) {
        int mid1 = (low + high) / 2;
        int mid2 = left - mid1;

        int l1 = (mid1 > 0) ? nums1[mid1 - 1] : Integer.MIN_VALUE;
        int l2 = (mid2 > 0) ? nums2[mid2 - 1] : Integer.MIN_VALUE;
        int r1 = (mid1 < n1) ? nums1[mid1] : Integer.MAX_VALUE;
        int r2 = (mid2 < n2) ? nums2[mid2] : Integer.MAX_VALUE;

        if (l1 <= r2 && l2 <= r1) {
            if ((n1 + n2) % 2 == 1)
                return Math.max(l1, l2);
            else
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
        } else if (l1 > r2) {
            high = mid1 - 1;
        } else {
            low = mid1 + 1;
        }
    }
    return 0.0;
}
}

