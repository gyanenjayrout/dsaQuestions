package Hashing;


import java.util.*;

public class LongestConseCutiveSequence {
  public static void main(String[] args) {
	  int [] nums = {100,4,200,1,3,2};
	   
	   
	   int lonegtst = findoutLogestConsecutive(nums);
	   
	   System.out.println(lonegtst);
	   
	   System.out.println(longestConsecutiveUsingLinearSearch(nums));
}
  
  public int longestConsecutive(int[] nums) {
      if(nums.length ==0) return 0;
      Set<Integer> set = new HashSet<>();

      for(int num : nums) set.add(num);

      
       int longest = 0;

  for(int num: set)
  {
      if(!set.contains(num-1))
      {
          int count =1;
          int current = num;

          while(set.contains(current+1))
          {
              count++;
              current++;
          }
       longest = Math.max(longest, count);
      }
  }

  return longest;
       
  }

  
  private static int longestConsecutiveUsingLinearSearch(int [] nums)
  {
	  int n = nums.length;
	   if (nums.length == 0) return 0;
	  int longest = 1;
	  
	  
	  for(int i =0;i<nums.length;i++)
	  {
		  int current = nums[i];
		  int count =1;
		  if(linearsearach(nums, current+1))
		  {
			  count++;
			  
			  
			  current++;
		  }
		  
		  longest = Math.max(longest, count);
	  }
	  
	  return longest;
  }

private static boolean linearsearach(int[] nums, int traget) {
	// TODO Auto-generated method stub
	
	for(int num: nums)
	{
		if(num == traget) return true;
	}
	return false;
}

private static int findoutLogestConsecutive(int[] nums) {
	
	Arrays.sort(nums);

	int count =1;
	int n= nums.length;
	int longest =1;
	
	for(int i=1;i<n;i++)
	{
		if(nums[i-1] == nums[i])
		{
			  continue; // skip duplicates
		}else if(nums[i] == nums[i-1]+1)
		{
			count++;
			
		} else {
            count = 1; // reset
        }
		
		longest = Math.max(longest, count);
	}
	return longest;
	// TODO Auto-generated method stub
	
	
	
}
}
