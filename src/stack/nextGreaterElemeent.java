package stack;

import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElemeent {
	
	public static void main(String[] args) {
		int arr[] = {4, 5, 2, 10, 8};
		
		
		int result []  = findnextgreaterElemnt(arr);	
		
		System.out.println(Arrays.toString(result));
		
	}
/*
	private static int[] findnextgreaterElemnt(int[] arr) {
		
		int n =  arr.length;
		
		Stack<Integer> stack =  new Stack<>();
		int result []  = new int[n];
		
		for(int i = n-1;i>=0;i--)
		{
			while(!stack.isEmpty() && stack.peek()<=arr[i])
			{
				stack.pop();
			}
			
			result[i]  = stack.isEmpty()?-1:stack.peek();
			
			stack.push(arr[i]);
			
		}
		// TODO Auto-generated method stub
		return result;
	}
	*/
	
	private static int[] findnextgreaterElemnt(int[] arr) {
		
		
		int n =  arr.length;
		
		int[] result  = new int [n];
		
		
		for (int i = 0; i < n; i++) {
	        result[i] = -1; // Default value when no greater element is found
	        for (int j = i + 1; j < n; j++) {
	            if (arr[j] > arr[i]) {
	                result[i] = arr[j];
	                break;
	            }
	        }
	    }
		
		return result;
	
		
	}
	

}
