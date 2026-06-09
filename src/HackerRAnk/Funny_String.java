package HackerRAnk;
/*
 * 
 * When is a String Funny?

For a string s, define:

    diff_original[i] = |s[i] - s[i - 1]|

    diff_reversed[i] = |reversed_s[i] - reversed_s[i - 1]|
    
    Example 1: "acxz"

Original string: "acxz"
Reversed string: "zxca"

| i | Original Diff (|s[i] - s[i-1]|) | Reversed Diff (|reversed_s[i] - reversed_s[i-1]|) | |---|---------------------------------|----------------------------------| | 1 | |c - a| = |99 - 97| = 2 | |x - z| = |120 - 122| = 2 | | 2 | |x - c| = |120 - 99| = 21 | |c - x| = |99 - 120| = 21 | | 3 | |z - x| = |122 - 120| = 2 | |a - c| = |97 - 99| = 2 |

✅ Since both columns match for all i, the output is "Funny".
 */
public class Funny_String {
	
	public static void main(String[] args) {
        System.out.println(isFunny("acxz")); // Output: Funny
    }

	private static String isFunny(String string) {
		// TODO Auto-generated method stub
		
		int n = string.length();
		
		for(int i=1;i<n;i++)
		{
			if(Math.abs(string.charAt(i)-string.charAt(i-1)) !=Math.abs(string.charAt(n-i) - string.charAt(n-i-1)) ) {
				 return " NOT FUNNY";
			}
		}
		return "FUNNY";
	}

}
