package Selection_Algorithim;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * 1. Given an unsorted array of integers, find the third largest number in the array. If the array has less than three distinct numbers, return the largest number.
Example:
Input:
arr = [2, 4, 1, 5, 3, 6]
Output:
4
Explanation:
The sorted array in descending order is [6, 5, 4, 3, 2, 1]. The third largest number is 4.

Why Use long Instead of int?

The use of long in this problem is a safeguard against integer overflow when dealing with extreme values, particularly when the input array contains Integer.MIN_VALUE or Integer.MAX_VALUE.
Key Reasons:

    Avoiding Overflow in Comparisons

        If nums contains Integer.MAX_VALUE (e.g., [1, 2, Integer.MAX_VALUE]), and we try to assign a larger value later, using int could lead to incorrect comparisons due to overflow.

        By converting to long, we ensure that all comparisons (>, <, ==) work correctly even with
 */
public class ThirdLargestNumber {
public static void main(String[] args) {
	int[] arr = {2, 4, 1, 5, 3, 6};

    System.out.println(findThirdLargest(arr));
    System.out.println(findThirdLargestOptimal(arr));
}

private static int findThirdLargestOptimal(int[] arr) {
	// TODO Auto-generated method stub
	Long first =null , second =null, third = null;
	
	for(int num :arr)
	{
		long n = (long)num;
		
		if((first !=null && n==first) ||(second !=null && n==second )||(third !=null && n== third)) continue;
		
		if(first ==null || n>first)
		{
			third = second;
			second = first;
			first = n;
		}else if(second ==null ||n>second)
		{
			third = second;
			second =n;
		}else if(third ==null || n>third)
		{
			third = n;
		}
	}
    // If third is null, return the largest number (first)
	return (third !=null) ? third.intValue():first.intValue();
}

private static Integer findThirdLargest(int[] arr) {
	// TODO Auto-generated method stub
	
	TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
	
	for(int num:arr)
	{
		set.add(num);
	}
	
	if(set.size()<3) return set.first();
	
	Iterator<Integer> iterator = set.iterator();
	iterator.next();
	iterator.next();
	
	return iterator.next();
}



/*
private static Integer findThirdLargest(int[] arr) {
	// TODO Auto-generated method stub
	 int n = arr.length;
     
     // Sort the array 
     Arrays.sort(arr);
     
     // Return the third largest element 
     return arr[n - 3];
//	  Integer[] arrList = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//      Arrays.sort(arrList, Collections.reverseOrder());  // Sort in descending order
//      
//     
//
//	return arrList[2];
}
*/
}
