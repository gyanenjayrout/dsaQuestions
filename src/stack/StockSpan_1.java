package stack;

import java.util.Stack;

public class StockSpan_1 {
	
	Stack <int []> stack;
	
   public StockSpan_1()
   {
	   stack = new Stack<>();
   }
   
   public int next(int price)
   {
	   
	   int span= 1;
	   while(!stack.isEmpty() && stack.peek()[0]<=price)
	   {
		   span = span+stack.peek()[1];
		   stack.pop();
	   }
	   
	   
	   stack.add(new int [] {price, span});
	   
	   return span;
   }

}

