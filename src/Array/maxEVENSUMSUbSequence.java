package Array;

import java.util.Arrays;

public class maxEVENSUMSUbSequence {
	public static void main(String[] args) {
		int[] nums = {3, 2, 7, 10,1};
        System.out.println("Maximum Even Sum: " + maxEvenSum(nums));
	}
/*
	private static int maxEvenSum(int[] nums) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int num:nums)
		{
			sum = sum +num;
		}
			
			if(sum %2==0)
			{
				return sum;
			}
			else
			{
				int minelement = Integer.MAX_VALUE;
				
				for(int  i =0;i<nums.length;i++)
				{
					if(nums[i]%2!=0 && nums[i]<minelement)
					{
						minelement = nums[i];
					}
				}
				
				sum =sum-minelement;
				
				
				
			}
		
		return sum;
	}
	
	*/

	private static int maxEvenSum(int[] nums) {
		// TODO Auto-generated method stub
		
		Arrays.sort(nums);
		
		int sum  =0;
		int minelement = Integer.MAX_VALUE;
		
		for(int num:nums)
		{
			if(num>0)
			{
				sum = sum+num;
				if(num%2!=0)
				{
					minelement = Math.min(num, minelement);
				}
			}
			
			
		}
		
		if(sum %2==0)
		{
			return sum;
		}
		
		return sum - minelement;
	}

}
