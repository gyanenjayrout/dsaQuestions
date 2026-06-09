package Array;

import java.util.Arrays;

public class SquaresofaSortedArray {
	public static void main(String[] args) {
		
		int [] arr  = {-4,-1,0,3,10};
		int [] arr2 = {-7, -3, 2, 3, 11};
		
		 int [] res = sqrtOfSortedArray(arr);
		 
		 int [] res2 = sqrtOfSortedArray(arr2);
		 
		 System.out.println(Arrays.toString(res));
		 System.out.println(Arrays.toString(res2));
		
	}

	private static int[] sqrtOfSortedArray(int[] arr) {
		
		
//		int res []  =new int [arr.length];
//		for(int i=0;i<arr.length;i++)
//		{
//			 res[i]= arr[i]*arr[i];
//		}
//		
//		Arrays.sort(res);
//		// TODO Auto-generated method stub
//		return res;
		
		int n=arr.length;
		
		int left = 0;
		int right = n-1;
		
		int index  =n-1;
		
		int [] result = new int [n];
		
		while(left<right)
		{
			int leftsqrt = arr[left]*arr[left];
			int rightsrqrt = arr[right]* arr[right];
			
			if(leftsqrt<rightsrqrt)
			{
				result[index--] = rightsrqrt;
				right--;
			}
			else 
			{
				result[index--]=leftsqrt;
				left++;
			}
			
		}
		
		return result;
	}

}
