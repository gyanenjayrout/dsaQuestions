package Hashing;
import java.util.*;
public class COntainsDuplicates {
	
	
	public boolean containsDuplicate(int[] nums, int k) {
		
		Set<Integer> set = new HashSet<>();
		
		for(int num: nums) 
		{
			if(set.contains(num))
			{
				return true;
			}
		}
		
		return  false;
	}
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {

	       Map<Integer, Integer> map = new HashMap<>();

	       for(int i=0;i<nums.length;i++)
	       {
	          if(map.containsKey(nums[i]))
	          {
	            if(i - map.get(nums[i])<=k) return true;
	          }


	        map.put(nums[i], i);
	       }
	       return false;
	    }
	}

