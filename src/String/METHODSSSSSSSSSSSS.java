package String;

public class METHODSSSSSSSSSSSS {

	
	public static void main(String[] args) {
		String vowels = "aeiouAEIOU";
		
		
		char ch = 'e';
//		vowels.contains(ch); // ❌ Does not compile!
		
		/*
		 * 
		 * 
		 * Because .contains() needs a String, not a char.

So you convert char → String using:
		 */
		
		
		
		
		String valueOf = String.valueOf(ch); //✅ String.valueOf(char c) – What it does:

//This method converts a primitive char to a String.
		
		
		
		
		System.out.println(valueOf);
		
		"aeiouAEIOU".contains(String.valueOf(ch));
		
		/*
		 * 
		 * 
		 * Expression	                           Meaning
String.valueOf(char)	                         Converts char to String
"abc".contains(String.valueOf(c))	             Checks if char exists in string
"aeiou".indexOf(c) != -1	                    Faster alternative for char check
		 */
	}
}
