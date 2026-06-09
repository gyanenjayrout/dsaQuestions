package String;
/*
 * This line converts the character into a zero-based index using c - 'a', 
 * allowing us to map each character to an array position. By decrementing this array, 
 * we track how many times each character appears. If any value becomes negative,
 *  the strings cannot be anagrams. This approach is efficient with O(n) time and O(1) space, making it faster than sorting methods."
 */
public class AnagramCheckerOptimal {
	
	 public static boolean areAnagrams(String str1, String str2) {
		 
	        str1 = str1.replaceAll("\\s+", "").toLowerCase();
	        str2 = str2.replaceAll("\\s+", "").toLowerCase();

	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        int[] charCount = new int[26]; // For lowercase English letters

	        // Count characters in str1
	        for (char c : str1.toCharArray()) {
	            charCount[c - 'a']++;
	        }
	        
	        /*
	         * c - 'a':

    This converts a character into a zero-based index.
    'a' is the first lowercase letter in the English alphabet, and its ASCII value is 97.
    For any lowercase letter c, subtracting 'a' gives its position in the alphabet:
    
    Character (c)	ASCII Value	Calculation (c - 'a')	Result (Index)
'a'	97	97 - 97	0
'b'	98	98 - 97	1
'c'	99	99 - 97	2
...	...	...	...
'z'	122	122 - 97	25

For each character in str1, we increment the frequency:

    'a' - 'a' = 0 → charCount[0]++ (Now charCount[0] = 1)
    'b' - 'a' = 1 → charCount[1]++ (Now charCount[1] = 1)
    'c' - 'a' = 2 → charCount[2]++ (Now charCount[2] = 1)
    
    charCount = [1, 1, 1, 0, 0, ..., 0]
             a  b  c
	         */

	        // Decrease count for characters in str2
	        for (char c : str2.toCharArray()) {
	            charCount[c - 'a']--;
	            // If count goes negative, str2 has more of that character
	            if (charCount[c - 'a'] < 0) {
	                return false;
	            }
	        }
	        
	        /*
	         * 
	         * Step 3: Process str2 with charCount[c - 'a']--

For each character in str2, we decrement the corresponding frequency:

    'b' - 'a' = 1 → charCount[1]-- (Now charCount[1] = 0)
    'c' - 'a' = 2 → charCount[2]-- (Now charCount[2] = 0)
    'a' - 'a' = 0 → charCount[0]-- (Now charCount[0] = 0)

Final charCount:
charCount = [0, 0, 0, 0, 0, ..., 0]
             a  b  c
             
             
             
             if (charCount[c - 'a'] < 0) {
    return false;
}  
Example: For str1 = "abc" and str2 = "bcd":
harCount = [1, 1, 1, 0, 0, ..., 0]
            a  b  c
            
                Processing 'd':
        'd' - 'a' = 3 → charCount[3]-- → charCount[3] = -1

This triggers return false; because 'd' appears in str2 but not in str1.
	         */

	        return true; // All counts should be zero if 
	
	    }
	 
	 
	 /*
	  * public static boolean areAnagrams(String str1, String str2) {
        // Normalize the strings: remove spaces and convert to lower case
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        // Check if lengths are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Split the strings into character arrays
        String[] chars1 = str1.split("");
        String[] chars2 = str2.split("");

        // Sort the character arrays
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        // Compare sorted arrays
        return Arrays.equals(chars1, chars2);
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }*/
	} 

