package String;

import java.util.Arrays;

public class SplitMEthod {
	public static void main(String[] args) {
		String str = "apple,banana,cherry";
		
		String [] fruits = str.split(",");
		for(String string: fruits)
		{
			System.out.println(""+string+"");
		}
		
		
		String s2 = "Hello";
		
		char [] c = s2.toCharArray();
		for(char ch :c)
		{
			System.out.println(ch);
		}
		
		
		
		
		String str2 = "one,two;three four|five";
		
		String [] s = str2.split("[,; |]+");
		/*
		 * Why Use +?:

    The + ensures that if there are multiple delimiters (like ,, or ), 
    it treats them as a single delimiter, preventing
     empty elements from being added to the result array.
    Example: If the string was "one,,two;;;three", the + ensures that multiple commas or semicolons 
    are treated as one, so "one,,two;;;three" would split into "one", "two", "three" without empty elements.*/
		
		
		
		for(String s1: s)
		{
			System.out.println(s1);
		}
		
		
		
		 String str3 = "apple,banana,,";
		 
		 String [] st = str3.split(", " ,-1);
		 
		 
		 /*Pattern Explanation:

    "," - This splits the string based on commas (,).

-1 Parameter:

    The -1 is a special limit parameter that tells the split() method to include trailing empty strings in the result.
    Normally, if you don't pass -1 (or pass a positive integer), the split() method would discard trailing empty strings.

Why Use -1?:

    Without -1, "apple,banana,," would result in ["apple", "banana"] (ignoring the trailing commas).
    With -1, "apple,banana,," results in ["apple", "banana", "", ""], meaning it includes the empty elements caused by the trailing commas.*/
		 
		 
		 
		 
		 System.out.println(Arrays.toString(st));
		 for(String s22: st)
		 {
			 System.out.println(s22);
		 }
		 
		 String str4 = "one,two,three,four";
	        String[] parts = str4.split(",", 2); // Only split into 2 parts

	        for (String part : parts) {
	            System.out.println(part);
	        }
		 
	        
	        String strr = "the sky is blue";
	        
	        String [] rev  =strr.split(" ");
	        
	        for(int i=rev.length-1;i>0;i--)
	        {
	        	System.out.print(rev[i]);
	        	if (i != 0) {
	                System.out.print(" ");
	            }
	        }
	        
	        
	        System.out.println("\\+W");
	        
	        String paragraph = "Hello, world! Welcome to Java.";
	        String[] words = paragraph.split("\\W+");
	         
	        for (String word : words) {
	            System.out.println(word);
	        }
	        
//	        Example:
	        	String str1 = "Hello, World!";
	        	String[] result = str1.split("\\w+"); // Splits at word characters
	        	System.out.println(Arrays.toString(result)); // Output: [, , !]


//	        	String str5 = str1.replaceAll("\\s+", "").toLowerCase();
//	        	
//	        	System.out.println(str5);
	        	
	        	String paragraph1 = "Hello, world! Java is great.";
	        	paragraph1 = paragraph1.replaceAll("[^a-zA-Z0-9\\s]", ""); 
	        	
	        	System.out.println(paragraph1);
	        	String[] wordss = paragraph1.split("\\s+"); // Split by spaces (one or more)
	        	 
	        	for (String word : wordss) {
	        	    System.out.println(word);
	        	}

	        	 
	        	
	        

	}

}
