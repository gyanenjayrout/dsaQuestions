package stack;

import java.util.Stack;

/*
 * To check if a string is a subsequence of another string, we verify if all characters of the first string (s1) 
 * appear in the second string (s2) in the same order, but not necessarily consecutively. Here's a step-by-step guide and code example:
 */
public class CheckIfAStringSubSecqenceofAnotherString {
	public static void main(String[] args) {
	String S = "KOTTAYAM";
	String target = "KOTA";
	
	boolean b = isSubsequence(S, target);
	
	System.out.println(b);
	}

	private static boolean isSubsequence(String s, String target) {
		// TODO Auto-generated method stub
		
		Stack<Character> stack  = new Stack<>();
		
		for(int i=0;i<target.length();i++)
		{
			stack .push(target.charAt(i));
		}
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			if( !stack.isEmpty() && s.charAt(i)==stack .peek())
				{
				stack .pop();
				}
		}
		return stack.isEmpty() ;
		//O(n + m):
//	n: Length of s (source string).
//		m: Length of target (due to stack initialization).	
		//O(m):sc

//	    The stack holds all characters of the target string.
		
	}

//	public static boolean isSubsequence(String target, String source) {
//        int i = 0; // Pointer for target
//        int j = 0; // Pointer for source
//
//        while (i < target.length() && j < source.length()) {
//            // Check if characters match
//            if (target.charAt(i) == source.charAt(j)) {
//                i++; // Move target pointer
//            }
//            j++; // Always move source pointer
//        }
//
//        // If target pointer reached the end, it's a subsequence
//        return i == target.length();
//    }

}
