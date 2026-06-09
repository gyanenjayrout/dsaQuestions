package Wissen_technology;
import java.util.*;
public class NExtGreaterElementII {

	public static void main(String[] args) {
		int []arr=  {5 ,6, 3, 2, 1};
		
		int n = arr.length;
		Stack<Integer> stack = new Stack<Integer>();
		
		int [] res = new int [n];
		
		Arrays.fill(res, -1);
		for(int i=0;i<arr.length *2;i++)
		{
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i%n])
			{
				res[stack.pop()]= arr[i%n];
			}
			
			if(i<n)
			{
				stack.push(i);
			}
		}
		
		System.out.println(Arrays.toString(res));
	}
}
