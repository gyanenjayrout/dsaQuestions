package Hashing;
import java.util.*;

/*
 * Question:
Given a string, sort characters by frequency in descending order. 
If two characters have the same frequency, maintain their original order of first appearance.
Count frequency of each character.

Maintain order of first appearance (for tie).

Sort by:

Higher frequency first

If frequency same → earlier appearance first

Build result.s
 */
public class CustomFrequencySortofCharacters {
	
	    public String frequencySort(String s) {
	        Map<Character, Integer> freq = new LinkedHashMap<>();

	        // Count frequency (LinkedHashMap maintains insertion order)
	        for (char c : s.toCharArray()) {
	            freq.put(c, freq.getOrDefault(c, 0) + 1);
	        }

	        // Convert to list for sorting
	        List<Map.Entry<Character, Integer>> list = new ArrayList<>(freq.entrySet());

	        // Sort by frequency descending (no change in order if same frequency)
	        list.sort((a, b) -> b.getValue() - a.getValue());

	        // Build result
	        StringBuilder sb = new StringBuilder();
	        for (Map.Entry<Character, Integer> entry : list) {
	            char ch = entry.getKey();
	            int count = entry.getValue();
	            sb.append(String.valueOf(ch).repeat(count));
	        }

	        return sb.toString();
	    }
	

}
