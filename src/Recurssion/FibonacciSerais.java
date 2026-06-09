package Recurssion;
//The Fibonacci sequence, also known as Fibonacci numbers, is defined as
//the sequence of numbers in which each number in the sequence is equal to the sum of two numbers before it.


/*
 * 
 * Input	   Meaning	                                Output
fib(7)	     value at index 7	                        13
print        first 7 Fibonacci numbers	              sequence count	0 1 1 2 3 5 8
 */
public class FibonacciSerais {
	
	public static void main(String[] args) {
		int a =0;
		int b =1;
		System.out.println(0);
		System.out.println(1);
		
		int n = 7;
		printiFibonacci(a, b, n-2);
		 
		 System.out.println("----------------");
		 
		 int ans = calclateFibonaci(7);
		 System.out.println(ans);
		 
		
	}

	private static int calclateFibonaci(int n) { // fibonacci number of n 
		// TODO Auto-generated method stub
		
		if(n==0 || n==1) return n;
		
		return calclateFibonaci(n-1)+calclateFibonaci(n-2);
		
	}

	private static void printiFibonacci(int a, int b, int n) { //Printing first n Fibonacci numbers
		// TODO Auto-generated method stub
		   if (n == 0) {
		        return;
		    }

		    int c = a + b;

		    System.out.println(c);

		    printiFibonacci(b, c, n - 1);
		
	}

}
