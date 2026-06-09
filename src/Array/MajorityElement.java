package Array;

import java.util.*;
public class MajorityElement {
	
	 public static void main(String[] args) {
	        int[] arr = {3, 1, 3, 3, 2, 3,1};
	        System.out.println("Majority Element: " + findMajorityElement(arr));
	    }

	private static int findMajorityElement(int[] arr) {
		// TODO Auto-generated method stub
		
//		int n  =arr.length;
//		 HashMap<Integer, Integer> map = new HashMap<>();
//		 
//		 for(int num : arr)
//		 {
//			
//			 map.put(num, map.getOrDefault(num, 0)+1);
//		 }
//		 
//		 for(int key : map.keySet())
//		 {
//			 if(map.get(key)>n/2)
//			 {
//				 return key;
//			 }
//		 }
//		 
		int n  =arr.length;
		int count  =0;
		int element = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(count ==0)
			{
				count++;
				element  =arr[i];
			}
			else if(element == arr[i])
			{
				count++;
			}else
			{
				count--;
			}

		}
	count=0;
		
		for(int num:arr)
		{
		    if(element==num)
		    {
		        count++;
		    }
		}
		 return (count >n/2) ? element : -1;

		
	}

}
