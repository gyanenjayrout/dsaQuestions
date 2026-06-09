package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeating {
	
	public static void main(String[] args) {
		   String input = "aabbccddeeefg";
	        System.out.println(firstNNonRepeating(input));
	        System.out.println(firstNNonRepeatingUsingMap(input));
	        // f
	}

	private static Character firstNNonRepeatingUsingMap(String str) {
		// TODO Auto-generated method stub
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c : str.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{
			if(entry.getValue()==1)
			{
				return entry.getKey();
			}
		}
		
		return null;
	}

	private static Character  firstNNonRepeating(String input) {
		// TODO Auto-generated method stub
		LinkedHashMap<Character, Long> map = input.chars().mapToObj(c->(char)c)
		.collect(Collectors
				.groupingBy(Function.identity(),
						LinkedHashMap::new, Collectors.counting()));
		return map.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry:: getKey).findFirst().orElse(null);
	}

}
