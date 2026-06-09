package PrefixSum;

import java.util.*;
public class FirstNonRepeatingChracterinAstream {
  
	public static void firstNonRepeatingStream(String s) {
		Map<Character, Integer> map = new HashMap<>();
		
		Queue<Character> q =new   LinkedList<>();
		
		for(char ch: s.toCharArray())
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
			q.offer(ch);
			
			while(!q.isEmpty() && map.get(q.peek())>1)
			{
				q.poll();
			}
			
			if(q.isEmpty()) System.out.println(-1);
			else
				System.out.println(q.peek());
		}
		
		
	}
	
	public static void main(String[] args) {
		String s = "aabc";
		firstNonRepeatingStream(s);
		
	}
}
