package Hashing;
import java.util.*;
public class FindDuplicateNumber {
	/*
	 * TC / SC
Time	Space
O(n)	O(n)
	 */
	public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) >1) {
                return key;
            }
        }

        return -1;
    }
	public int findDuplicateUsingFLoydCycle(int[] nums) {
        int slow = nums[0];
        int fast =nums[0];

        do //do-while ensures pointers move at least once before comparison, since both start at same node.
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow !=fast);
        //Both start same position.If we use normal while: Condition is false immediately ❌
        

          
        /*
         * First phase when slow == fast found cycle right?

✅ Yes, meeting point inside cycle.

But meeting point is not necessarily duplicate.

It is only somewhere inside loop.
         */

        slow = nums[0];
        
        /*
         * Second phase is to find cycle entry.

Cycle entry = duplicate number.
         */

        while(slow !=fast)
        {
            slow = nums[slow]; //Then move both 1 step:
            fast = nums[fast];
        }

        return slow;
    }
	
	/*
	 * Phase 1

Find collision.

Phase 2

Reset one pointer to start, move both 1 step.

Meet point = duplicate.
	 */
}
