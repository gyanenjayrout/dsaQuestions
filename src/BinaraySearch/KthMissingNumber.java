package BinaraySearch;

import java.util.*;
/*
 * If the kth missing number is before the array starts, I simply return k. Otherwise,
I use binary search where missing count up to an index helps decide the search window. At the end, the answer is left + k because
 *  left tells how many numbers have been processed and k tells how many missing we want beyond that
 */
public class KthMissingNumber {
public static void main(String[] args) {
	int  [] arr = {2,3,4,7,11};
	int k = 5;
	int [] arr2 = {5, 6, 7, 8, 9};
			int  k1 = 4;
	
	int findKthPositive = findKthPositive(arr, k);
	int findKthPositive2 = findKthPositive(arr2,k1);
	
	System.out.println(findKthPositive);
	System.out.println(findKthPositive2);
}

 
	
	 public static int findKthPositive(int[] arr, int k) {
//	       for(int i=0;i<arr.length;i++)
//	       {
//	        if(arr[i]<k)  k++;
//	        else  break;
//	       }
//
//	       return k;
		 
		 if (k < arr[0]) return k;
		 /*No need for full binary search here!
		  * 🔥 So even before array starts (before index 0), K-th missing exists.
		  * 
		  * 
		  * 🧠 General Shortcut:
			Situation	                                            Formula
			If k < arr[0] (before array starts)        	       Directly return k
			Otherwise (normal case)	Use binary              search + answer is left + k
		  */
		 
		 int low = 0, high = arr.length - 1;
	        
	        while (low <= high) {
	            int mid = low + (high - low) / 2;
	            
	            int missing = arr[mid] - (mid + 1);
	            
	            if (missing < k) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }
	        
	        return low + k;
	        
	        
	        /*
	          Why left + k?
	         
	          At the end of binary search:

    left tells how many numbers are already present (not missing).

    So, missing numbers + known numbers = left + k.
	         */
	    }
	

/*
 * 🔥 Dry Run Example:

Input: arr = [2,3,4,7,11], k = 5

Steps:

    low = 0, high = 4

    mid = 2 → missing = 4 - 3 = 1 → missing < 5 → low = 3

    mid = 3 → missing = 7 - 4 = 3 → missing < 5 → low = 4

    mid = 4 → missing = 11 - 5 = 6 → missing ≥ 5 → high = 3

Now low = 4, high = 3 → exit loop.

✅ Final answer = low + k = 4 + 5 = 9
🧠 Quick explanation:

    After Binary Search, low points to where the missing number sequence fits.

    Then simply low + k gives the correct missing number.

📢 Summary of all approaches:
Approach	Time	Space	Notes
Brute Force (using Set)	O(max(arr))	O(max(arr))	slow if arr has big numbers
Linear Scan (count missing)	O(n)	O(1)	fast, recommended
Binary Search	O(log n)	O(1)	fastest if array is large

Would you like me to also show a graphical diagram 📈 to visualize this Binary Search working?
It’s super simple and fun! 🎯
Shall I? 🚀
public static int findKthPositive(int[] arr, int k)
{

	Set<Integer> set = new HashSet<>();
	
	for(int num:arr)
	{
		set.add(num);
	}
	
	int missingnumber =0;
	int currentNumber =1;
	
	while(true)
	{
		if(!set.contains(currentNumber))
		{
			missingnumber++;
			
			if(missingnumber==k)
			{
				return currentNumber;
			}
		}
		currentNumber++;
	}
	
}

*/

}