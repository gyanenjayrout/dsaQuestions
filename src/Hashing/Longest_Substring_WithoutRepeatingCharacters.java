package Hashing;
import java.util.*;
public class Longest_Substring_WithoutRepeatingCharacters {
	 public int lengthOfLongestSubstring(String s) {
		 int start =0;
		 int maxLength =0;
		 
		 Set<Character> set = new HashSet<>();
		 
		 for(int end =0;end<s.length();end++)
		 {
			 while(set.contains(s.charAt(end)))
			 {
				 set.remove(s.charAt(start));
				 start++;
			 }
			 
			 set.add(s.charAt(end));
			 
			 maxLength = Math.max(maxLength, end-start+1);
			 
		 }
		 
		 return maxLength;
	 }
	 
	 public int lengthOfLongestSubstringUsingMAp(String s) {
	       Map<Character, Integer> map = new HashMap<>();
	        int left =0;

	        int longest =0;

	        for(int right=0;right<s.length();right++)
	        {
	          char ch = s.charAt(right);
	           if(map.containsKey(ch))
	           {      
	            left = Math.max(left, map.get(ch)+1);
	            /*
	             * HashSet removes elements one by one, 
	             * while HashMap allows direct jump of left pointer using last seen index, making it more efficient in practice.
	             */
	           }
	            map.put(ch, right);

	       longest = Math.max(longest, right-left+1);
	        }
	     return longest;
	    }
	 
	 /*
	  * 
	  * Why +1?

We want to move left after the previous occurrence.

So:

left = lastIndex + 1

Meaning:

start fresh after duplicate
	  */
}
