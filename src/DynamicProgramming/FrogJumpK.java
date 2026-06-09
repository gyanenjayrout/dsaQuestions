package DynamicProgramming;

import java.util.Arrays;

/*
 * 
 * 
Pick minimum!

So instead of just checking 2 previous stairs,
now check K previous stairs → take the minimum

dp[i] = min(
    dp[i-1] + |h[i]-h[i-1]|,
    dp[i-2] + |h[i]-h[i-2]|,
    dp[i-3] + |h[i]-h[i-3]|,
    ...upto k steps back
    "Instead of looking back just 1 or 2 stairs, I now look back up to K stairs."
"For each stair i, I run a loop from j=1 to k, checking all possible previous positions."
"I pick whichever previous stair gives me the minimum total cost."
"It's the same recurrence — just the inner loop replaces the two fixed choices."
)
 */
public class FrogJumpK {
	
	
	public static void main(String[] args) {
        int[] heights = {10, 20, 30, 10};
        int k = 3;
        System.out.println(solve(heights.length - 1, heights, k)); // 30
        
        
        int n = heights.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        System.out.println(solve2(n - 1, heights, k, dp));
    }
	
//Tabulation	
	private static int solveTab(int[] heights, int k) {
		
		int n = heights.length;
		int [] dp = new int[n];
		
		dp[0] =0;
		for(int i=1;i<n;i++)
		{
			int mincost = Integer.MAX_VALUE;
			
			for(int j=1;j<=k;j++)
			{
				int minjup = dp[i-j]  + Math.abs(heights[i] - heights[i - j]);
				
				mincost = Math.max(mincost, minjup);
			}
			
			dp[i] = mincost;
		}
		
		return dp[n-1];
		
	}
	
	
//Memoization (Important for Interview) -->O(n*k) ✅
	private static int solve2(int i, int[] heights, int k, int[] dp) {
		// TODO Auto-generated method stub
		  if (i == 0) return 0;
		  
		  if(dp[i] != -1) return dp[i];
		  int mincost= Integer.MAX_VALUE;
		  
		  for(int j=1;j<=k;j++)
		  {
			  if(i-j>=0)
			  {
				  int jmpcost = solve2(i-j, heights, k, dp) + Math.abs(heights[i]- heights[i-j]);
				  
				  mincost = Math.min(mincost, jmpcost);
			  }
		  }
	
//		  dp[i] = minCost;
//		  return dp[i];
		return dp[i] = mincost;
	}

	private static int solve(int i, int[] heights, int k) {
		// TODO Auto-generated method stub
		
		  // Base case
        if (i == 0) return 0;

        
        int minCost   = Integer.MAX_VALUE;
        
        for(int j =1;j<=k;j++)
        {   
        	if (i - j >= 0) {  // don't go out of bounds
        	int jump = solve(i-j,heights,k)+ Math.abs(heights[i] -heights[i-j]);
        	minCost  = Math.min(jump, minCost );
        	}
        }	
		return minCost ;
	}
	
	

}


/*
 * ## Recursion Tree for K=3

```
heights = [10, 20, 30, 10]
index =   [ 0,  1,  2,  3]
k = 3

solve(3)
```

------

## Reading the Tree

**solve(3) makes 3 calls** — j=1, j=2, j=3 (since k=3)

```
solve(3)
  ├── j=1 → solve(2)          ← expand this fully
  ├── j=2 → solve(1)          ← expand this
  └── j=3 → solve(0)          ← base case, done
```

**solve(2) makes 2 valid calls** — j=1, j=2 (j=3 would go to index -1, skip)

```
solve(2)
  ├── j=1 → solve(1)          ← REPEATED! Already called above
  ├── j=2 → solve(0)          ← base case
  └── j=3 → i-j < 0, skip
```

---

## The Repeated Work

| Call | Computed by |
|---|---|
| solve(1) | solve(3) directly AND solve(2) |
| solve(0) | solve(3), solve(2), solve(1) × multiple times |

**This is exactly why we memoize** — `memo[1] = result` the first time, return cached value the second time. No recomputation!

---

## 🎤 Say This In Interview

> *"Every node tries up to K branches. But the same subproblem — like solve(1) — gets hit from multiple parents. Without memoization, we recompute it every time. With memo, we compute it once and cache it. That's what brings us from O(k^n) down to O(n×k)."*
 */
