package Wissenfinal;

import java.util.ArrayList;
import java.util.*;



public class GropOfangram {
	 public static void main(String[] args) {
		 GropOfangram solution = new GropOfangram();
	        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
	        System.out.println(solution.groupAnagrams(input));
	    }
	 
	 private List<List<String>> groupAnagrams(String[] input) {
		 
		    Map<String, List<String>> map = new LinkedHashMap<>();

		 
		 for(String word: input)
		 {
			 char [] chars = word.toCharArray();
			 
			 Arrays.sort(chars);
			 
			 String sortedWord = new String(chars);
			 
			 map.computeIfAbsent(sortedWord, k->new ArrayList<>()).add(word);
		 }
		return new ArrayList<>(map.values());
		 
		 
	 }
}
