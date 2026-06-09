package String;
/*
 * interviewer asks how this works, say:

First I store the last occurrence of every character. Then I iterate through the string and keep extending the partition end to the farthest last occurrence of characters seen so far. When the current index reaches the partition end,
 I know that all characters of this partition are contained within it, so I record the partition size.
 */
import java.util.*;

public class partitionLabels {
	
	public static void main(String[] args) {
		String  s = "ababcbacadefegdehijhklij";
		List<Integer> partitionLabels = partitionLabels(s);
		
		System.out.println(partitionLabels);
		
	}
	
	public static List<Integer> partitionLabels(String s) 
	{
		
		
		List<Integer> result  =  new ArrayList<>();
		
		
		int [] lastOccrance  = new int [26];
		
		for(int i=0;i<s.length();i++)
		{
			lastOccrance[s.charAt(i)-'a'] =i;
		}
		
		int start = 0;
		int end = 0;
		for(int i =0;i<s.length();i++)
		{
			end = Math.max(end, lastOccrance[s.charAt(i)-'a']);
			
			if(i==end)
			{
				result.add(end-start+1);
				start =i+1;
			}
		}
		
		
		return result;
		
	}

}
