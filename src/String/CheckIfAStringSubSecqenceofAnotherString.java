package String;
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

	public static boolean isSubsequence(String source, String target) {
        int i = 0; // Pointer for target
        int j = 0; // Pointer for source

        while (i < target.length() && j < source.length()) {
            // Check if characters match
            if (target.charAt(i) == source.charAt(j)) {
                i++; // Move target pointer
            }
            j++; // Always move source pointer
        }

        // If target pointer reached the end, it's a subsequence
        return i == target.length();
    }

}
