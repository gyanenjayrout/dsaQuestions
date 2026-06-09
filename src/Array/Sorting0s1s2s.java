package Array;

import java.util.Arrays;


// Doutch National Flag Algorithm
public class Sorting0s1s2s {
	
		public static void main(String[] args) {
			int[]arr = {0,1,2,0,1,2,2,2,1,1,0,0,0,1,2,0};
			
			int result[] = Sorting(arr);
			
			System.out.println(Arrays.toString(result));
		}
		
		public static void swap(int arr[], int i, int j)
		{
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j] = temp;
		}
		
		private static int[] Sorting(int[] arr) {
			// TODO Auto-generated method stub
			
			int low = 0;
			int mid  =0;
			int high = arr.length-1;
			
			
			while(mid<=high)
			{
				if(arr[mid]==0)
				{
					swap(arr,low, mid);
					mid++;
					low++;
				}
				else if(arr[mid] ==1)
				{
					mid++;
				}
				else
				{
					swap(arr, mid, high);
					
					high--;
				}
			}
			return arr;
		
/*
		private static int[] Sorting(int[] arr) {
			// TODO Auto-generated method stub
			
			
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			
			
			for(int i =0;i<arr.length;i++)
				
			{
				if(arr[i]==0)
				{
					count1++;
				}else if(arr[i]==1)
				{
					count2++;
				}
				else
				{
					count3++;
				}
			}
			
			
			for(int i=0;i<count1;i++)
			{
				arr[i] = 0;
			}
			
			for(int i=count1;i<count1+count2;i++)
			{
				arr[i] =1;
			}
			for(int i=count1+count2;i<arr.length;i++)
			{
				arr[i] =2;
			}
			
			return arr;
		}
		
		
		*/

	}

}
