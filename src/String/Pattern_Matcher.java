package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_Matcher {
	
	public static void main(String[] args) {
        String input = "Order ID: 123, Total: -456.78, Discount: +5.5%";
        
        
        Pattern pattern = Pattern.compile("[+-]?\\d+(\\.\\d+)?");
        
        Matcher matcher = pattern.matcher(input);
        
        while(matcher.find())
        {
        	System.out.println("found number "+ matcher.group());
        }
        
        
	}

}

/*
 * 
 * 
				 Pattern	                                   Purpose
				"-?\\d+"	                       Match integers (positive and negative).
				"\\d+"	                             Match only positive integers.
				"[+-]?\\d+(\\.\\d+)?"	            Match integers and decimals (with signs).
				"-?\\d+\\.\\d+"	                    Match only decimal numbers (with negative).
				 
 * \\D+ is a regular expression that means:

    \\D – Non-digit character (anything except 0-9).

    + – One or more occurrences.

split("\\D+") splits the string wherever non-digits occur.
 * 
 * 
 * 
 * ✅ Match Only Positive Numbers
If you want to match only positive 


numbers:Pattern pattern = Pattern.compile("\\d+");

👉 Matches 123, 456, but not -789.

✅ Match Decimal Numbers (Floating Point Values)
If you want to capture decimal numbers (e.g., 12.34, -0.567):

pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

✅ Match Numbers With a Positive Sign (+100)
If you want to allow a leading +:
Pattern pattern = Pattern.compile("[+-]?\\d+");👉 This will match numbers with a positive or negative sign.

// Match integers, decimals, and positive/negative signs
        Pattern pattern = Pattern.compile("[+-]?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(input);



 */