package PrefixSum;

import java.util.Arrays;

public class PrefixArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		
		int [] res = prefixsummm(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
	}

	private static int[] prefixsummm(int[] arr) {
		// TODO Auto-generated method stub
		
		int prefix [] = new int [arr.length];
		
		prefix[0] = arr[0]; // First element is the same
		
		for(int i=1;i<arr.length;i++)
		{
			prefix [i]= prefix[i-1]+arr[i];
		}
 		return prefix;
	}

}
