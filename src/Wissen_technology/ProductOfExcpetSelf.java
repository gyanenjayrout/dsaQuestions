package Wissen_technology;

import java.util.Arrays;

public class ProductOfExcpetSelf {
	 public static void main(String[] args) {
	        int[] arr = {2, 2, 3, 4};
	        System.out.println("Product Except Self: " + Arrays.toString(productExceptSelf(arr)));
	        
	        System.out.println("Product Except Self using prefix and suffix : " + Arrays.toString(productExceptSelfUsingPrefixSuffix(arr)));
	        
	        System.out.println("Product Except Self using prefix and suffix : " + Arrays.toString(productusingprefsuf(arr)));
	    }

	private static int [] productusingprefsuf(int[] arr) {
		// TODO Auto-generated method stub
		int[] result = new int [arr.length];
		
		Arrays.fill(result, 1);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					result[i]= result[i]*arr[j];
				}
			}
		}
		return result;
	}

	private static int[] productExceptSelfUsingPrefixSuffix(int[] arr) {
		// TODO Auto-generated method stub
		int prefix [] = new int [arr.length];
		
		int suffix [] =  new int [arr.length];
		int result [] =  new int [arr.length];
		
		int n= arr.length;
		prefix[0] =1;
		
		for(int i=1;i<arr.length;i++)
		{
			prefix[i]= prefix[i-1]* arr[i-1];
		}
		
		suffix[n-1] = 1;
		
		for(int i=n-2;i>=0;i--)
		{
			suffix[i]= suffix[i+1]* arr[i+1]; 
		}
		
		for(int i=0;i<n;i++)
		{
			result[i] = prefix[i]* suffix[i];
		}
		return result;
	}

	private static int[] productExceptSelf(int[] arr) {
		// TODO Auto-generated method stub
		int n= arr.length;
		
	   int[] result = new int [n];
	   
	   result [0]=1;
	   
	   for(int i=1;i<n;i++)
	   {
		   result[i] = result[i-1]*arr[i-1];
	   }
	   
	   int suffix =1;
	   
	   for(int i=n-1;i>=0;i--)
	   {
		   result[i] = result[i]* suffix;
		   suffix = suffix* arr[i];
	   }
		return result;
	}
}
