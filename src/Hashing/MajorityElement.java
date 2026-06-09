package Hashing;
import java.util.*;
/*
 * Complexity	Value
Time	O(n)
Space	O(n)
 */
public class MajorityElement {
	 public int majorityElement(int[] nums) {
	       Map<Integer, Integer> map = new HashMap<>();
	        int  n = nums.length;
	       for(int num : nums) map.put(num, map.getOrDefault(num,0)+1);

	       for(int key: map.keySet())
	       {
	            if(map.get(key)>n/2)
	            {
	                return key;
	            }
	       }

	       return -1;
	    }
	 
	 public int majorityElementSingBoyer_MooreVooting(int[] nums) {
		 /*
		  * If one element appears more than half the time:

It can cancel all other different elements and still survive.

So we do:

keep candidate
keep count

Same number → count++
Different number → count--

When count becomes 0 → choose new candidate

Final candidate = majority element
		  */
		      int candidate = 0;
		      int count =0;

		      for(int num : nums)
		      {

		        if(count ==0)
		        {
		            candidate = num;
		        }
		        
		        if(num == candidate)
		        {
		            count++;
		        }else
		        {
		            count--;
		        }
		      }

		      return candidate;
		}
		 
	 
}
