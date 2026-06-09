package Hashing;
import java.util.*;
/*
 * 
 XOR Trick
 
Properties:
a ^ a = 0
a ^ 0 = a

Same numbers cancel each other.
So XOR:
all indices 0..n
all array values

Remaining value = missing number
 */
public class MissingNmber {
	
	public int missingNumberXOR(int[] nums) {
		 int xor = nums.length;
		 
		 for(int i=0;i<nums.length;i++)
		 {
			 xor = xor ^ i ^ nums[i];
		 }
		return xor;
		
	}
	 public int missingNumber(int[] nums) {
	        Set<Integer> set = new HashSet<>();

	        for(int num: nums) set.add(num);


	        for(int i=0;i<nums.length;i++)
	        {
	            if(!set.contains(i))
	            {
	                return i;
	            }
	        }

	        return nums.length;
	    }
}
