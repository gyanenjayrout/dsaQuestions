package practice2;

import java.util.*;
import java.util.stream.IntStream;

public class ArrayQuestions {
	
	
	
	public static void main(String[] args) {
		int arr[]  = {3,2,4,5, 6 , 7,8};
		int d = 3;
		int []res = RotateByDthplace(arr,d);

		System.out.println(Arrays.toString(arr));
	}

	private static int[] RotateByDthplace(int[] arr, int k) {
		// TODO Auto-generated method stub
		
//		int temp = arr[0];
//		for(int i=1;i<arr.length;i++)
//		{
//			arr[i-1] = arr[i];
//		}
//		
//		arr[arr.length-1] =temp;
//		return arr;
		
		
		int n = arr.length;
		 k = k%n;
		int [] temp =  new int[k];
		
		for(int i=0;i<k;i++)
		{
			temp[i] = arr[n-k+i];
		}
		
		for(int i=k;i<arr.length;i++)
		{
			arr[i-k] =arr[i];
		}
		int x =0;
		
		for(int i = n-k;i<n;i++)
		{
			arr[i] = temp[x++];
		}
		
		return arr;
	}
	
//	public static void main(String[] args) {
//		int arr[]= {5, 5, 5, 5};
//		
//		int arr1[] = {2,4,5,2,5,4};
//		
//		 IntStream arrstream = Arrays.stream(arr1);	
//		 
//		 
//		 int[] uniqueArr = Arrays.stream(arr) // Convert array to IntStream
//	                .distinct()                  // Remove duplicates
//	                .toArray();                  // Convert back to an array
//
//	        System.out.println(Arrays.toString(uniqueArr));
//		 
//		 
//		 int length  =removeduplicates(arr);
//		
//	    
//		System.out.println(Arrays.toString(Arrays.copyOf(arr, length)));
//	}
//
//	private static int removeduplicates(int[] arr) {
//		// TODO Auto-generated method stub
//		
////		Set<Integer> set =  new LinkedHashSet();
//		
//		int index =1;
//		
//		for(int i=1;i<arr.length;i++)
//		{
//			if(arr[i]!=arr[i-1])
//			{
//				
//				arr[index++] =arr[i];
//			}
//		}
//		
//		return index;
//	}

	
	
	

}
