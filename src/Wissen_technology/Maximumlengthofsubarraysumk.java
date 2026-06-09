package Wissen_technology;

import java.util.HashMap;

public class Maximumlengthofsubarraysumk {
	public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 4, 5};
        int k = 7;
        System.out.println("Maximum length of subarray with sum " + k + " = " + maxSubarrayLength(arr, k));
        
       int length = maxSubarrayLengthbrutforce(arr,k);
        System.out.println(length);
    }

	private static int maxSubarrayLength(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		map.put(0, -1);
		int maxlength =0;
		int currsum =0;
		for(int j=0;j<arr.length;j++)
		{
			currsum =currsum+arr[j];
			
			if(map.containsKey(currsum-k))
			{
				int i= map.get(currsum-k);
				
				maxlength = Math.max(maxlength, j-i);
			}
			
			map.putIfAbsent(currsum, j);
		}
		return maxlength;
	}

	private static int maxSubarrayLengthbrutforce(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		int maxlength =0;
		
		
		for(int i=0;i<arr.length;i++)
		{
		int cursum =0;
		
		for(int j=i;j<arr.length;j++)
		{
			cursum =cursum+arr[j];
			
			if(cursum==k)
			{
				maxlength = Math.max(maxlength, j-i+1);
			}
		}
		}
		return maxlength;
	}

}
