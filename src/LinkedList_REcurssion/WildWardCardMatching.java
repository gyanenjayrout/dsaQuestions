package LinkedList_REcurssion;

public class WildWardCardMatching {
	public static boolean f(int i, int j, String s, String p) {
	    // Base case: Both strings are fully processed
	    if (i < 0 && j < 0) {
	        return true;
	    }

	    // Base case: Pattern is fully processed, but string is not
	    if (j < 0 && i >= 0) {
	        return false;
	    }

	    // Base case: String is fully processed, but pattern remains
	    if (i < 0) {
	        // Check if the remaining pattern can match an empty string
	        while (j >= 0) {
	            if (p.charAt(j) != '*') {
	                return false;
	            }
	            j -= 2; // Skip the preceding character and '*'
	        }
	        return true;
	    }

	    // Case 1: Characters match or pattern has '.'
	    if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
	        return f(i - 1, j - 1, s, p);
	    }

	    // Case 2: Pattern contains '*'
	    if (p.charAt(j) == '*') {
	        // Check if '*' matches zero or more of the preceding element
	        if (j > 0 && (p.charAt(j - 1) == s.charAt(i) || p.charAt(j - 1) == '.')) {
	            return f(i - 1, j, s, p) || f(i, j - 2, s, p);
	        } else {
	            return f(i, j - 2, s, p); // Skip '*' and preceding character
	        }
	    }

	    // Characters do not match
	    return false;
	}

}
