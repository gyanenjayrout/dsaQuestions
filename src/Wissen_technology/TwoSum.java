package Wissen_technology;
import java.util.*;
public class TwoSum {
public static void main(String[] args) {
	  int[] nums = {2, 7, 11, 15};
      int target = 26;

      int[] result = twoSum(nums, target);
      int[] result2 = ttwosum(nums, target);
      
      System.out.println("Indices: " + result[0] + ", " + result[1]);
      System.out.println("Indices: " + result2[0] + ", " + result2[1]);
}

private static int[] ttwosum(int[] arr, int target) {
	// TODO Auto-generated method stub
	
	int left=0;
	int right =arr.length-1;
	
	while(left<right)
	{
		int sum = arr[left]+arr[right];
		
		if(sum==target)
		{
			return new int[] {left, right};
		}else if(sum<target)
		{
			left++;
		}else
		{
			right--;
		}
	}
	
	return new int [] {-1, -1};
}

private static int[] twoSum(int[] arr, int target) {
	// TODO Auto-generated method stub
	HashMap<Integer, Integer>map = new HashMap<>();
	
	int sum =0;
	
	for(int i=0;i<arr.length;i++)
	{
		int comp  =target - arr[i];
		
		if(map.containsKey(comp))
		{
			return new int [] { map.get(comp),i};
		}
		map.put(arr[i], i);
	}
	return new int [] {-1, -1};
}
}
