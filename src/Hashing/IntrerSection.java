package Hashing;
import java.util.*;
/*
 * 
 * | Approach           | Time                 | Space       |
| ------------------ | -------------------- | ----------- |
| Sort + Two Pointer | O(n log n + m log m) | O(min(n,m)) |
| HashSet            | O(n+m)               | O(n+m)      |

 */
public class IntrerSection {
	
	public int[] intersectionsingHash(int[] nums1, int[] nums2) {
	//If order not required, HashSet gives better time complexity O(n+m) by using constant-time lookup.     
	//If order is required, HashSet alone may not preserve order.
//		Use LinkedHashSet, or traverse original array while checking membership.	
		
        Set<Integer> set = new HashSet<>();
		Set<Integer> resultSet = new HashSet<>();
		
		for(int num: nums1) set.add(num);
		
		for(int num : nums2)
		{
			if(set.contains(num))  resultSet.add(num);
				
		}
		
		int result [] = new int[resultSet.size()];
		
//		for(int i=0;i<result.length;i++) result[i] = resultList.get(i);
		
		int  i=0;
		  for (int num : resultSet) {
			  result[i++] = num;
	        }

		
		return result;
    }
	
	 public int[] intersection(int[] nums1, int[] nums2) {
	      
		 Arrays.sort(nums1);
//		 -> O(n log n)
		 Arrays.sort(nums2) ;
//		 -> O(m log m)

        List<Integer> resultList = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<nums1.length && j<nums2.length) //→ O(n + m)
        {
           if(nums1[i] == nums2[j])
           {
               if(resultList.isEmpty() || resultList.get(resultList.size()-1)!= nums1[i])
               {
                   resultList.add(nums1[i]);
               }
               i++;
               j++;
           }else if(nums1[i]<nums2[j])
           {
               i++;
           }else
           {
               j++;
           }
        }


        int [] result = new int [resultList.size()];
        for(int k=0;k<resultList.size();k++)
        {
           result[k] = resultList.get(k);
        }
//O(n log n + m log m)  total
        /*
         * 
         * 
Technique	                        Sort + Two Pointer
Time	                           O(n log n + m log m)
Space	                              O(min(n,m))
         */

        return result;
   }
}
