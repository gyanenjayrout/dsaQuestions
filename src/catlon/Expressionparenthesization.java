package catlon;
//This classic problem is counting Catalan numbers — the number of valid parenthesizations of n pairs equals the nth Catalan number.

/*
 * Instead of constructing parentheses, I assume a structure (inside) + outside.
Then I try all possible counts of pairs inside, and remaining outside.
This leads to dp[i] += dp[j] * dp[i-j-1].
 */
public class Expressionparenthesization {
	
	public static int countParentheses(int n) {
		
		if(n==0 || n==1) return 1;
		
		int total =0;
		
		for(int i=0;i<n;i++)
		{
			int inside = countParentheses(i);
			int outside= countParentheses(n-i-1);
			/*
			 * i=0 → (0,2)
               i=1 → (1,1)
               i=2 → (2,0)
			 */
			total += inside* outside;
			
		}
		
		return total;
		
	}
	
	public static int countParenthesesUsingDP(int n) {
	
		int dp[] = new int[n+1];
	    
		dp[0] =1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				dp[i] += dp[j] * dp[i-1-j];
				/*
				 * dp[i] = Σ dp[j] * dp[i-1-j]
				 * "Yes, this follows Catalan recurrence.
The DP solution is computing Catalan numbers using recurrence, and we can further optimize using the direct Catalan formula."
				 */
			}
			/*
			 * j = inside
               i-1-j = outside
               Time Complexity: O(n²)
              Space Complexity: O(n)
			 */
		}
		
		return dp[n];
		
/*
 j = 0
inside = 0 → dp[0] = 1
outside = 2 → dp[2] = 2

👉 contribution = 1 × 2 = 2

j = 1
inside = 1 → dp[1] = 1
outside = 1 → dp[1] = 1

👉 contribution = 1 × 1 = 1

j = 2
inside = 2 → dp[2] = 2
outside = 0 → dp[0] = 1

👉 contribution = 2 × 1 = 2
		 */
		
	}
	
	/*
	 * 
	 * I observe that valid parentheses follow a recursive structure.
Any valid string can be written as (inside) + outside.
So I try all possible splits and use DP:
dp[i] += dp[j] * dp[i-j-1]
This is a classic Catalan problem."
	 */
	
	/*
	 * 
	 * 👉 Every valid parentheses structure must start like this

First () is fixed conceptually
Now we decide:
what goes inside
what goes outside

( inside ) outside  ( dp[j] ) dp[i-j-1]
	 */
	public static long countFormula(int n) {
		/*
		 * “This is actually a Catalan number.
We can compute it using a direct formula in O(n) time.”
		 */
	    long result = 1;
	    for (int i = 0; i < n; i++) {
	        result = result * 2 * (2 * i + 1) / (i + 2);
	    }
	    return result;
	}
	public static void main(String[] args) {
		System.out.println(countParentheses(3));
	}
	
// using backtacking
	
	public static int countBacktrack(int n) {
	    return generate("", 0, 0, n);
	}

	private static int generate(String s, int open, int close, int n) {
	    if (s.length() == 2 * n) return 1;
	    int count = 0;
	    if (open < n)      count += generate(s + "(", open + 1, close, n);
	    if (close < open)  count += generate(s + ")", open, close + 1, n);
	    return count;
	}

}


