package HackerRAnk;
import java.util.*;
public class LongestDistictleftMostSubstring {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    Scanner sc= new Scanner(System.in);
        
        String str = sc.nextLine();
        
        String str1=findthedistinctSTring(str);
        
       System.out.println(str1);
        
        sc.close();
    }

	private static String findthedistinctSTring(String str) {
		// TODO Auto-generated method stub
		
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
