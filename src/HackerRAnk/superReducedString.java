package HackerRAnk;
import java.util.*;
public class superReducedString {
	public static String superReducedString(String s) 
	{
		StringBuilder sb=  new StringBuilder();
		
		for(char ch : s.toCharArray())
		{
			if(sb.length()>0 && sb.charAt(sb.length()-1)==ch)
			{
				sb.deleteCharAt(sb.length()-1);
			}else
			{
				sb.append(ch);
			}
		}
		
		return sb.isEmpty() ? "String is Empty"  :sb.toString();
	}
	public static void main(String[] args) {
        System.out.println(superReducedString("aaabccddd")); // Output: "abd"
        System.out.println(superReducedStringUSingSTack("baab"));      // Output: "Empty String"
    }
	
	
	public static String superReducedStringUSingSTack(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop(); // Remove adjacent pair
            } else {
                stack.push(ch);
            }
        }

        return stack.isEmpty() ? "Empty String" : stackToString(stack);
    }

    private static String stackToString(Stack<Character> stack) {
        StringBuilder sb = new StringBuilder(stack.size());
        for (char ch : stack) {
            sb.append(ch);
        }
        return sb.toString();
    }
	
	

}
