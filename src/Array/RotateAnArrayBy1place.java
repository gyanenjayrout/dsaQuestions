package Array;

import java.util.Arrays;

public class RotateAnArrayBy1place {

	public static void main(String[] args) {
		int arr[]  = {3,2,4,5};
		int []res = RotateBy1place(arr);
		
		System.out.println(Arrays.toString(arr));				
	}
	
	static int[]RotateBy1place(int arr[])
	{
		
		int temp = arr[0];
		for(int i=1;i<arr.length;i++)
		{
			arr[i-1] = arr[i];
		}
		
		arr[arr.length-1] =temp;
		return arr;
	}
}
