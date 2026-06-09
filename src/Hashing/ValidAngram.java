package Hashing;
/*
 * I used a fixed-size frequency array of 26 integers to count lowercase character occurrences.
It gives O(1) access and avoids HashMap overhead.

The ASCII value of capital 'A' is 65 and small 'a' is 97
 */
public class ValidAngram {
	public boolean isAnagram(String s, String t) {
		   if(s.length() != t.length()) return false;
		   
		        int freq[] = new int [26];
		        /*
		         * Frequency array or Count array

Used to store occurrence count of characters.
freq[0] -> count of 'a'
freq[1] -> count of 'b'
freq[25] -> count of 'z'

'c' - 'a' = 2  (99-97 =2)
		         */

		        for(int i=0;i<s.length();i++)
		        {
		            freq[s.charAt(i)-'a']++;
		        }

		        for(int i=0;i<t.length();i++)
		        {
		          freq[t.charAt(i)-'a']--;

		          if(freq[t.charAt(i)-'a'] <0)
		          {
		               return false;
		          }
		        }
		        return true;
		    }
}
