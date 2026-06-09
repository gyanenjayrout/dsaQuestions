package Wissen_technology;

import java.util.*;

public class GroupAnagrams {
	 public static void main(String[] args) {
	        GroupAnagrams solution = new GroupAnagrams();
	        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
	        System.out.println(solution.groupAnagrams(input));
	    }

	private List<List<String>> groupAnagrams(String[] input) {
		// TODO Auto-generated method stub
		
		   Map<String, List<String>> map = new HashMap<>();
		   
		   for(String word: input)
		   {
			   char [] chars = word.toCharArray();
			   Arrays.sort(chars);
			   
			   String sortedword = new String(chars);
//			      map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);   
			   if(!map.containsKey(sortedword))
			   {
				   map.put(sortedword, new ArrayList<>());
			   }
			   map.get(sortedword).add(word);
			   
		   }
		return new ArrayList<>(map.values());
	}
}
