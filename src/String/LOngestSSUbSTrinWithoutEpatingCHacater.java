package String;
import java.util.*;
public class LOngestSSUbSTrinWithoutEpatingCHacater {
		
      public static void main(String[] args) {
    	  String  s = "abcabcbb";
    	  
    	  int res  = lengthOfLongestSubstring(s);
    	  System.out.println(res);
    	  
	}
      public int lengthOfLongestSubstring2(String s) {

	        Map<Character, Integer> map = new HashMap<>();

	        int start = 0;
	        int maxLength = 0;

	        for (int i = 0; i < s.length(); i++) {

	            char c = s.charAt(i);

	            if (map.containsKey(c)) {
	                start = Math.max(start, map.get(c) + 1);
	            }

	            map.put(c, i);

	            maxLength = Math.max(maxLength, i - start + 1);
	        }

	        return maxLength;
	    }

	private static int lengthOfLongestSubstring(String s) {
		// TODO Auto-generated method stub
		
		int start =0;
		int maxLength = 0;
		int end  =0;
		Set<Character> set =  new  HashSet<>();
		while(end<s.length())
		{
			if(!set.contains(s.charAt(end)))
			{
				set.add(s.charAt(end));
				maxLength  = Math.max(maxLength, end-start+1);
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

	   
	

      
//      public static int lengthOfLongestSubstring(String s)
//      {
//         int maxLength =0;
//         
//         for(int i=0;i<s.length();i++)
//         {
//        	 for(int j=i+1;j<s.length();j++)
//        	 {
//        		 String sub = s.substring(i,j);
//        		 
//        		 if(uniq(sub))
//        		 {
//        			 maxLength = Math.max(maxLength, sub.length());
//        		 }
//        	 }
//         }
//         
//         return maxLength;
//      }
//
//	private static boolean uniq(String sub) {
//		Set<Character> set  =  new HashSet<>();
//		
//		for(Character c: sub.toCharArray())
//		{
//			if(set.contains(c))
//			{
//				return false;
//			}
//			set.add(c);
//		}
//		// TODO Auto-generated method stub
//		return true;
//	}

}
