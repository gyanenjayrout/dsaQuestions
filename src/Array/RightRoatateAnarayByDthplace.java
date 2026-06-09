package Array;

import java.util.Arrays;

public class RightRoatateAnarayByDthplace {
	public static void main(String[] args) {
		int arr[]  = {3,2,4,5, 6 , 7,8,9};
		int d = 3;
		int []res = RightRotateByDthplace(arr,d);
	
		System.out.println(Arrays.toString(arr));
					
	}

	
	static int[] RightRotateByDthplace(int[] arr, int k)
	{
		
		int n = arr.length;
		k = k%n;
		
//		int []temp = new int[k];
//		
//		for(int i=0;i<k;i++)d
//		{
//			temp[i] = arr[n-k+i];
//		}
//		
//		for(int j=n-1;j>=k;j--)
//		{
//			arr[j] = arr[j-k];
//		}
//		
//		for(int x =0;x<k;x++)
//		{
//			arr[x] = temp[x];
//		}
/*		
		reverse(arr, n-k,n-1);
		reverse(arr, 0, n-k-1);
		reverse(arr, 0, n-1);
		*/
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
		
		
		return arr;
	}
	
	static void reverse(int []arr, int start, int end)
	{
		while(start<end)
		{
			int temp=  arr[start];
			
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
	}
	
	
	
}
