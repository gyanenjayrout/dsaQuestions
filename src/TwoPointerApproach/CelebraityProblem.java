package TwoPointerApproach;

public class CelebraityProblem {
	public int celebrity(int[][] M, int n) {
		
		int a =0;
		int b = n-1;
		
		while(a<b)
		{
			if(M[a][b]==1)
			{
				a++;
			}else
			{
				b--;
			}
		}
		
		int candidate =a;
		
		for(int i=0;i<n;i++)
		{
			if(i != candidate)
			{
				if(M[candidate][i] ==1 || M[i][candidate] ==0 )
				{
					return -1;
				}
			}
		}
		
		return candidate;
		
	}
	
	
	public int celebrity2(int[][] M, int n) 
	{
		
		int candidate = 0;
		for(int i=0;i<n;i++)
		{
			if(M[candidate][i]==1)
			{
				candidate = i;
				/*
				 * if candidate knows i
                   candidate cannot be celebrity
                   so update candidate
				 */
			}

		}
		
		
		for(int i=0;i<n;i++)
		{
			if(M[candidate][i] ==1 || M[i][candidate]==0)
			{
				return -1;
			}
		}
		
		return candidate;
	}
	
		
}
