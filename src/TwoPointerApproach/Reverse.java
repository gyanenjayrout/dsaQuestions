package TwoPointerApproach;

import java.util.Arrays;

public class Reverse {
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		
		reveersee(nums);
		
		System.out.println(Arrays.toString(nums));
	}

	private static void reveersee(int[] nums) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j = nums.length-1;
		
		while(i<j)
		{
		   int temp =nums[i];
		   nums[i] =nums[j];
		   nums[j] =temp;
		   i++;
		   j--;
		}
	}

}

//Error
/*
 * Your condition: while(i < nums.length) swaps elements even after crossing the middle, which reverses again.
Correct condition: Swap only until i < j to prevent re-swapping.*/
 