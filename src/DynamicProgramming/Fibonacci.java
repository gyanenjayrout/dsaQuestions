package DynamicProgramming;

import java.util.HashMap;
import java.util.*;
public class Fibonacci 
{
	
	public static int fib(int n)  //---> naive
	{
		if(n<=1) return n;
		return fib(n-1)+fib(n+1);
		/*
		 * Problem: fib(5) calls fib(3) twice, fib(2) three times... exponential waste.

⏱ Time: O(2^n) | 🗂 Space: O(n) call stack


		 */
	}
	
	
	
	//Memoization (Top-Down DP)
	public static int fib2(int n)
	{
		if(n<=1) return n;
		
		Map<Integer, Integer> cache = new HashMap<>();
		

        // Already solved? Return cached result
		if(cache.containsKey(n)) {
			return cache.get(n);
		}
		
		int result = fib2(n-1)+fib2(n-2);
		
		// Cache it before returning
		cache.put(n, result);
		return result;
		
		/*
		 * Same recursion, just remember answers. Each subproblem solved exactly once.

⏱ Time: O(n) | 🗂 Space: O(n) memo + stack
		 */
		
	}
	
	
	//📊 Tabulation (Bottom-Up DP)
	
	public static int fib3(int n)
	{
		if(n<=1) return n;
		
		int dp[] = new int[n+1];
		
		dp[0]= 0;
		dp[1] = 1;
		
		for(int i=2;i<=n;i++)
		{
			dp[n] = dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	/*
	 * Build answers from base case upward. No recursion, no stack overflow risk.

⏱ Time: O(n) | 🗂 Space: O(n)	
	 */
		
	}
	
	//4. ⚡ Space Optimized Tabulation
	public static int fib4(int n)
	{
		if(n<=1) return n;
		
		int prev2 = 0, prev1 = 1;
		
		for(int i=3;i<=n;i++)
		{
			int current = prev1+prev2;
			
			prev2 = prev1;
			prev1 = current;
		}
		
		return prev1;
		/*
		 * 
We only ever need the **last 2 values** — no need for the full array.
- ⏱ Time: `O(n)` | 🗂 Space: **`O(1)`** ✅

		 */
		
	}


}
/*
 * ```
Recursion → find the recurrence relation
     ↓
Memoization → cache repeated subproblems (Top-Down)
     ↓
Tabulation → eliminate recursion entirely (Bottom-Up)
     ↓
Space Optimize → keep only what you need


 */
