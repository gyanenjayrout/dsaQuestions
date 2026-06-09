package SlidingWindowBasicBuilding;

import java.util.*;

public class Print_All_subarrays_of_size_k {
	public static void main(String[] args) {
		int arr[] = {1,3,-1,-3,5,3,6,7};
		int k =3;
		printAllSubArrayOFsizek(arr, k);
	}

	private static void printAllSubArrayOFsizek(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		List<Integer> result = new ArrayList<>();
		
		for(int i=0;i<= n-k;i++)
		{
			for(int j=i;j<i+k;j++)
			{
				  System.out.print(arr[j] + " ");
			}
		
		}
	}
}
