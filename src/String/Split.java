package String;

import java.util.Arrays;

public class Split {
	
	public static void main(String[] args) {
		String input = "Item123Price45.67Discount5";
		
		
		String[] Numbers = input.split("\\D+");
		
		for(String num: Numbers)
		{
			if(!num.isEmpty())
			{
				System.out.println(num);
			}
		}
		
		
		
		String input2 = "abc123xyz456";
		
		String[] nmberss = input2.split("\\D+");
		
		System.out.println(Arrays.toString(nmberss));
		
		/* o/p =  [, 123, 456]
		 *  When Will the Empty String Appear?
		 *  
		 *  
		 *   How to Remove the Empty Strings?


		 */
		
//		✅ Solution 1: Filter Non-Empty Strings

//	    If the string starts with non-digit characters.
	
		String[] numbers = input2.split("\\D+");

	    
	    numbers = Arrays.stream(numbers)
	                .filter(s -> !s.isEmpty())
	                .toArray(String[]::new);

	System.out.println("Filtered: " + Arrays.toString(numbers));
		
		
		//✅ Solution 2: Use Positive Lookbehind If you want to avoid the empty string without post-processing, use lookbehind:
		
		
		String[] numberss = input2.split("(?<=\\D)(?=\\d)");

		System.out.println(Arrays.toString(numberss));
		//✅ Solution 3: Ignore Leading Delimiters If you only care about digits, use \\D+ and skip the first entry:
		
		
		String[] numbers2 = input2.split("\\D+");

		// Skip the first entry if it's empty
		if (numbers2.length > 0 && numbers2[0].isEmpty()) {
		    numbers2 = Arrays.copyOfRange(numbers2, 1, numbers2.length);
		}

		System.out.println(Arrays.toString(numbers2));

	}
	

}
