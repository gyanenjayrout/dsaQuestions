package Array;

import java.util.*;

/*
 * The HashMap approach is often chosen here because the O(n) time complexity outweighs the cost of O(n)
 *  space for most practical input sizes, making it 
 * an optimal choice in terms of runtime. However, if memory is limited or sorting is feasible, the two-pointer approach can be an alternative.*/


public class TwoSUM {
	
	public static void main(String[] args) {
		int [] sum = {2,3,4,5,6};
		
		int target = 11;
		
		int result [] = findztwozSum(sum, target);
		
		System.out.println(Arrays.toString(result));
		
	}
/*
	private static int[] findztwozSum(int[] sum, int target) {
		// TODO Auto-generated method stub
		
		int [] result = new int [2];
		
		for(int i=0;i<sum.length;i++)
		{
			for(int j=i+1;j<sum.length;j++)
			{
				if(sum[i]+sum[j]==target)
				{
					return new int [] {i,j};
				}
			}
		}
		//I check every possible pair of numbers in the array to see
		//if their sum matches the target. This involves iterating through the array with two nested loops, which allow us to check all possible pairs.
		
		 return new int [] {-2-2};
	}
	
	*/
	
/*	
	private static int[] findztwozSum(int[] sum, int target) {
		
		HashMap<Integer, Integer > map =  new HashMap<>();
		
		for(int i=0;i<sum.length;i++)
		{
			int comp = target - sum[i];
			
			if(map.containsKey(comp))
			{
				return new int [] {map.get(comp), i};
			}
			
			map.put(sum[i], i);
		}
		return new int [] {-1,-1};
	}
	/*This approach has a time complexity of O(n) 
	 * because it only requires a single loop through the array, and the containsKey and put operations in HashMap are O(1) on average."*/
	
	
	private static int[] findztwozSum(int[] sum, int target) {
	int left = 0;
	
	int right = sum.length-1;
	
	while(left<right)
	{
		int summetion = sum[left]+sum[right];
		
		if(summetion>target)
		{
			right--;
		}
		else if(summetion<target)
		{
			left++;
		}
		else 
		{
			return new int [] {left, right};
		}
		
		
	}
	/*The two-pointer technique usually works well on sorted arrays because it uses pointers f
	 * rom both ends of the array to move towards each other based on whether
	 *  the sum of the two elements is greater than or less than the target. Sorting the array first would take O(n log n) time, which adds overhead.
	 */
	
	return new int [] {-1,-1};
	
	
	}

}
