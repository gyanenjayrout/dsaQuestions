package String;

/*Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is
the smallest in lexicographical order
among all possible results.

 

Example 1:

Input: s = "bcabc"
Output: "abc"

Example 2:

Input: s = "cbacdcbc"
Output: "acdb"
*/
import java.util.*;
public class RemoveDuplicateLettersandLEXO {
	
	
	    public String removeDuplicateLetters(String s) {

	   int lastOccrance []  = new int[26];

	   boolean [] instack =  new boolean[26];

	   for(int i=0;i<s.length();i++)
	   {
	       lastOccrance[s.charAt(i)-'a'] = i;
	   }

	   Stack<Character> stack =  new Stack<>();

	   for(int i=0;i<s.length();i++)
	   {

	    char ch  = s.charAt(i);


	    if(instack[ch-'a'])
	    {
	        continue;
	    }

	    while(!stack.isEmpty() && ch<stack.peek() &&  i<  lastOccrance[stack.peek()-'a'])
	    {
	        instack[stack.pop()-'a']= false;
	    }
	 
	 stack.push(ch);
	 instack[ch-'a']= true;

	   }
	StringBuilder result = new StringBuilder();
	        for (char ch : stack) {
	            result.append(ch);
	        }

	        return result.toString();

	    }
	

}
