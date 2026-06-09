package String;

import java.util.*;
public class ValidParentheses {
	
	public static boolean  isValid(String s) 
	{
		Stack<Character> stack  = new Stack<>();
		
		for(char ch  : s.toCharArray())
		{
			if(ch =='(' || ch =='{' || ch =='[')
			{
				stack.push(ch);
			}
			
			else if(ch ==')' && !stack.isEmpty() && stack.peek() =='(')
			{
				stack.pop();
			}
			else if(ch =='}' && !stack.isEmpty() && stack.peek() =='{')
			{
				stack.pop();
			}
			else if(ch =='[' && !stack.isEmpty() && stack.peek() ==']')
			{
				stack.pop();
			}
			else 
			{
				return false;
			}
			
			
		}
		
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		// Test cases
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([{}])";
        String test5 = "(((";

        // Print the results for each test case
        System.out.println("Input: " + test1 + " | Output: " + isValid(test1)); // true
        System.out.println("Input: " + test2 + " | Output: " + isValid(test2)); // true
        System.out.println("Input: " + test3 + " | Output: " + isValid(test3)); // false
        System.out.println("Input: " + test4 + " | Output: " + isValid(test4)); // true
        System.out.println("Input: " + test5 + " | Output: " + isValid(test5)); // false
    
	}

}
