package HackerRAnk;

import java.util.*;

//Two Strings (Check if two strings share a common substring)
public class Two_String {
  
	 public static void main(String[] args) {
	        System.out.println(haveCommonSubstring("hello", "world")); // Output: YES
	    }

	private static String haveCommonSubstring(String string, String string2) {
		// TODO Auto-generated method stub
		
		Set<Character> set = new HashSet<>();
		
		for(char ch: string.toCharArray())
		{
			set.add(ch);
		}
		
		for(char ch :string2.toCharArray())
		{
			if(set.contains(ch))
			{
				return "YES";
			}
		}
		return "No";
	}
	
}
