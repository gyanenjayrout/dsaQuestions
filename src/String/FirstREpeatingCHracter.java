package String;
import java.util.*;
public class FirstREpeatingCHracter {

	
	public static void main(String[] args) {
		String s  = "abca";
		Set<Character> set = new HashSet<>();
		
		for(char c: s.toCharArray())
		{
			if(set.contains(c))
			{
				System.out.println(c);
			}
			set.add(c);
		}
	}
}
