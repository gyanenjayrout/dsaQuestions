package Sorting;

import java.util.Arrays;

public class inversioncount {
	public static void main(String[] args) {
		int arr[] = {6,3,9,5,2,8};
		int n =arr.length;
	
		int count =inversioncounts(arr,0, n-1 );
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(count);
		
		
	}

	private static int inversioncounts(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		  if (i >= j) return 0;

	        int mid = i + (j - i) / 2;

	        int left = inversioncounts(arr, i, mid);
	        int right = inversioncounts(arr, mid + 1, j);
	        int cross = merge(arr, i, mid, j);

	        return left + right + cross;
	}

	private static int merge(int[] arr, int si, int mid, int ei) {
		// TODO Auto-generated method stub
		
		 int[] merged = new int[ei - si + 1];
	        int idx1 = si, idx2 = mid + 1, x = 0;
	        int invCount = 0;

	        while (idx1 <= mid && idx2 <= ei) {
	            if (arr[idx1] <= arr[idx2]) {
	                merged[x++] = arr[idx1++];
	            } else {
	                merged[x++] = arr[idx2++];
	                invCount += (mid - idx1 + 1);  // Count inversions
	            }
	        }

	        while (idx1 <= mid) merged[x++] = arr[idx1++];
	        while (idx2 <= ei) merged[x++] = arr[idx2++];

	        for (int i = 0, j = si; i < merged.length; i++, j++) {
	            arr[j] = merged[i];
	        }

	        return invCount;
	}
}
/*
 * Line	                                                  What It Does	                                      When It Runs
int left = inversioncounts(...)                     	Recurse on left half, count its inversions	      Before merging left half
int right = inversioncounts(...)	                   Recurse on right half, count its inversions         Before merging right + left
int cross = merge(...)	                               Merge both halves, count cross-pair inversions	After both left & right are sorted
 * 
 * ✅ Time Complexity (TC):

The logic is similar to merge sort:

    Divide Step:

        Splits the array into two halves → takes O(log N) recursion depth.

    Merge Step:

        Merging + counting inversions in each level takes O(N) time.
        
        ✅ TC = O(N log N)
        
        
        
        ✅ Space Complexity (SC):

Now let's look at space:
🔸 Recursion Stack:

    Maximum depth of recursion = log N
    ➡️ So space used in recursion stack = O(log N)

🔸 Temporary Array:

    The merge[] array takes O(N) space in each merge step, but it's not reused globally in your code.

➡️ So extra array space = O(N)


✅ SC = O(N + log N) ≈ O(N)

If you optimize and reuse the same temp array, you can reduce the space closer to O(log N) for stack only.
 */
