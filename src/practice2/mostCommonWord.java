package practice2;
import java.util.*;
public class mostCommonWord {
	
	public static void main(String[] args) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String [] banned = {"hit"};
		
		String mostCommonWord = mostCommonWord(paragraph,banned);
		
		System.out.println(mostCommonWord);
	}

	private static String mostCommonWord(String pargraph, String[] banned) {
		// TODO Auto-generated method stub
		
		String  [] str = pargraph.toLowerCase().split("\\W+");	
		 HashMap<String, Integer> map = new HashMap<>();
         
         Set<String > bnnedset =  new HashSet<>(Arrays.asList(banned));
		
		String maxword = "";
		int maxcont =0;	           
		           for(String word :str)
		           {
		        	   if(!bnnedset.contains(word))
		        	   {
		        		   int count =  map.getOrDefault(word, 0)+1;
		        		   
		        		   map.put(word, count);
		        		   
		        		   if(count> maxcont)
		        		   {
		        			   maxcont = count;
		        			   maxword =word;
		        			   
		        			   
		        		   }
		        		  
		        	   }
		           }
		return maxword;
	}
	
	
	
	

	
	
}
