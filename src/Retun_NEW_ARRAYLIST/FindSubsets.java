package Retun_NEW_ARRAYLIST;
import java.util.*;
public class FindSubsets {
	public List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> res = new ArrayList<>();
	    List<Integer> temp = new ArrayList<>();
	    backtrack(0, nums, temp, res);
	    return res;
	}

	void backtrack(int start, int[] nums, List<Integer> temp, List<List<Integer>> res) {
	    res.add(new ArrayList<>(temp)); // ✅ Copy temp before storing
	    //result.add(temp); // ❌ Bug: same reference gets reused
	    for (int i = start; i < nums.length; i++) {
	        temp.add(nums[i]);
	        backtrack(i + 1, nums, temp, res);
	        temp.remove(temp.size() - 1);
	    }
	}

}

/*
“I use new ArrayList<>(temp) to store a snapshot of the current state. Since the temp list is reused in backtracking, 
if I directly add it,
 all entries in the result will point to the same list object and give wrong output. Copying prevents shared reference bugs.”
 
 
 🧪 Practice Problems (Where Snapshot is Needed)
Problem	Platform	Why Needed
Subsets (78)	Leetcode	Temp list reused
Permutations (46)	Leetcode	Modifying temp list
Combinations (77)	Leetcode	Backtrack with list path
Subsets II (90)	Leetcode	Deduplication + backtrack
*/