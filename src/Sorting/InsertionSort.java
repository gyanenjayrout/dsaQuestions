 package Sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int [] arr  = {7,5,2,3,4};
		
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertion(int[] arr) {
		// TODO Auto-generated method stub
		for(int  i =1;i<arr.length;i++)
		{
			int curr  = arr[i];
			int prev = i-1;
			
			while(prev>=0 && arr[prev] >=curr)
			{
				arr[prev+1]=arr[prev];
				prev--;
			}
			
			arr[prev+1] =curr;
		}
	}

}
/*
Pass 1: (i = 1) → Insert 5 into the sorted part [7]

Current: [7, 5, 2, 3, 4]

    curr = 5, prev = 0
    Compare 5 with 7: 5 < 7, so shift 7 to the right.

After shifting: [7, 7, 2, 3, 4]

    Insert 5 at index 0

After insert: [5, 7, 2, 3, 4]
Pass 2: (i = 2) → Insert 2 into the sorted part [5, 7]

Current: [5, 7, 2, 3, 4]

    curr = 2, prev = 1
    Compare 2 with 7: 2 < 7, shift 7
    Compare 2 with 5: 2 < 5, shift 5

After shifting: [5, 5, 7, 3, 4]

    Insert 2 at index 0

After insert: [2, 5, 7, 3, 4]
Pass 3: (i = 3) → Insert 3 into the sorted part [2, 5, 7]

Current: [2, 5, 7, 3, 4]

    curr = 3, prev = 2
    Compare 3 with 7: 3 < 7, shift 7
    Compare 3 with 5: 3 < 5, shift 5
    Compare 3 with 2: 3 > 2, stop shifting

After shifting: [2, 3, 5, 7, 4]
Pass 4: (i = 4) → Insert 4 into the sorted part [2, 3, 5, 7]

Current: [2, 3, 5, 7, 4]

    curr = 4, prev = 3
    Compare 4 with 7: 4 < 7, shift 7
    Compare 4 with 5: 4 < 5, shift 5
    Compare 4 with 3: 4 > 3, stop shifting

After shifting: [2, 3, 4, 5, 7]
Final Sorted Array:

✅ Output: [2, 3, 4, 5, 7]
Time Complexity:

    Worst & Average Case: O(n²)
    Best Case (Already Sorted): O(n) (Only 1 comparison per element)

Key Takeaways:

✔ Stable sorting algorithm (does not change the order of equal elements).
✔ Efficient for small datasets but not optimal for large datasets due to O(n²) time complexity.
✔ Works well when the array is partially sorted.

Would you like a Java code fix or optimization? 🚀
*/