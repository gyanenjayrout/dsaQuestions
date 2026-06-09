package Wissen_technology;

import java.util.Arrays;

public class mergeSorted {
	
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,0,0,0,0};
		int m =3;
		int[]arr2 = {2,5,6,7};
		int n=4;
		
		merge(arr1, m, arr2, n);
		
		System.out.println(Arrays.toString(arr1));
	}

	private static void merge(int[] arr1, int m, int[] arr2, int n) {
		// TODO Auto-generated method stub
		
		int i= m-1;
		int j= n-1;
		
		int k= m+n-1;
		
		
		while(i>=0&& j>=0)
		{
			if(arr1[i]>arr2[j])
			{
				arr1[k--] = arr1[i--];
			}else {
				arr1[k--]= arr2[j--];
			}
		}
		
		while(i>=0)
		{
			arr1[k--]=arr1[i--];
		}
		
		while(j>=0)
		{
			arr1[k--]=arr2[j--];
		}
	}

}
