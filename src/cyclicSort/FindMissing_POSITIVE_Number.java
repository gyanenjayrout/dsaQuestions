package cyclicSort;
/*
 * 
 * ✅ 30-Second Interview Explanation (Best)

We use a while loop instead of a for loop because after swapping a number to its correct position, 
a new number comes to the same index. That new number might also be misplaced, so we must re-check the same index.
 We only move forward when the current number is either invalid for the problem or already in its correct position.

✅ Slightly Detailed (1-Minute Version)

Since the array contains numbers from 1 to n, each number x ideally belongs to index x-1.
 I iterate using a while loop so that I have control over the index. If the current number is valid and not at its correct position, 
 I swap it to where it belongs. After swapping, I stay at the same index because a new number has come in and might also need 
 repositioning. I increment the index only when the current number is either useless or already correctly placed.

✅ Ultra-Simple Explanation (For Nervous Moments 😄)

I don’t move to the next index until the number at the current index is settled.

🎯 If Interviewer Pushes: “Why not for loop?”

You say:

A for loop automatically increments the index, which may skip numbers that arrive after a swap. The while loop lets me control when to move forward.
 */
public class FindMissing_POSITIVE_Number {

	
	public static void main(String[] args) {
		
		int [] arr= {3,4,-1,1};
		
		int number = findthefirstMissingPostive(arr);
		
		System.out.println(number);
	}

	private static int findthefirstMissingPostive(int[] arr) {
		// TODO Auto-generated method stub
		int i=0;
		int n= arr.length;
		
		while(i<n)
		{
			int correctIndex = arr[i]-1;
			
			if(arr[i]>0 && arr[i]<=n && arr[i] !=arr[correctIndex])
			{
				int temp = arr[i];
				arr[i] = arr[correctIndex];
				arr[correctIndex] = temp;
			}else
			{
				i++;
			}
		}
		
		 for (i = 0; i < n; i++) 
		{
			if(arr[i] != i+1)
			{
				return i+1;
			}
		}
		return n+1;
	}
}
