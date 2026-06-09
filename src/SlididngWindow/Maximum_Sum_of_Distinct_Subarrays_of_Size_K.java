package SlididngWindow;
import java.util.*;
public class Maximum_Sum_of_Distinct_Subarrays_of_Size_K {
public static void main(String[] args) {
	int [] nums = {1,5,4,2,9,9,9};
			int k = 3;
			
			int maximum = maxSumDistinctBrute(nums, k);
			
			System.out.println(maximum);
}
public long maximumSubarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    long maxsum =0;
    long sum=0;
    int left =0;
    
    for(int right=0;right<nums.length;right++)
    {
        map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
        sum = sum+nums[right];
        
        /* Add new Number
         * if size > k remove Left
         * if mapSize  == k  and ( window Length also ==k) den all are distinct
         */

        if(right-left+1>k)
        {
            map.put(nums[left], map.get(nums[left])-1);

            if(map.get(nums[left])==0)
            {
                map.remove(nums[left]);
            }

            sum = sum-nums[left];
            left++;
        }

        if(right-left+1== k && map.size()==k )
        {
            maxsum = Math.max(maxsum, sum);
        }

    }
    return maxsum;

}

private static int maxSumDistinctBrute(int[] nums, int k) {
	// TODO Auto-generated method stub
	
	int maxsum =0;
	
	for(int  i=0;i<=nums.length-k;i++)
	{
		Set<Integer> set  = new HashSet<>();
		int currsum =0;
		boolean valid = true;
		
		for(int j =i;j<i+k;j++)
		{
			if(set.contains(nums[j]))
			{
				valid =false;
				break;
			}
			
			set.add(nums[j]);
			currsum = currsum+nums[j];
			
		}
		
		if(valid)
		{
			maxsum = Math.max(maxsum, currsum);
		}
	}
			
	return maxsum;
}


class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        
        Set<Integer> set = new HashSet<>();

        int currsum =0;
        long maxsum =0;
        int start =0;

        for(int i=0;i<nums.length;i++)
        {
            currsum = currsum + nums[i];

            if(i-start+1 >k)
            {
                
                 set.remove(nums[start]);
                 currsum = currsum - nums[start];
                  start++;
            }
            set.add(nums[i]);

            if(i-start+1 ==k && set.size()==k)
            {
               maxsum = Math.max(maxsum, currsum); 
            }
        }
         return maxsum;

        }

       
    
}
}
