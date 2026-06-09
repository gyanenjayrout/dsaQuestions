package String;
import java.util.*;
public class GroupAnnagrm {
	class Solution {
	    public List<List<String>> groupAnagrams(String[] strs) {

	        Map<String, List<String>> map = new HashMap<>();

	        for (String word : strs) {

	            int[] freq = new int[26];

	            for (char c : word.toCharArray()) {
	                freq[c - 'a']++;
	            }

	            StringBuilder sb = new StringBuilder();

	            for (int a : freq) {
	                sb.append('#').append(a);
	            }

	            String key = sb.toString();

//	            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
	            if (!map.containsKey(key)) {
	                map.put(key, new ArrayList<>());
	            }

	            map.get(key).add(word);
	        }

	        return new ArrayList<>(map.values());
	    }
	}

}

/*
 * What is time complexity?

Answer like this:

The time complexity is O(N × K) where N is the number of strings and K is the average length of each string.
For each string we build a frequency array and generate a key, which takes O(K) time.

If asked space complexity:

Space complexity is O(N × K) because we store all strings in the HashMap groups.
 */
