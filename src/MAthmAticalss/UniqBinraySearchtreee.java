package MAthmAticalss;

public class UniqBinraySearchtreee {
	public int numTrees(int n) {
		
		if(n<=1) return 1;
		int total =0;
		
		for(int i=1;i<=n;i++)
		{
			total +=  numTrees(i-1) * numTrees(n-i);
		}
		
		return total;
	}
	
	public int numTrees2(int n)
	{
		int dp [] = new int [n+1];
		
		dp[0] = 1;
		dp[1] =1;
		
		for(int nodes =2;nodes<=n;nodes++)
		{
			for(int root =1;root<=nodes;root++)
			{
				dp[nodes] += dp[root-1] * dp[nodes-root];
			}
		}
		
		return dp[n];
	}
}

/*
 * 
 * We need to count how many unique BSTs can be formed using values from 1 to n.
 * In a BST, if I pick any value i as root, then all values smaller than i go to the left, and all greater go to the right.”
 * 
 * So for every possible root i, the left subtree will have (i-1) nodes and the right subtree will have (n-i) nodes
 * 
 * Number of BSTs = (ways to build left subtree) × (ways to build right subtree)”

“And I’ll sum this for all possible roots.”


his works, but it has overlapping subproblems and will be exponential.”(recurssion)


or each root, I multiply left and right subtree counts and sum over all roots.”

Show Formula (Optional but Powerful)

dp[n]=∑i=1ndp[i−1]⋅dp[n−i]
dp[n]=∑
i=1
n
	​

dp[i−1]⋅dp[n−i]


I’ll pick each number as root. For each root, left subtree has i-1 nodes and right has n-i nodes. Total trees = left × right. I sum this for all roots.
This gives a recursive solution, but since there are overlapping subproblems, I optimize it using DP.
This is also a known Catalan number problem
 * 
 */
