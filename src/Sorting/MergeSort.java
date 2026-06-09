package Sorting;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		int arr[] = {6,3,9,5,2,8};
		int n =arr.length;
	
		Diveide(arr,0, n-1 );
		
		System.out.println(Arrays.toString(arr));
		
		
	}

	private static void Diveide(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
		int si  = i;
		int ei= j;
		if(si>=ei)
		{
			return;
		}
		
		int mid = si+(ei-si)/2;
		Diveide(arr, si, mid);
		Diveide(arr, mid+1, ei);
		
		conquree(arr, si, mid, ei);
		
	}

	private static void conquree(int[] arr, int si, int mid, int ei) {
		// TODO Auto-generated method stub
		int [] merged = new int [ei-si+1];
		
		 int idx1 = si;    // Pointer for the left half
		    int idx2 = mid + 1; // Pointer for the right half
		    int x = 0;         // Pointer for the merged array

		    // Merge elements from both halves
		    while (idx1 <= mid && idx2 <= ei) {
		        if (arr[idx1] <= arr[idx2]) {
		            merged[x++] = arr[idx1++];
		        } else {
		            merged[x++] = arr[idx2++];
		        }
		    }
		
		
		
		
		while(idx1<=mid)
		{
			merged[x++] = arr[idx1++];
			
		}
		while(idx2<=ei)
		{
			merged[x++] = arr[idx2++];
			
		}
		
		
		for(int i=0, j =si; i<merged.length;i++,j++)
		{
			arr[j] = merged[i];
		}
		
		
	}

}
