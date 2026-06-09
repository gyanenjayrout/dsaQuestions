package TwoPointerApproach;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 26;

        int[] result = twoSum(nums, target);
        int[] result2 = Twosum(nums, target);
        
        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Indices: " + result2[0] + ", " + result2[1]);
    }

	private static int[] Twosum(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		Map<Integer, Integer> map  = new HashMap<>();
		
		for(int i=0;i<nums.length;i++)
		{
			
			int comp  =target - nums[i];
			
			
			
			if(map.containsKey(comp))
			{
			  return new int [] { map.get(comp), i};
			}
			
			map.put(nums[i], i );
		}
		return new int [] {-1,-1};
	}

	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		
		int start = 0;int end =nums.length-1;
		
		while(start<end)
		{
			int sum = nums[start]+nums[end];
			
			if(sum==target)
			{
				return new int [] {start, end};
			}else if(sum<target)
			{
				start++;
			}else
			{
				end--;
			}
			
			
		}
		return new int []{-1,-1};
	}
	
	
	

/*	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		/*
		 *  Iterate through the array with two nested loops:
		    Outer loop selects each element (nums[i]).
		    Inner loop checks all subsequent elements (nums[j]) for a pair that sums to the target.
		 
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					return new int []{i,j}; //If a pair is found, return the indices i and j.
				}
			}
		}
		return new int []{-1,-1};
	}
*/
}
