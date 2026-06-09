package Interview;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String S = "KOTTAYAM";
		String target = "KOTA";
		
		boolean b = isSubsequence(S, target);
		
		 System.out.println(b);
		
		
	}

	private static boolean isSubsequence(String s, String target) {
		// TODO Auto-generated method stub
		
		int  i=0;
		int j =0;
		while(i<s.length()& j<target.length())
		{
			if(s.charAt(i)==target.charAt(j))
			{
				j++;
				
			}
			i++;
		}
		return j==target.length();
		
		
	}
	
	

}

//	private static boolean Anagramm(String str1, String str2) {
//		// TODO Auto-generated method stub
//		
//		str1 =  str1.replaceAll("\\s+ ", "").toLowerCase();
//		
//		str2= str2.replaceAll("\\s+", str2).toLowerCase();
//		
//		
//		if(str1.length() !=str2.length())
//		{
//			return false;
//		}
//		
//		int [] charCount =  new int[26];
//		
//		for(char  c:str1.toCharArray())
//		{
//			charCount[c-'a']++;
//		}
//		
//		
//		for(char c : str2.toCharArray())
//		{
//			charCount[c-'a']--;
//			
//			if(charCount[c-'a']<0)
//			{
//				return false;
//			}
//		}
//		
//		return true;
//	}
//}
