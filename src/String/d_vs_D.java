
package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d_vs_D {
	
	public static void main(String[] args) {
		String input = "abc123xyz-456!";
		
		Pattern pattern = Pattern.compile("\\d+");
		
		Matcher matcher = pattern.matcher(input);
		 System.out.println("Digits:");
		
		while(matcher.find())
		{
			System.out.println(matcher.group());
		}
		
	// non-digit	
		Pattern nonDigitPattern = Pattern.compile("\\D+");
		
		Matcher nonDigitMatcher = nonDigitPattern.matcher(input);
		
		System.out.println("Non-Digts");
		
		while (nonDigitMatcher.find())
		{
			System.out.println(nonDigitMatcher.group());
		}
		
	// negetive nmbers	
		 String input2 = "abc-123 xyz456 -789 +100 -42";

	        // Match only negative numbers
	        Pattern patternn = Pattern.compile("-\\d+");
	        Matcher matcherr = pattern.matcher(input);

	        System.out.println("Negative Numbers:");
	        while (matcherr.find()) {
	            System.out.println(matcherr.group());
	        }
		
//		
//		
	}

}

/*
 * \d+:

    \d: Matches any digit character, equivalent to [0-9].​
    Nanyang Technological University

    +: Indicates that the preceding character (in this case, a digit) must appear one or more times consecutively.​

    Combined Meaning: Matches sequences of one or more digits. For example, in the string "Order number: 12345", the pattern \d+ would match "12345".​

\D+:

    \D: Matches any non-digit character, essentially any character that is not [0-9].​
    Nanyang Technological University

    +: Requires that the non-digit character appears one or more times consecutively.​

    Combined Meaning: Matches sequences of one or more non-digit characters. For instance, in the string
     "Order number: 12345", the pattern \D+ would match "Order number: "
 * 
 *  3. Difference in Action
Input	                 Pattern (\\d+)	               Matches	      Pattern (\\D+)	               Matches
"abc123xyz456"          	123, 456	           Digits only	          "abc", "xyz"	          Non-digits only
"12ab34!56"	               12, 34, 56	           Extract numbers	          "ab", "!"	          Extract text
"456-789"                	456, 789	           Positive numbers	            "-"	               Special character
 * 
 */
