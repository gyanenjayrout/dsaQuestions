package Hashing;
import java.util.*;
public class WordPattern {
	
//	Sc= O(n) + O(n) + O(n) = O(n) Auxiliary space is O(n) due to split words array and two HashMaps storing up to n mappings.


	public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");   // O(n)

        if(pattern.length() != words.length) return false;

       Map<Character, String> map1 = new HashMap<>(); // O(n)
       Map<String, Character> map2 = new HashMap<>();  // O(n)


       for(int i=0;i<pattern.length();i++)
       {
          char ch = pattern.charAt(i);

          String word = words[i];


          if(map1.containsKey(ch) && !map1.get(ch).equals(word)) return false;

          if(map2.containsKey(word) && map2.get(word)!= ch) return false;

          map1.put(ch, word);
          map2.put(word, ch);
       }

       return true;
   }
	public boolean wordPatternWITHOUTSPIT(String pattern, String s) {

	    Map<Character, String> map1 = new HashMap<>();
	    Map<String, Character> map2 = new HashMap<>();

	    int i = 0; // pattern index
	    int j = 0; // string pointer

	    while (i < pattern.length() && j < s.length()) {

	        int start = j;

	        while (j < s.length() && s.charAt(j) != ' ') {
	            j++;
	        }

	        String word = s.substring(start, j);

	        char ch = pattern.charAt(i);

	        if (map1.containsKey(ch) && !map1.get(ch).equals(word))
	            return false;

	        if (map2.containsKey(word) && map2.get(word) != ch)
	            return false;

	        map1.put(ch, word);
	        map2.put(word, ch);

	        i++;
	        j++; // skip space
	    }

	    return i == pattern.length() && j >= s.length();
	}
}
