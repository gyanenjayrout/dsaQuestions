package TwoPointerApproach;
import java.util.*;
import java.util.stream.IntStream;
public class LongestSubstringWithoutRepeatingCharacters {
	
	
	public static void main(String[] args) {
		String s = "abcabcbb";
		int res = lengthOfLongestSubstring(s);
		System.out.println(res);
	}
	public static int lengthOfLongestSubstring2(String s) {
		int start =0;
		int maxLength =0;
		Set<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			while(set.contains(s.charAt(i)))
			{
				set.remove(s.charAt(start));
				start ++;
			}
				
				
			set.add(s.charAt(i));
			
			maxLength = Math.max(maxLength, i-start+1);
		}
		return maxLength;
		
	}
	public static int lengthOfLongestSubstring(String s) {
		/*
		int start = 0;
		int maxlength =0;
		
		Set<Character> set =  new HashSet<>();
		for(int end=0;end<s.length();end++)
		{
			while(set.contains(s.charAt(end)))
			{
				set.remove(s.charAt(start));
				start++;
			}
			
			set.add(s.charAt(end));
			
			maxlength =  Math.max(maxlength, end-start+1);
			
		}
		
		return maxlength;
		
		*/
		
		//------------------using java 8
		
//		
//		IntStream.range(0, s.length()) 
//	    .reduce(new int[]{0, 0}, (acc, i) -> { 
//	        // Function logic here 
//	    }, (a, b) -> a)[1]; 
		
		Map<Character, Integer> charIndexMap = new HashMap<>();
		
		int maxLength = java.util.stream.IntStream.range(0, s.length())
			    .collect(() -> new int[]{0, 0}, // Supplier: Initial accumulator (left boundary, max length)
			        (acc, i) -> {
			            char c = s.charAt(i);
			            if (charIndexMap.containsKey(c)) {
			                acc[0] = Math.max(acc[0], charIndexMap.get(c) + 1); // Update left boundary
			            }
			            charIndexMap.put(c, i); // Store latest index of `c`
			            acc[1] = Math.max(acc[1], i - acc[0] + 1); // Update max length
			        },
			        (a, b) -> { // Combiner (needed for parallel streams, but ignored in sequential case)
			            a[0] = Math.max(a[0], b[0]);
			            a[1] = Math.max(a[1], b[1]);
			        })[1]; // Return the second element (max length)

		
		return  maxLength;
	}
	
	
	
	
	

	
	
//	public static int lengthOfLongestSubstring(String s) 
//	{
//		
//		int maxlength = 0;
//		
//		for(int i=0;i<s.length();i++)
//		{
//			for(int j=i+1;j<s.length();j++)
//			{
//				String sub = s.substring(i,j);
//				
//				if(uniq(sub))
//				{
//					maxlength = Math.max(maxlength, sub.length());
//				}
//			}
//		}
//		return maxlength;
//		
//	}
//
//
//	private static boolean uniq(String sub) {
//		// TODO Auto-generated method stub
//		
//		Set<Character> set =  new HashSet<>();
//		
//		for(char c: sub.toCharArray())
//		{
//			if (set.contains(c))
//			{
//				return false;
//			}
//			
//			set.add(c);
//		}
//		return true;
//	}

}
