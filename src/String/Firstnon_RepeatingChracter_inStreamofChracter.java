package String;
import java.util.*;
public class Firstnon_RepeatingChracter_inStreamofChracter {
	
		public static void main(String[] args) {

	        String stream = "aabc"; // input stream
		Queue<Character> q = new LinkedList<>();
		Map<Character, Integer> map = new  HashMap<>();
		
		for(char c : stream.toCharArray())
		{
			map.put(c, map.getOrDefault(c, 0)+1);
			q.offer(c);
			
			while(!q.isEmpty() && map.get(q.peek())>1)
			{
				q.poll();
			}
		}
		
		System.out.println(q.isEmpty() ?  -1: q.peek());
		System.out.println(q.isEmpty() ?  -1: String.valueOf(q.peek()));
		System.out.print(q.peek().toString() + " ");
		System.out.print((char) q.peek() + " ");
		System.out.println(q.peek());
		
    }

}
