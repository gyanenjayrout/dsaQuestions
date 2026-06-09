package Array;
import java.util.*;
public class FindTheMisssingNumber {
	
	public static void main(String[] args) {
		
		int []arr = {1,3,4};
		int n=4;
		int result = findTheMissingNumber(arr,n);
		
		System.out.println(result);
	}

	
	static int findTheMissingNumber(int[] arr, int n) {
//        for(int i=1;i<=n;i++)
//        {
//        	boolean found = false;
//        	
//        	for(int j=0;j<arr.length;j++)
//        	{
//        		if(arr[j]==i)
//        		{
//        			found=true;
//        			break;
//        		}
//        	}
//        	
//        	if(!found)
//        	{
//        		return i;
//        	}
//        }
//        return n + 1;  // If no missing number is found, return n+1
//		
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		
//			for(int num:arr)
//		{
//		map.put(num, map.getOrDefault(num, 0)+1);	
//		}
//    
//		
//			for(int i=1;i<=n;i++)
//		{
//			if(!map.containsKey(i))
//			{
//				return i;
//			}
//		}
//		
//		return n+1;
		
		
		int xor =0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			xor ^=arr[i];
			xor ^=i+1;
			
		}
		
		xor ^=n;
		
		return xor;
	}
		
	
}
