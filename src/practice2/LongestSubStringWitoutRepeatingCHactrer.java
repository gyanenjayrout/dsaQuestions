package practice2;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWitoutRepeatingCHactrer {
	
	 public static void main(String[] args) {
   	  String  s = "abcabcbb";
   	  
   	  int res  = lengthOfLongestSubstring(s);
   	  System.out.println(res);
   	  
	}

	private static int lengthOfLongestSubstring(String s) {
		// TODO Auto-generated method stub
		
		
		int start = 0;
		int end = 0;
		int maxlength  =0;
		Set<Character> set  =  new HashSet<>();
		
		while(end<s.length())
		{
			
			if(!set.contains(s.charAt(end)))
			{
				set.add(s.charAt(end));
				
				maxlength = Math.max(maxlength,end-start+1);
				end++;
				
			}else
			{
				set.remove(s.charAt(start));
				start++;
			}
			
			
		}
		
		return maxlength;
	}
	
	

}
