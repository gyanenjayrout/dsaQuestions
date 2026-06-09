package TwoPointerApproach;

import java.util.Arrays;
import java.util.*;
public class RemoveduplicateFormSortedArray {
	public static void main(String[] args) {
		int arr[]= {1,1,2,2,3,3,3,4,4,5,5};
		
		int length  =removeduplicates(arr);
	    
		System.out.println(Arrays.toString(Arrays.copyOf(arr, length)));
		//Truncating the Array:

//	    Arrays.copyOf(arr, length) copies the first kk elements of the array, which takes O(k)O(k).
//	    Again, since k≤nk≤n, this is O(n)O(n).
		//A new array of size 5 is created: {1, 2, 3, 4, 5}.
//		Only the first 5 elements of arr are copied.
	}

	private static int removeduplicates(int[] arr) {
		// TODO Auto-generated method stub
		
//		int i =1;
//		for(int j=1;j<arr.length;j++)
//		{
//			if(arr[j]!=arr[j-1])
//			{
//				arr[i++]  =arr[j];
//			}
//		}
//		return i;
		
		int index =0;
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] !=arr[index])
			{
				index++;
				arr[index] = arr[i];
			}
		}
		
		return index+1;
	}

//	private static int removeduplicates(int[] arr) {
//		// TODO Auto-generated method stub
//		
//		Set<Integer> set  = new LinkedHashSet<>();
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			set.add(arr[i]);
//		}
//		
//		int index= 0;
//		
//		for(int num: set)
//		{
//			arr[index++]= num;
//		}
//		
//		
//		return set.size();
/*
 * Time Complexity (TC):

    Iterating Through the Array:
        The loop for (int num : arr) runs once for each element in the input array arr of size nn.
        Time complexity: O(n)O(n).

    Adding Elements to the Set:
        In the worst case, adding an element to a HashSet or LinkedHashSet takes O(1)O(1) on average for each element.
        For nn elements, the total complexity is O(n)O(n).

    Copying Unique Elements Back to the Array:
        The second loop to iterate through the Set and update the original array runs once for each unique element.
        Let the number of unique elements be kk (where k≤nk≤n).
        This loop runs in O(k)O(k), but k≤nk≤n, so it’s effectively O(n)O(n).

    Truncating the Array:
        Arrays.copyOf(arr, length) copies the first kk elements of the array, which takes O(k)O(k).
        Again, since k≤nk≤n, this is O(n)O(n).

Overall Time Complexity:
O(n)+O(n)+O(n)+O(n)=O(n)
O(n)+O(n)+O(n)+O(n)=O(n)
Space Complexity (SC):

    Set to Store Unique Elements:
        The Set stores at most kk unique elements, where k≤nk≤n.
        Space used: O(k)O(k).

    No Additional Arrays:
        The array arr is modified in place; no extra space is used for processing it.

    Output Array:
        Arrays.copyOf() creates a new array of size kk (the number of unique elements).
        Space used: O(k)O(k).

Overall Space Complexity:
O(k)(for the Set and the output array)
O(k)(for the Set and the output array)
 */
//	}
	

}
