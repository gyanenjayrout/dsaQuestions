package DynamicProgramming;

import java.util.Arrays;

public class FrogJump {
	
	
	    int minCost(int[] height) {
	        // code here
	          int n= height.length;
	        int mincost = froggJmp(n, height);
	        
	        return mincost;
	    }
	    
	    public int froggJmp(int i, int [] height)
	    {
	        
	        if(i==0) return 0;
	        
	        int oneStep = froggJmp(i-1, height)+ Math.abs(height[i]-height[i-1]);
	        
	        
	        int twoStep = Integer.MAX_VALUE;
	        
	        if(i>=2)
	        {
	             twoStep = froggJmp(i-2, height) +Math.abs(height[i]-height[i-2]);
	        }
	        
	        return Math.min(oneStep, twoStep);
	        
	        
	        
	    }
	    
	        int minCost2(int[] height) {
	            // code here
	              int n= height.length;
	            int[] memo = new int[n];
	            Arrays.fill(memo, -1);
	            int  mincost = froggJmp2(n-1, height, memo);
	            return mincost;
	        }
	        
	        public int froggJmp2(int i, int [] height,int [] memo)
	        {
	            
	            
	            if(i==0) return 0;
	            
	            if(memo[i] !=-1) return memo[i];
	            
	            
	            int oneStep = froggJmp2(i-1, height, memo)+ Math.abs(height[i]-height[i-1]);
	            
	            
	            int twoStep = Integer.MAX_VALUE;
	            
	            if(i>=2)
	            {
	                 twoStep = froggJmp2(i-2, height, memo) +Math.abs(height[i]-height[i-2]);
	            }
	            
	            memo[i]=  Math.min(oneStep, twoStep);
	            
	            return memo[i];
	            
	            
	            
	        }
	        
	        
	        int minCost3(int[] height) {
	            // code here
	            int n = height.length;
	            int []  dp = new int [n];
	            
	            dp[0] = 0;
	            
	            
	            for(int i=1;i<n;i++)
	            {
	                int onestep = dp[i-1]+ Math.abs(height[i]-height[i-1]);
	                
	                int twostep = Integer.MAX_VALUE;
	               if(i>=2)
	               {
	                    
	                twostep = dp[i-2] +Math.abs(height[i]-height[i-2]);
	               }
	                
	                dp[i]= Math.min(onestep ,twostep);
	                
	            }
	            
	            
	                return dp[n-1];
	            
	        }
	        
	        
	        int minCost4(int[] height) {
	            // code here
	            
	            int  n= height.length;
	            
	            
	            int prev1 = 0;
	            int prev2 =0;
	            
	            
	            for(int i=1;i<n;i++)
	            {
	                
	                 int onestep= prev1 + Math.abs(height[i]-height[i-1]);
	                 
	                 
	                 int twostep = Integer.MAX_VALUE;
	                 
	                 if(i>=2)
	                 {
	                     
	                       twostep = prev2 + Math.abs(height[i]-height[i-2]);
	                 }
	                 
	                 int curr = Math.min(onestep, twostep);
	                 
	                 prev2 = prev1;
	                 prev1 = curr;
	            }
	             
	             return prev1;
	            
	        }
	    
	

}
