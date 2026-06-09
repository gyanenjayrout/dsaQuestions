package String;

public class LongestPallendromeSuubString {

	
	public String longestPalindrome(String s) {
	    
	       if(s ==null && s.length()<1)
	       {
	        return "";
	       }
	       int maxLength = 0;
	        String longestPal = "";

	       for(int i=0;i<s.length();i++)
	       {
	           for(int j =i;j<s.length();j++)
	           {
	               String substr  = s.substring(i, j+1);

	               if(isPallndrome(substr) && substr.length()>maxLength)
	               {
	                maxLength  = substr.length();
	                longestPal = substr;
	               }
	           }
	       }

	       return longestPal;
	        
	    }

	    public boolean isPallndrome(String str)
	    {
	        int start = 0;
	        int end = str.length()-1;

	      while(start<end)
	      {
	          if(str.charAt(start) !=str.charAt(end))
	          {
	            return false;
	          }
	          start++;
	           end--;
	      }

	      return true;
	    }
}

/*
 * public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);   // Odd length palindromes
            int len2 = expandAroundCenter(s, i, i + 1); // Even length palindromes
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}

 */
