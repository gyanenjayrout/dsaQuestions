package stack;

/*
 * 
 * while(!stack.isEmpty() && condition)
    stack.pop();

if(stack.isEmpty())
    answer[i] = something;
else
    answer[i] = something using stack.peek();

stack.push(i);
 */

import java.util.*;
public class StockSpan_2 {
	
	public  static int [] getallStockSpan(int arr [])
	{
		
		int [] stockspan = new int [arr.length];
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<arr.length;i++)
		{
			while(!stack.isEmpty()  && arr[stack.peek()]<= arr[i])
			{
				stack.pop();
			}
			
			if(stack.size()==0)
			{
				stockspan[i]= i+1;
			}
			else
			{
				stockspan[i] = i-stack.peek();
			}
			
			stack.push(i);
			
		}
		
		
		return stockspan;
		
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {100, 80, 60, 70};
		int[] getallStockSpan = getallStockSpan(arr);
		
		System.out.println(Arrays.toString(getallStockSpan));
		
	}

}
