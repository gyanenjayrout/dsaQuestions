package String;

public class ParenthesesII {
	public  static String removeOuterParentheses(String s) 
	{
		StringBuilder str =  new StringBuilder();
		
		int balance =0;
		
		for(char ch : s.toCharArray())
		{
			if(ch =='(')
			{
				if(balance>0)
				{
					str.append(ch);
				}
				balance++;
			}
			else if(ch ==')')
			{
				balance--;
				
				if(balance>0)
				{
					str.append(ch);
				}
			}
		}
		
		return str.toString();
	}
	
	
	public static void main(String[] args) {
		
		String  str = "(()())(())";
		System.out.println(removeOuterParentheses(str));
		
		
	}

}
