package Array;

import java.util.Arrays;

public class segregateEvenOdd {
	
	/* void segregateEvenOdd(int arr[]) {
      int i = 0, j = arr.length - 1;
        
        while (i < j) {
            // Move i to the next even element
            while (i < arr.length && arr[i] % 2 == 0) {
                i++;
            }
            // Move j to the previous odd element
            while (j >= 0 && arr[j] % 2 != 0) {
                j--;
            }
            
            // Swap if i < j
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Sort even and odd parts separately if needed
        Arrays.sort(arr, 0, i);   // Sort even numbers
        Arrays.sort(arr, i, arr.length);   // Sort odd numbers
    }*/
	 static void segregate(int arr[]) {
	        // code here
	        int n =arr.length;
	       int [] even = new int [n];
	       int [] odd = new int [n];
	       
	       int evencount = 0;
	       int oddcount  =0;
	       
	       for(int i=0;i<arr.length;i++)
	       {
	           if(arr[i]%2==0)
	           {
	               even[evencount++]= arr[i];
	           }
	           else
	           {
	               odd[oddcount++]= arr[i];
	           }
	       }
	       
	          Arrays.sort(even, 0, evencount);
	        Arrays.sort(odd, 0, oddcount);
	       int index = 0;
	       for(int i=0;i<evencount ;i++)
	       {
	           arr[index++]=  even[i];
	       }
	       
	       for(int i=0;i<oddcount;i++)
	       {
	           arr[index++] = odd[i];
	       }
	    
	        
	    }
	 
	 public static void main(String[] args) {
		int [] arr = {12, 34, 45, 9 ,8 ,90 ,3};
		
		segregate(arr);
	}
}
