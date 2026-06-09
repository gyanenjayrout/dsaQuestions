package Queue;

import java.util.Stack;

import Queue.CircularQueueUsingArray.Queue;

public class QueueUSingStack {
	
	static class Queue
	{
		static Stack<Integer> s1 = new Stack<>();
		static Stack<Integer> s2 = new Stack<>();
		
		public static boolean isEmptyy()
		{
			return s1.isEmpty();
		}
		
		
		public static void pushintostack(int data)
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			
			s1.push(data);
			
			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}
		}
		
		
		public static  int poppp()
		{
			if(s1.isEmpty())
			{
				return -1;
			}
			
			return s1.pop();
			
		}
		public static  int pekkk()
		{
			if(s1.isEmpty())
			{
				return -1;
			}
			
			return s1.peek();
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Queue q = new Queue();

        q.pushintostack(1);
        q.pushintostack(2);
        q.pushintostack(3);
        q.pushintostack(4);
        q.pushintostack(5);
        
        while(!q.isEmptyy())
        {
        	System.out.println(q.pekkk());
        	q.poppp();
        }
	}

}
