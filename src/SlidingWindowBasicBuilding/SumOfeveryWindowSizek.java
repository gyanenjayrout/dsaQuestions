package SlidingWindowBasicBuilding;

import java.util.Arrays;

//Find sum of every subarray of size k
public class SumOfeveryWindowSizek {

	public static void main(String[] args) {
		int arr[] = {1,3,-1,-3,5,3,6,7};
		int k =3;
		
		int [] res  = smofsbarray(arr,k);
		
		System.out.println(Arrays.toString(res));
	}

	private static int[] smofsbarray(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		int n = arr.length;
		int result [] = new int [n-k+1];
		for (int i = 0; i <= n - k; i++) {

		    // initialize (sum / max / count)
			int sum=0;

		    for (int j = i; j < i + k; j++) {
		        // process arr[j]
		        sum = sum+arr[j]; 
		    }
		    result [i] = sum;

		    // store answer1
		}
		
		return result;

	}
	
}
