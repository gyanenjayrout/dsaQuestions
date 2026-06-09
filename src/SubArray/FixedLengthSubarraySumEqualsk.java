package SubArray;
//Given an integer array nums and an integer k and target , count  the number of  subarrays of length exactly k whose sum equals target.
public class FixedLengthSubarraySumEqualsk {
	
	public static void main(String[] args) {
		int arr[]  = {2, 1, 3, 2, 1 ,4};
		
		int k = 3;
		int target = 6;
		
		int count = countFixedLengthSubarrays(arr, k, target);
		 System.out.println("Number of subarrays of length " + k + " with sum " + target + ": " + count);
	}

	private static int countFixedLengthSubarrays(int[] arr, int k, int target) {
		// TODO Auto-generated method stub
		
		
	/*	 brutforce 
		int count = 0;
		
		for(int i=0;i<arr.length-k;i++)
		{
			int sum = 0;
			
			for(int j =i;j<i+k;j++)
			{
				sum =sum +arr[j];
				
				
			}
			
			if(sum ==target)
			{
				count++;
			}
			
			
		}
		return count;
		*/
		
		int start =0;
		int count = 0;
		int currentSum =0;
		
		for(int i=0;i<k;i++)
		{
			currentSum = currentSum+arr[i];
		}
		
		if(currentSum ==target)
		{
			
			count++;
		}
		
		for(int i =k;i<arr.length;i++)
		{
			  currentSum += arr[i];           // Add next element
	            currentSum -= arr[i - k];       // Remove first element of the previous window

	            // Check if the current window sum equals the target
			
			if(currentSum ==target)
			{
				count++;
			}
		}
		
		return count;
	}

}
