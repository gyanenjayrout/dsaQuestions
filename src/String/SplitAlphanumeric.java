package String;

import java.util.Arrays;

public class SplitAlphanumeric {
	
	public static void main(String[] args) {
        String input = "a1b2c3d4";
        String[] result = splitString(input);
//        System.out.println("Alphabets: " + result[0]);
//        System.out.println("Numbers: " + result[1]);
        
        String string = Arrays.toString(result);
        System.out.println(Arrays.toString(result));
        
        
    }

	private static String[] splitString(String input) {
		// TODO Auto-generated method stub
		
//		StringBuilder letters = new  StringBuilder();
//		StringBuilder digits = new  StringBuilder();
//		
//		for(char c:input.toCharArray())
//		{
//			if(Character.isLetter(c))
//			{
//				letters.append(c);
//				
//			}else if(Character.isDigit(c))
//			{
//				digits.append(c);
//			}
//
//		}
		
	
	        // Extract letters by removing all digits
	        String letters = input.replaceAll("\\d", "");

	        // Extract digits by removing all non-digits
	        String digits = input.replaceAll("\\D", "");

	        // Print the result as an array representation
	        System.out.println("[\"" + letters + "\", \"" + digits + "\"]");
		return new String[] {letters.toString(),digits.toString() };
	}

}
