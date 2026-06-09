package stack;

import java.util.ArrayList;
import java.util.List;



public class ArrayListing {
	
	static class stack
	{
	
		static List<Integer> list=  new ArrayList<>();
		
		public static  boolean isEmpty()
		{
			return list.size()==0;
		}
		
		
		public static void   push(int data)
		{
			list.add(data);
		}
		
		public static int pop()
		{
			int top  = list.get(list.size()-1);
			
			list.remove(list.size()-1);
			return top;
		}
		
		public static int peek()
		{
			int top  = list.get(list.size()-1);
			
			
			return top;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		while(!stack.isEmpty())
		{
			System.out.println(stack.peek());
			
			stack.pop();
//			Since the peek() method doesn’t remove the element, the stack remains unchanged, 
//			and stack.isEmpty() will always return false. This causes the while loop to keep executing infinitely, 
//			printing the same top element repeatedly.
		}
	}
	

}
