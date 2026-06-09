package Wissen_technology;
import java.util.*;
public class Longest_Substring_Without_Repeating_Characters {

	
	 public static void main(String[] args) {
   	  String  s = "abcabcbb";
   	  
   	  int res  = lengthOfLongestSubstring(s);
   	  System.out.println(res);
   	  
	}

	private static int lengthOfLongestSubstring(String s) {
		// TODO Auto-generated method stub
		
	    Set<Character>set = new HashSet<>();
	    int start =0;
	    int end = 0;
int maxLength =0;
	    int count =0;
	    
	  while(end<s.length())
	  {
		  if(!set.contains(s.charAt(end)))
		  {
			  set.add(s.charAt(end));
			maxLength = Math.max(maxLength, end-start+1);
			  end++;
		  }else
		  {
			  set.remove(s.charAt(start));
			  
			  start++;
		  }
		  
	  }
		return maxLength;
	}
}
