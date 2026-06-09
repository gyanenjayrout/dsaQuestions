package Array;

import java.util.Arrays;

public class MAxsumofSubArray {
	public static void main(String[] args) {
		int[]arr  = {2,-3,4,-1,-2,1,5,-3};
		
		int [] res  = FindMaxSubArary(arr);
		System.out.println(Arrays.toString(res));
		
		int maxSubAraryBrutFOrce = FindMaxSubAraryBrutFOrce(arr);
		
		System.out.println(maxSubAraryBrutFOrce);
	}
/*
	private static int[] FindMaxSubArary(int[] arr) {
		// TODO Auto-generated method stub
		
		
		int maxsum =Integer.MIN_VALUE;
		
		int start =0;
	    int end = 0;
	    int sum = 0;
	    
	    int tempstart = 0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	sum  =sum+arr[i];
	    	
	    	if(sum>maxsum)
	    	{
	    		maxsum = sum;
	    		start = tempstart;
	    		end = i;
	    		
	    	}
	    	
	    	if(sum<0)
	    	{
	    		sum = 0;
	    		tempstart = i+1;
	    		
	    	}
	    }
		return Arrays.copyOfRange(arr,start, end+1);
	}
	*/
	
	private static int FindMaxSubAraryBrutFOrce(int[] arr)
	{
		 int maxSum = arr[0];  
		    int currentSum = arr[0];
		    for (int i = 1; i < arr.length; i++) {
		        currentSum = Math.max(arr[i], currentSum + arr[i]);
		        maxSum = Math.max(maxSum, currentSum);
		    }
		    return maxSum;
		
		
		
//        int maxsum =Integer.MIN_VALUE;
//        
//        int sum = 0;
//        
//        for(int i=0;i<arr.length;i++)
//        {
//            
//            sum = sum+arr[i];
//
//
//            
//            if(sum>maxsum)
//            {
//                maxsum  =sum;
//                
//                
//            }
//// we need to set the sum= 0 after calculating the maxsum coz if any array conatin only -ve number
//// int arr 1[]= {-1,-2,-3,-4,-5}; den the maxsubaray is -1 not 0
//
//            
//            if(sum<0)
//            {
//                sum = 0;
//            }
//        }
//        
//        
//        return maxsum;

	}

	private static int[] FindMaxSubArary(int[] arr) {
		// TODO Auto-generated method stub
		
		
		int maxsum = Integer.MIN_VALUE;
		
		int end =0;
		int start= 0;
		
				
		for(int i=0;i<arr.length;i++)
		{
			
			int sum = 0;
			
			for(int j =i;j<arr.length;j++)
			{
				sum = sum +arr[j];
				
				if(sum>maxsum)
				{
					maxsum =sum;
					start  =i;
					end = j;
				
				}
				
				
			}
		}
		return Arrays.copyOfRange(arr, start , end+1);
	}
	
	
	
	

}
