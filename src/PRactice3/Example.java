package PRactice3;

import java.util.HashSet;
import java.util.Set;

public class Example {
	
    public static void main(String[] args) {
  	  String  s = "abcabcbb";
  	  
  	  int res  = lengthOfLongestSubstring(s);
  	  System.out.println(res);
  	  
	}

	private static int lengthOfLongestSubstring(String s) {
		// TODO Auto-generated method stub
		int maxl = 0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String sub = s.substring(i,j);
				
				if(uniq(sub)) {
					maxl = Math.max(maxl, sub.length());
				}
			}
		}
		return maxl;
	}

	private static boolean uniq(String sub) {
		// TODO Auto-generated method stub
	Set<Character> set   = new HashSet<>();
	for(char c: sub.toCharArray())
	{
		if(set.contains(c))
		{
			return false;
		}
		set.add(c);
	}
		
		return true;
	}
}
