package Sorting;

import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		int arr [ ] =  {4,5,2,6,1};
		
		sorttttt(arr);
		
		System.out.println(Arrays.toString(arr));
		
		}

	private static void sorttttt(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length-1;i++)
		{
			int smallestsIndex = i;
			
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[smallestsIndex])
				{
					smallestsIndex  = j;
				}
			}
			
			swap(arr, i, smallestsIndex);
		}
		
	}

	private static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j ] = temp;
		
		
	}
	/*
	 * Let's dry run the Selection Sort algorithm on the given array:
Given Array:

[7, 8, 1, 4, 2]
Selection Sort Steps

💡 Idea: In each iteration, we find the smallest element and swap it with the first unsorted element.
Pass 1: (Find the smallest in the entire array)

Initial: [7, 8, 1, 4, 2]
🔍 Smallest element: 1 (at index 2)
🔄 Swap 1 with 7

After swap: [1, 8, 7, 4, 2]
Pass 2: (Find the smallest from index 1 to 4)

Current: [1, 8, 7, 4, 2]
🔍 Smallest element: 2 (at index 4)
🔄 Swap 2 with 8

After swap: [1, 2, 7, 4, 8]
Pass 3: (Find the smallest from index 2 to 4)

Current: [1, 2, 7, 4, 8]
🔍 Smallest element: 4 (at index 3)
🔄 Swap 4 with 7

After swap: [1, 2, 4, 7, 8]
Pass 4: (Find the smallest from index 3 to 4)

Current: [1, 2, 4, 7, 8]
🔍 Smallest element: 7 (at index 3, already in place)
✅ No swap needed
Final Sorted Array:

✅ Output: [1, 2, 4, 7, 8]
Time Complexity:

Worst & Average Case: O(n²)
Best Case (Already Sorted): O(n²) (Still checks every element)
Key Takeaways:

✔ Selection Sort repeatedly selects the smallest element and swaps it.
✔ It performs O(n²) comparisons, making it inefficient for large datasets.
✔ Unlike Bubble Sort, it makes fewer swaps but still has a high time complexity.

Would you like a Java implementation as well? 🚀
	 */
	
	
	
	}


