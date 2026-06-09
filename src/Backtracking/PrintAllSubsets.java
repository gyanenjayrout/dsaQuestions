package Backtracking;
import java.util.*;
public class PrintAllSubsets {
	public List<List<Integer>> subsets(int[] nums) 
	{
		List<List<Integer>> result  = new ArrayList<>();
		
		List<Integer> current = new ArrayList<>();
		
		findsubset(nums, current, result, 0);
		
		return result;
		
	}

	private void findsubset(int[] arr, List<Integer> current, List<List<Integer>> result, int index) {
		// TODO Auto-generated method stub
		
		if(arr.length == index)
		{
			result.add(current);
			return;
		}
		
		current.add(arr[index]);
		
		findsubset(arr, current, result, index+1);
		
		current.remove(current.size()-1);
		
		findsubset(arr, current, result, index+1);
		
	}
}
