package Recurssion;
//Use Divide and Conquer to break the problem into smaller parts.
public class XpowN_Ologn_height {
	
public static void main(String[] args) {
		
		double x =2.0000;
		int n =-3;
		
		double result = power(x, n);
		
		System.out.println(result);
	}

	private static double power(double x, int n) {
		// TODO Auto-generated method stub
		if(n==0)
		{
			return 1;
		}
		if(x==0)
		{
			return 0;
		}
		
		if (n < 0) {
		    x = 1 / x; // x = 1 / 2.0 = 0.5
		    //x^−2 would attempt to calculate x×x×x...x×x×x... indefinitely without stopping because 
//		    n doesn't approach 0.
		    n = -n;    // n = -(-3) = 3
		    
//		    For large negative values of n, such as n=−2^31, decrementing nn never reaches the base case (n == 0) due to integer overflow.
		    //Handle n<0n<0 by inverting xx and making nn positive.
//		    Use an optimized approach to reduce the number of recursive calls using Divide and Conquer.
		}
		
//		int xpownm1 = power(x, n-1);
//		int result = x* xpownm1;
//		return result;
		
		if(n%2==0)
		{
			return power(x, n/2)*power(x, n/2);
		}
		else{
			return power(x, n/2)*power(x, n/2) *x;
			
		}
		
		
		
	}
	
	/*
	 * Why Stack Overflow Happens

    Recursive Depth Issue:
    The function keeps calling itself with n - 1 without an end in some cases.
        For large negative values of n, such as n=−231n=−231, decrementing nn never reaches the base case (n == 0) due to integer overflow.
        Instead of terminating, the recursion continues indefinitely, causing the program's call stack to exhaust its allocated memory.

    Edge Case Handling:
    The code does not handle negative powers (n<0n<0), which require the base xx to be inverted and nn to be made positive. Without this handling, the recursion does not behave as intended.

How to Explain Stack Overflow in an Interview

    Recursive Calls Exceed Memory:
        Explain that each recursive call adds a frame to the call stack, which stores information such as local variables and the return address.
        When too many recursive calls are made without termination, the stack exceeds its allocated memory, leading to a Stack Overflow.

    Edge Case Trigger:
        For n=−231n=−231, converting it to positive using -n will overflow the integer range. This leads to infinite recursion.
        You can mention that the code fails to handle large negative values properly.
	 */

}
