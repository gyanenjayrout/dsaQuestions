package stack;

import java.util.Arrays;
import java.util.Stack;



/*
 * 
 * Daily Temperatures

Medium

Topics

Companies Hint

Solved

Given an array of integers temperatures represents the daily temperatures, return an array answer 
such that answer [1] is the number of days you have to wait after the 1th day to get a warmer temperature. If there is no future day for which this is possible, keep answer [1] instead.

Input: temperatures = [73,74,75,71,69,72,76,73]

Output: [1,1,4,2,1,1,0,0]

Input: temperatures = [30,40,50,60]

Output: [1,1,1,0]
 */
public class Daily_Temprature {
	
	public static void main(String[] args) {
		int [] temperatures = {73,74,75,71,69,72,76,73};
		
		int result []  =measureTemp(temperatures);
		
		int[] measureTempBrutforce = measureTempBrutforce(temperatures);
		
		
		System.out.println(Arrays.toString(result));
		
		System.out.println(Arrays.toString(measureTempBrutforce));
	}

	private static int[] measureTemp(int[] arr) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<>();
		int[] result = new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i])
			{
				result[stack.peek()] = i-stack.peek();
				stack.pop();
			}
			stack.push(i);
		}
		
		return result;
	}

	private static int[] measureTempBrutforce(int[] arr) {
		// TODO Auto-generated method stub
		int[] result = new int[arr.length];
		
		for(int i=0;i< arr.length;i++)
		{
			for(int j= i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					result[i] = j-i;
					break;
				}
			}
		}
		return result;
	}

}
