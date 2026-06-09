package stack;

import java.util.Stack;

public class pushToBottomofStack {
	
	public static void addTobottom(int data, Stack<Integer>s)
	{
		if(s.isEmpty())
		{
			s.push(data);
			
			 return; // Explicitly stops further execution after the data is added to the empty stack
		}
		
		 int top = s.pop();
		addTobottom(data, s);
		s.push(top);
	}
	
	
	
	public static void main(String[] args) {
		Stack<Integer> s =  new Stack<>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		addTobottom(4, s);
		
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			
			s.pop();
		}
		
	}

}
