
package String;

public class VowelConsonantCount {
//    public static void main(String[] args) {
//        String str = "Hello World!";
//        int vowels = 0, consonants = 0;
//
//        for (char c : str.toCharArray()) {
//            if (Character.isLetter(c)) {
//                if ("aeiouAEIOU".indexOf(c) != -1) {
//                    vowels++;
//                } else {
//                    consonants++;
//                }
//            }
//        }
//        System.out.println("Vowels: " + vowels); // Output: Vowels: 3
//        System.out.println("Consonants: " + consonants); // Output: Consonants: 7
//    }
	public static void main(String[] args) {
        String str = "Hello World!";
        int vowels = 0, consonants = 0;
     for(char c: str.toCharArray())
     {
    	 if(Character.isLetter(c))
    	 {
    		 if("aeiouAEIOU".indexOf(c)!=-1)
    			 /*
    			  * .indexOf(c):

    Returns the index of character c in the string if it exists.

    Returns -1 if the character is not found.
    
    
    if ("aeiouAEIOU".contains(String.valueOf(c)))
    his is more readable, but .indexOf() is slightly faster and more common in interview-style code like this.
    			  */
    		 {
    			 vowels++;
    		 }
    		 else
    		 {
    			 consonants++;
    		 }
    	 }
    	 
     }
     
     System.out.println("Vowels: " + vowels); // Output: Vowels: 3
  System.out.println("Consonants: " + consonants); // Output: Consonants: 7
    }
	
	
}
