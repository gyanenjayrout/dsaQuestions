package SlididngWindow;

import java.util.*;

//Longest Substring With At Most K Distinct Characters
public class longest_subString_with_K_distinct_element {

	public static void main(String[] args) {
		String s = "aaabbcddd";
		int k =2;
		
		long length =fingtheLOngestSubArarayy(s, k);
		
		System.out.println(length);
	}
	
	private static long fingtheLOngestSubArarayy(String s, int k)
	{
		
		int start =0;
		int MaxLength =0;
		
		Map<Character, Integer> map = new HashMap<>();
	
		for(int end=0;end<s.length();end++)
		{
			 char ch = s.charAt(end);
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
			
			 while(map.size()>k)
			 {
				 
				 char leftChar = s.charAt(start);
				 map.put(leftChar, map.get(leftChar)-1);
				 
				 
				 if(map.get(leftChar)==0)
				 {
					 map.remove(leftChar);
				 }
				 start++;
			 }
			 
			 MaxLength = Math.max(MaxLength, end-start+1);
		
			
		}
		
		return MaxLength;
		
	}

	private static  long fingtheLOngestSubAraray(String s, int k) {
		// TODO Auto-generated method stub
		/*
 Fix starting index i
Expand substring using j
Track distinct characters using Set
If size > k → break
Track max length
		 */
		int maxLength =0;
		
		for(int  i=0;i<s.length();i++)// // runs n times
		{
			
			Set<Character>set = new HashSet<>();
			
			for(int j =i;j<s.length();j++) //// runs (n-i) times
			{
				set.add(s.charAt(j));
				
				if(set.size()>k) break;
				
				maxLength = Math.max(maxLength, j-i+1);
			}
		}
		
		return maxLength;
	}
/*
 * For i = 0 → j runs n times
For i = 1 → j runs n-1 times
For i = 2 → j runs n-2 times
...
For i = n-1 → j runs 1 time

👉 Total =
n + (n-1) + (n-2) + ... + 1

👉 This sum = n(n+1)/2 ≈ O(n²) 👉 “We are generating all substrings, and total substrings are ~ n², so time complexity is O(n²).”




Set<Character>set = new HashSet<>();
			
We break when set.size() > k
So set will never grow beyond k+1

👉 Max size of set = k
This set stores only distinct characters in current substring.
 */
	
}

