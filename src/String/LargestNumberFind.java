package String;

import java.security.cert.TrustAnchor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LargestNumberFind {
	 public static void main(String[] args) {
	        String input = "abc12 xy Lgra45 -789 xyz100";
	        
	        String input2 = "abc99999999999 xy Lgra45 -789 xyz100";
	        
	        
	        String[] numbers =  input.split("\\D+");
	        
	        // // Step 1: Use regex to extract numbers (split by non-digit characters)
	        
	        int maxvalue = Integer.MIN_VALUE;
	        
	        
	        
	        
	        for(String num :numbers)
	        {
	        	if(!num.isEmpty())
	        	{
	        		int value = Integer.parseInt(num);//Integer.parseInt() converts a number in string form to an integer.
	        		
	        		maxvalue = Math.max(value, maxvalue);
	        	}
	        }
	        
	        System.out.println(maxvalue);
	        
	        /*
	         * \\D+ is a regular expression that means:

    \\D – Non-digit character (anything except 0-9).

    + – One or more occurrences.

split("\\D+") splits the string wherever non-digits occur.
	         */
	        
	        
	        
	        
	        boolean found = false;
	        Pattern pattern = Pattern.compile("-?\\d+");
	          Matcher matcher = pattern.matcher(input2);
	          
	          long MAxvalue=  Long.MIN_VALUE;
	          
	          while(matcher.find())
	          {
	        	  long  value = Long.parseLong(matcher.group());
	        	  
	        	  MAxvalue = Math.max(MAxvalue, value);
	        	  found= true;
	          }
	          
	          
	          if(found ==true)
	          {
	        	  System.out.println("The largest number is: " + 	        	  MAxvalue);
	          }else
	        	  
	          {
	        	  System.out.println("No numbers found.");
	        	  
	          }
	          
	          /*
	           * 
	           * "abc12 xyz45 789 xyz100"	                   The largest number is: 789
					"abc xyz"	                                 No numbers found.
					"abc-12 xy -45 -789 xyz100"	                 The largest number is: 100
					"abc99999999999 xyz123456789"	            The largest number is: 99999999999
	           */
	 }
	 
	

}
