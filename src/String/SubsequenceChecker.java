package String;

import java.util.Iterator;

public class SubsequenceChecker {
	
	public static void main(String[] args) {
		 String s = "KOTTAYAM";
	        String target = "KOTA";
	        
	      boolean b =  isSubsequence(s, target);
	      
	      boolean c =  usingjava8(s, target);
	      
	      System.out.println(b);

	}

	private static  boolean  usingjava8(String s, String target) {
		
		
		
		Iterator<Character> it = s.chars().mapToObj(c->(char)c).iterator();
		
		return target.chars().allMatch(c->
		{
			while(it.hasNext())
			{
				if(it.next()==c)
				{
					return true;
				}
			}
			 return false;
			 /*
			  * target.chars() produces an IntStream, and within the allMatch method, each int element
			  *  c is compared directly to characters from the s string. This direct comparison
			  *  is possible because Java seamlessly handles the conversion between int and char types during the comparison operation.
			  */
		});
		// TODO Auto-generated method stub
		
		
		
		
		/*
		 * return target.chars().mapToObj(c->(char)c).allMatch(c-> //explicitly convert the IntStream to a Stream<Character>
		{
			while(it.hasNext())
			{
				if(it.next()==c)
				{
					return true;
				}
			}
			
			return false;
			
		});
		This approach provides a more explicit representation 
		
		of the stream as a sequence of Character objects, which might enhance code readability in certain contexts.
		 * 
		 * 
		 */
	}

	private static boolean isSubsequence(String s, String target) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j =0;
		while(i<s.length()&& j<target.length())
		{
			if(s.charAt(i)==target.charAt(j))
			{
				j++; //When a match is found, j is incremented to move to the next character in the target string.
			}
			i++; //Regardless of whether a match was found or not, i is incremented to move to the next character in the main string
		}
		return j==target.length();
	}

}
