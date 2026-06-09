package practcie;

import java.util.HashMap;
import java.util.Map;

public class MissingNumber {

	
	public static void main(String[] args) {
		int[] arr = {3, 1, 4, 6, 2};  // Example input
        int n = 6;  // n is the expected length if no number was missing
        System.out.println("Missing number is: " + findMissingNumber(arr, n));
	}

//	private static int findMissingNumber(int[] arr, int n) {
//		// TODO Auto-generated method stub
//		
//		int expectedsum  = ((n+1)*n)/2;
//		
//		int sum  =0;
//		
//		for(int num :arr) {
//			sum  =sum+num;
//		}
//		
//		
//		return expectedsum-sum;
//	}
	
//	private static int findMissingNumber(int[] arr, int n) {	
//           int xor=  0;
//           
//           for(int i =0;i<arr.length;i++)
//           {
//        	   xor  = xor ^ arr[i];
//        	   xor = xor ^(i+1);
//           }
//           
//           xor =  xor ^ n;
//           
//           return xor;
//	
//	-------------------------------------------------------------------------------------------------------------------------------------------------------------------
//	In this case, the XOR of the array values and the index (starting from 0) ensures that every number
//	that is present in the array cancels itself out, leaving only the missing number as the result.
//	XORing with n ensures that if the missing number is the largest number (n), it will be correctly identified.
//	}
	
	private static int findMissingNumberr(int[] arr, int n)
	{
	int xor = 0;

	for(int i = 0; i < arr.length; i++) {
	    xor ^= arr[i];   // XOR the current element in the array
	    xor ^= i;         // XOR the index (starting from 0, expected number at position i)
	}

	xor ^= n;
	// XOR the value of n, which is the size of the array + 1, representing the largest expected number
	
	return xor;
	}
	
	private static int findMissingNumber(int[] arr, int n)
	{
		
		Map<Integer, Integer> map =  new HashMap<>();
		
		for(int num : arr)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
			
		}
		
		for(int i=1;i<=n;i++)
		{
			if(!map.containsKey(i))
			{
				return i;
			}
		}
		
		return n+1;
	}
	
}
