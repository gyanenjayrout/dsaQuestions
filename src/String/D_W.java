package String;

import java.util.Arrays;

public class D_W {
	
//	 RegexExample 
	    public static void main(String[] args) {
	        String input = "abc@123#xyz!456";

	        // Split by non-word characters
	        String[] result = input.split("\\W+");

	        System.out.println(Arrays.toString(result));
	        
	        
	        //[abc, 123, xyz, 456]
	        
	        
	        
	        String[] result1 = input.split("\\D+");

	        System.out.println(Arrays.toString(result1));
	      //otput: [, 123, 456]
	    }

}

/*
📌 1. What Does \\W+ Mean?

    \\W: Matches any non-word character.

    +: Means one or more occurrences of the previous character.

👉 Non-word characters are anything except:

    A-Z, a-z (letters)

    0-9 (digits)

    _ (underscore)

✅ Examples of What \\W+ Matches:

    Punctuation: !, @, #, $, %, &, etc.

    Whitespace: Space ( ), tab (\t), newline (\n).

    Special Symbols: *, +, =, -, /, ,, .



📌 2. What Does \\D+ Mean?

    \\D: Matches any non-digit character.

    +: Matches one or more occurrences of the previous character.

👉 Non-digit characters are anything except numbers (0-9).

✅ Examples of What \\D+ Matches:

    Letters: a-z, A-Z

    Punctuation: !, @, #, etc.

    Spaces and Special Symbols: Any character except digits.

📊 Example of \\D+ in Action


*/