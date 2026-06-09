package TwoPointerApproach;
import java.util.*;
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		
		  Set<List<Integer>> set = new HashSet<>();
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				for(int k=j+1;j<nums.length;k++)
				{
				
					int sum = nums[i]+nums[j]+nums[k];
					/*
					 * sum created every iteration
                       value recalculated every iteration
                       old value destroyed
					 */
					if(sum ==0)
					{
						List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
						
						Collections.sort(temp);
						set.add(temp);
						
					}
				}
			}
		}
		
		return new ArrayList<>(set);
	}
	
	public List<List<Integer>> threeSummm(int[] nums) { // O(nlogn + n^2) ==tc and sc O(Uniq tripletes)
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
           if(i> 0 && nums[i]== nums[i-1]) continue ;
           int j = i+1;
           int k = nums.length-1;

           while(j<k)
           {

            int sum = nums[i]+nums[j]+nums[k];
             if(sum<0) j++;
             else if(sum>0) k--;
             else
             {
                result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                k--;

                while(j<k && nums[j]==nums[j-1]) j++;
                while(j < k && nums[k] == nums[k+1]) k--;
             }
        
           }

        }

        return result;
    }
	
}
