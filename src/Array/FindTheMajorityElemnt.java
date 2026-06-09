package Array;

import java.util.HashMap;
import java.util.Map;

public class FindTheMajorityElemnt {
	
	
	
	public static void main(String[] args) {

        int[] arr = {2, 2, 1, 1, 1, 2, 2};
       
		
		int result = findtheMajorityElemnt(arr);
		
		System.out.println(result);
	}
	
	static int findtheMajorityElemnt(int[]arr)
	{
		
//		int n=arr.length;
//		Map<Integer, Integer>map =new HashMap<>();
//		
//		for(int num:arr)
//		{
//			map.put(num, map.getOrDefault(num, 0)+1);
//			
//		}
//		
//		for(Map.Entry<Integer, Integer>e: map.entrySet())
//		{
//			if(e.getValue()>n/2)
//			{
//				return e.getKey();
//			}
//			
//		}
//		return -1;
		
		
		int cnt =0;
		int ele =0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(cnt==0)
			{
				cnt++;
				ele = arr[i];
			}
			else if(ele ==arr[i])
			{
					cnt++;
			}
			else
			{
				cnt--;
			}
		}
		
		return ele;
		
		
	}

}
