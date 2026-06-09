package Greedy;

import java.util.Arrays;

//nums[i] = maximum jump length from index i
//nums[i] = maximum jump length, not unlimited jump
/*
 * 
 * ✔ You can take any jump ≤ nums[i]
✔ You CANNOT jump farther than that
✔ You CAN jump to last index only if it lies in that range

solve(1) = min(
    1 + solve(2),
    1 + solve(3),
    1 + solve(4)
)
Starting from index 0,
what is the minimum number of jumps needed to reach last index?
 */
public class JumpII {

	
	public int jump(int[] nums) {
        return solveREcurssion(0, nums);
    }

	private int solveREcurssion(int i, int[] nums) {
		
		/*
		 * Recursion (Brute Force)
Code idea:
solve(i) = min(1 + solve(i + j))
		 */
		// TODO Auto-generated method stub
		
		if(i>= nums.length-1) return 0;	
		 int minJumps = Integer.MAX_VALUE;
		 
		 
		 for(int j=1; j<=nums[i];j++)
		 {
		
			 int next = solveREcurssion(i+j, nums);
			 
			 if (next != Integer.MAX_VALUE) {
	                minJumps = Math.min(minJumps, 1 + next);
	                //+1 = the jump you are making RIGHT NOW
	                //1 (current jump) + future jumps
	                //1 (current jump) + future jumps
	                
	                /*
	                 * At each index, I try all possible jumps.
For every jump, I add 1 for the current move,
and recursively compute the minimum jumps needed from the next position.
Worst case:

nums[i] ≈ n
So:
TC = O(n^n) ❌ (exponential)
SC = O(n)
	                 */
	            } 
		 }
		return minJumps;
	}
	
	private int solveDP(int i, int[] nums,int[] dp) {
		
	
		int minJumps = Integer.MAX_VALUE;
		if(dp[i] != -1) return dp[i];
		
		for(int j=1;j<nums[i];j++)
		{
			if(i+j <nums.length)
			{
				 int next = solveDP(i+j , nums, dp);
				 if (next != Integer.MAX_VALUE) {
					 minJumps = Math.max(minJumps, next+1);
				 }
				
			}
			
		}
		/*
		 * Each index computed once → n states
Each state → loop up to n

TC = O(n²) ✅
		 */
		return dp[i] = minJumps;
		
	}
	
	
    private int solveTabulation( int[] nums)
    {
    	int n = nums.length;
    	int[] dp = new int[n];
    	Arrays.fill(dp, Integer.MAX_VALUE);
    	dp[n - 1] = 0;

    	for (int i = n - 2; i >= 0; i--) {
    	    for (int j = 1; j <= nums[i]; j++) {
    	        if (i + j < n) {
    	            dp[i] = Math.min(dp[i], 1 + dp[i + j]);
    	        }
    	    }
    	}
    	 return dp[n+1]; //O(n²)
    }
    
    
   
}
