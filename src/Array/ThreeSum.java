package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	
	public static void main(String[] args) {
		  int[] nums = {-1, 0, 1, 2, -1, -4};
		  
		List<List<Integer>> list  = ThreeSum(nums);
		
		for(List<Integer> l :list)
		{
			System.out.println(l);
		}
	      
		}
/*
	private static List<List<Integer>> ThreeSum(int[] nums) {
		// TODO Auto-generated method stub
		
		Set<List<Integer>> set  =  new HashSet<>();
		
		for(int i=0;i<nums.length-2;i++)
		{
			for(int j=i+1;j<nums.length-1;j++)
			{
				for(int k=j+1;k<nums.length;k++)
				{
					if(nums[i]+nums[j]+nums[k]==0)
					{
						List<Integer> temp =Arrays.asList(nums[i], nums[j], nums[k]);
						Collections.sort(temp);
						set.add(temp);
					}
				}
			}
		}
		return new ArrayList<>(set);
	}
	*/ 
	private static List<List<Integer>> ThreeSum(int[] nums) {
		
		
	 Set<List<Integer>> set =  new HashSet<>();
	 Arrays.sort(nums);
	 
	 for(int i=0;i<nums.length-2;i++)
	 {
		 if(i>0 && nums[i]==nums[i-1])
		 {
			 continue;
		 }
		 
		 int start = i+1;
		 int end = nums.length-1;
		 
		 while(start<end)
	        {
	            int sum = nums[i]+nums[start]+nums[end];
	 
	            if(sum==0)
	            {
	                List<Integer> temp = Arrays.asList(nums[i], nums[start], nums[end]);
	                set.add(temp);
	 
	                while(start<end && nums[start]== nums[start+1])
	                {
	
	                	start++;
	                }
	 
	                while(start<end  && nums[end]==nums[end-1])
	                {
	                    end--;
	                }
	 
	                start++;
	                end--;
	            }
	            else if(sum<0)
	            {
	                start++;
	            }
	            else
	            {
	                end--;
	            }
	        }
	 }
	 
	 return new ArrayList<>(set);
		
	}
}
