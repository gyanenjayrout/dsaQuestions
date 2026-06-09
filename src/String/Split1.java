package String;

import java.util.Arrays;
import java.util.regex.Matcher;

/*
 * 📌 1. Understanding Common split() Patterns

In Java, the split() method is used to divide a string based on a delimiter (or pattern). It accepts a regular expression (regex) to define how to split the input string.

 */
public class Split1 {
	
	public static void main(String[] args) {
		
		
		//✅ Example 1: Split by Whitespace (\\s+)
		
		//So, essentially, the regex "\\s+" tells split() to look for any sequence
		//of whitespace characters, use those as break points, and remove them from the output
		
		//\\s matches any whitespace chracter(space, tab, newline etc)
		// + match one or more occrance
	        String input = "Hello   World\t  \n Java";
	        String[] result = input.split("\\s+");

	        System.out.println(Arrays.toString(result));
	    
	        
	        
	        
	        //✅ Example 2: Split by ", " (Comma + Space)
	        
	        String input2 = "apple, banana, cherry";
	        
	        String[] result2  = input2.split(", ");
	        
	        System.out.println(Arrays.toString(result2));
	        
	        
	        //✅ Example 3: Split by Non-Word Characters (\\W+)
	        
	        String input3 = "abc@123#def$456";
	        
	        String[] result3 = input3.split("\\W+");//The \\W regex pattern matches any Non-word character and remove it 
	        
	        String [] result33  = input3.split("\\w+"); //The \\w regex pattern matches any word character  and remove it
	        

	        System.out.println(Arrays.toString(result3));
	        
	        System.out.println(Arrays.toString(result33));
	        //Removing punctuation or symbols.

//              Extracting alphanumeric data.
	      
	        
	        
	        
	        
	        //✅ Example 4: Split by Empty String ("") it works better when words are sepateed by one space 
	        
	        String input4 = "Hello   World   Java";
	        String input9  = "Hello world java";
	        String[] result4 = input4.split(" ");
	        
	        String[] split = input9.split(" ");
	        System.out.println(Arrays.toString(split) + " split by ");

	        System.out.println(Arrays.toString(result4)); 
	        
	        
	        
	        
	        
	        
	       //Example : split Matcher nonDigitMatcher
	        
	        
	        String input5 = "abc123xyz456";
			
			String[] nmberss = input5.split("\\D+"); // \\D match with non-digit chacter and remove
			
			String [] numbers =  input5.split("\\d+"); //   \\d match with didits; and remove 
			
			System.out.println(Arrays.toString(nmberss));
			
			System.out.println(Arrays.toString(numbers));
	}
	

}


/*



			  Pattern	               Meaning	Example                                 Input	                       Output
			"\\s+"	                 Split by one or more whitespace characters	       "abc def ghi"	             ["abc", "def", "ghi"]
			", "	                         Split by comma and a space	                  "a, b, c"	                ["a", "b", "c"]
			""	                              Split each character	                        "hello"	             ["h", "e", "l", "l", "o"]
			"\\W+"	                       Split by non-word characters (symbols)	       "abc@123#def"	         ["abc", "123", "def"]
			"\\d+"	                           Split by one or more digits	              "a1b22c333"	           ["a", "b", "c"]
			"[,;\\s]+"	                   Split by comma, semicolon, or space	            "a, b; c"	               ["a", "b", "c"]
*/