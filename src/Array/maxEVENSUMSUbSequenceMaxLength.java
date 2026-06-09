package Array;
/*
 * he examples provided clarify that the goal
 *  is to find the maximum-length subsequence with an even sum, not just the maximum sum. 
 *  This problem has a different focus, as we need to maximize the number of elements while ensuring the sum remains even. Here's how to approach this:
https://www.geeksforgeeks.org/maximum-even-sum-subsequence/
Key Observations:

    Even Sum Condition:
        A sum is even if the count of odd numbers in the subsequence is even.
        A sum is odd if the count of odd numbers is odd.

    To maximize the length of the subsequence:
        Include all even numbers (since their sum is always even).
        Include an even count of odd numbers to maintain the even sum.
        
       1: Sum up all positive numbers 
       2: If the sum is even then that will be the max sum possible 
       3: If the sum is not even then either subtract a positive odd number from it, or add a negative odd. 


    Find maximum max odd of negative odd numbers, hence sum+a[I] (as a[I] is itself negative) 

    Find minimum min odd of positive odd numbers, hence sun-a[I]. 

    The maximum of the both the results will be the answer.



 */
public class maxEVENSUMSUbSequenceMaxLength {
	
	public static void main(String[] args) {
		int arr[] = {-2, 2, -3, 1, 3};
		
		 System.out.println("Maximum Even Sum: " + maxEvenSum(arr));
		 
		int arr2[] = {-2, 2, -3, 4, 5};
		 
		 System.out.println("Maximum Even Sum: " + maxEvenSum(arr2));
	}
	

	private static int maxEvenSum(int[] arr) {
		// TODO Auto-generated method stub
		int pos_sum = 0;
	
		for(int num: arr)
		{
			if(num >0)
			{
				pos_sum  =pos_sum+num;
			}
		}
		
		if(pos_sum %2==0)
		{
			return pos_sum;
		}
		// Traverse the array to find the 
        // maximum sum by adding a  
        // positive odd or subtracting a 
        // negative odd 
		int ans = Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]%2!=0)
				{
					if (arr[i] % 2 != 0) { 
		                if (arr[i] > 0) 
		                    ans = ans>(pos_sum - arr[i]) ?  
		                          ans:(pos_sum - arr[i]); 
		                else
		                    ans = ans>(pos_sum + arr[i]) ?  
		                          ans:(pos_sum + arr[i]); 
		            } 
				}
			}
				
		return ans;
	}

}
