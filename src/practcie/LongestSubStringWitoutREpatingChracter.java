package practcie;

import java.util.*;
public class LongestSubStringWitoutREpatingChracter {
	
	 public static void main(String[] args) {
   	  String  s = "abcabcbb";
   	  
   	  int res  = lengthOfLongestSubstring(s);
   	  System.out.println(res);
	 }
//
//	private static int lengthOfLongestSubstring(String s) {
//		// TODO Auto-generated method stub
//		
//		int maxlength =0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j= i+1;j<s.length();j++)
//			{
//				String sub = s.substring(i,j);
//				
//				if(uniq(sub))
//				{
//					maxlength  =Math.max(maxlength, sub.length());
//				}
//			}
//		}
//		return maxlength;
//	}
//
//	private static boolean uniq(String sub) {
//		// TODO Auto-generated method stub
//		
//		Set<Character> set =  new HashSet<>();
//		for(char c: sub.toCharArray())
//		{
//			if(set.contains(c))
//			{
//				return false;
//			}
//			set.add(c);
//		}
//		return true;
//	}

	private static int lengthOfLongestSubstring(String s) {
		// TODO Auto-generated method stub
		int start  =0;
		int end  =0;
		int maxLength =0;
				
		Set<Character> set  = new HashSet<>();
		
		while(end<s.length())
		{
			if(!set.contains(s.charAt(end)))
			{
				
				set.add(s.charAt(end));
				maxLength = Math.max(maxLength, end-start+1);
				end++;
				
			}
			else
			{
				set.remove(s.charAt(start));
				start++;
			}
			
		}
		return maxLength;
		
	}

}
