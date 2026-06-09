package SlididngWindow;
import java.util.*;
public class LOngestSSUbSTrinWithoutEpatingCHacater {
		
      public static void main(String[] args) {
    	  String  s = "abba";
    	  
    	  int res  = lengthOfLongestSubstring2(s);
    	  System.out.println(res);
    	  
	}
      
      private static int lengthOfLongestSubstring2(String s) {
    	  
    	  int start =0;
    	  int maxLength =0;
    	  
    	  Set<Character>seen = new HashSet<>();
    	  
    	  for(int end =0;end<s.length();end++) {
    		  
    		  while(seen.contains(s.charAt(end)))
    		  {
    			  seen.remove(s.charAt(start));
    			  start++;
    		  }
    		  
    		  seen.add(s.charAt(end));
    		  maxLength = Math.max(maxLength, end-start+1); 
    	  }
    	  
    	  return maxLength;
    	  
    	  
      }

	
		public int lengthOfLongestSubstring(String s) {
		       Map<Character, Integer> map = new HashMap<>();
		        int start =0;
		        int maxLength =0;
		       for(int i=0;i< s.length();i++)
		       {
		        char ch = s.charAt(i);
		          if(map.containsKey(ch))
		          {
		            start = Math.max(start, map.get(ch)+1);
		            /*
		             * Math.max() ensures start only moves forward. If previous duplicate is outside current window, we ignore it.
		             * abbc --> next windw from 2
		             * map.get(ch)+1 map.get(ch) + 1 means:

Move start to the position after the previous duplicate character. abcabcdef
So yes — it ignores/removes the repeating one from current window.
		             */
		          }
		        map.put(ch, i); //The new character is stored after that:
		       maxLength = Math.max(maxLength, i-start+1);
		       }

		       return maxLength;
		    }
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

//}
