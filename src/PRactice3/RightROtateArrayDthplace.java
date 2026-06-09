package PRactice3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RightROtateArrayDthplace {
	public static void main(String[] args) {
		int arr[]= {3,4,56,5,6, 7, 8};
		
		 removeduplicates(arr, 3);
	    
		System.out.println(Arrays.toString(arr));
	}

	private static void removeduplicates(int[] arr , int d) {
		// TODO Auto-generated method stub
		int n=  arr.length;
//		
		d= d%n;
//		int temp []  = new int [d];
//		
//		for(int i=0;i<d;i++)
//		{
//			temp[i] = arr[i];
//		}
//		
//		for(int i=d;i<arr.length;i++)
//		{
//			arr[i-d]  =arr[i];
//		}
//		
//		int j =0;
//		
//		for(int i=n-d;i<arr.length;i++)
//		{
//			arr[i] =temp [j++];
//		}
//		
		
//		reverse(arr, 0, d-1);
//		reverse(arr,d, n-1 );
//		reverse(arr, 0,n-1);
	//----------------------------------------------------------------------	
//		int [] temp = new int [d];
//		
//		for(int i=0;i<d;i++)
//		{
//			temp[i] = arr[n-d+i];
//		}
//		
//		for(int i=n-1;i>=d;i--)
//		{
//			arr[i]= arr[i-d];
//		}
//		//{3,4,56,5,6, 7, 8};
//		
//		int j =0;
//		
//		for(int i=0;i<d;i++)
//			
//		{
//			arr[i] = temp[j++];
//		}
		
		
		reverse(arr, 0 , n-1);
		reverse(arr, 0, d-1);
		reverse(arr, d ,n-1);
	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		
		while(start<end)
		{
			int temp = arr[start];
			arr[start] =arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			
		}
		
		
	}
	
	

}

