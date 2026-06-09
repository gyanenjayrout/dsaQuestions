package PrefixSum;

import java.util.Arrays;

public class SuffixArray {
public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		
		int [] res = suffixArray(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(res));
	}

private static int[] suffixArray(int[] arr) {
	// TODO Auto-generated method stub
	
	int suffix[] =  new int [arr.length];
	
	suffix[arr.length-1]=  arr[arr.length-1];
	
	int n=  arr.length;
	
	for(int i=n-2;i>=0;i--)
	{
		suffix[i] =suffix[i+1]+arr[i];
	}
	
	
	return suffix;
}


}
