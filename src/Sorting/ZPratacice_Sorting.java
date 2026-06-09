package Sorting;

import java.util.Arrays;

public class ZPratacice_Sorting{

	public static void main(String[] args) {
		int [] arr = {7,8,1,4,2};
		
		int n = arr.length;
		
		sortArary(arr, 0, n-1);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void sortArary(int[] arr, int low , int high) {
		
		
		
		// TODO Auto-generated method stub
		
		if(low<high)
		{
			int idx = partittion(arr,low, high );
			
			sortArary(arr, low, idx-1);
			sortArary(arr, idx+1, high);
		}
		
	
		
	}

	private static int partittion(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		int idx = low-1;
		
		int pivot = arr[high];
		
		for(int i=low;i<high;i++)
		{
			if(arr[i]<pivot)
			{
				idx++;
				
				int temp = arr[idx];
				arr[idx]  = arr[i];
				arr[i] =temp;
			}    
		}
		
		idx++;
		
		int temp = arr[high];
		arr[high] =arr[idx];
		arr[idx] = temp;
		return idx;
	}

	

	
}
