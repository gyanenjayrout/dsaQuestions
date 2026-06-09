package Recurssion;
//In short, a factorial is a function that multiplies a number by every number below it till 1. 
public class factorial {
	
	public static void main(String[] args) {
		int n =5;
		
		int caclualteFactorial = caclualteFactorial(n);
		
		System.out.println( "Factorial of 5 is : "   +caclualteFactorial);
	}

	private static int caclualteFactorial(int n) {
		// TODO Auto-generated method stub
		
//		if(n==1 || n==0)
//		{
//			return 1;
//			
//		}
//		
//		int cf = caclualteFactorial(n-1);
//		
//		int result  = n * cf;
//		
//		System.out.println(result);
//		//Each recursive call has its own stack frame, which stores local variables and parameters
//		
//		return  result;
		
		if(n==1 || n==0) return 1;
		
		
		return n * caclualteFactorial(n-1);
		
		
	}

}
/*
 *The recursive function has a base case where it stops if the input is 0 or 1. The recursive case breaks the problem 
 *into smaller parts by reducing the input value in each call. Each recursive call is pushed onto the call stack, and 
 *once the base case is reached, the stack starts unwinding. The intermediate results stored in  stack frames are then combined 
 *to calculate the final result. 
 *The time complexity is O(n), and the space complexity is also O(n) due to the stack space required for n calls.
 * 
 * */

