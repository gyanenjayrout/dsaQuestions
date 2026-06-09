package SlididngWindow;

import java.util.Arrays;

public class SlidingWindowMAximum {
	public static void main(String[] args) {
		int arr[] = {1,3,-1,-3,5,3,6,7};
		int k =3;
		
		int [] res  = windowMAx(arr,k);
		
		System.out.println(Arrays.toString(res));
	}

	private static int[] windowMAx(int[] arr, int k) {
		
		int n = arr.length;
		
		
		int result [] = new int [n-k+1];
		// TODO Auto-generated method stub
		for(int i=0;i<=n-k;i++)
		{
//			int max= Integer.MIN_VALUE;
			int max = arr[i];
		   for(int j=i; j<i+k;j++)
		   {
			   max = Math.max(max, arr[j]);
		   }
		   result[i] = max;
		}
		return result;
	}

}
