package TwoPointerApproach;
import java.util.*;
public class LongestDistictleftMostSubstring {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */      
    Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();       
        String str1=findthedistinctSTring(str);
        String str2 = longestDistinctLeftmost(str);
       System.out.println(str1);  
       System.out.println(str2);
        sc.close();
        
       
    }
	
	private static String longestDistinctLeftmost(String str)
	{
		int start =0;
		int maxlength =0;
		int startIndex = 0;
		
		Set<Character>set = new HashSet<>();
		for(int end =0;end<str.length();end++)
		{
			while(set.contains(str.charAt(end)))
			{
				set.remove(str.charAt(start));
				start++;
			}
			
			set.add(str.charAt(end));
			
			int currentLength = end-start+1;
			//Math.max works for length, but to track substring and 
			//preserve leftmost, we update only when strictly greater length is found.”
			//👉 “If I need index → don’t use Math.max blindly”
			if(currentLength>maxlength)
			{
				maxlength = currentLength;
				startIndex = start;
			}
			
		}
		return str.substring(startIndex, startIndex+maxlength);
	}

	private static String findthedistinctSTring(String str) {
		// TODO Auto-generated method stud 
		int start =0;
		int maxlength =0;
		int leftmost =0;
		Map<Character,Integer> lastIndex = new HashMap<>();
		for(int end =0;end<str.length();end++)
		{
			char ch = str.charAt(end);
			if(lastIndex.containsKey(ch) && lastIndex.get(ch)>=start)
			{
				start = lastIndex.get(ch)+1;
			}	
			lastIndex.put(ch, end);
			
			if(end-start+1>maxlength)
			{
				maxlength = end-start+1;
				leftmost = start;
			}	
		}
		return str.substring(leftmost, leftmost+maxlength);
	}
}
