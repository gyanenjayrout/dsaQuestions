package kadens_Algorithm;

import java.util.Arrays;

public class PrintTheSubArrays {
	
	public static void main(String[] args) {
		int[]arr  = {1,2,3,4,5,6,7};
		
		printAlltheSuarays(arr);
		
	}

	private static void printAlltheSuarays(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				System.out.print(arr[j]);
			}
			
			System.out.println();
		}
		
		System.out.println();
		
	}
	

}
