package Sorting;

import java.util.Arrays;

public class Bubblesortig {
	
	public static void main(String[] args) {
		int [] arr = {7,8,1,4,2};
		
		sortArary(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void sortArary(int[] arr) {
		// TODO Auto-generated method stub
		int n = arr.length;
		
		boolean swapped;
		for(int i=0;i<n-1;i++)
		{
			swapped  = false;
			for(int j = 0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					
					int temp = arr[j];
					arr[j] =arr[j+1];
					arr[j+1]= temp;
					
					swapped  =true;
				}
			}
			
			if(!swapped)
			{
				return ;
			}
		}
		
	}

}
