package TwoPointerApproach;

public class Backspace_String_Compare {
	public static boolean backspaceCompare1(String s, String t) {

		return builDstring(s).equals(builDstring(t));
	}

	private static String builDstring(String str) {
		// TODO Auto-generated method stub
		
		StringBuilder result = new StringBuilder();
		
		for(char ch :str.toCharArray())
		{
			if(ch !='#')
			{
				result.append(ch);
			}else if(result.length()>0)
			{
				result.deleteCharAt(result.length()-1);
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String  s = "ab#c", t = "ad#c";
		
		String s1= "abef#g##cd";
		String s2 = "abe#cd";
		
		
		boolean backspaceCompare = backspaceCompare1(s, t);
		boolean backspaceCompare1 = backspaceCompare(s1, s2); //two pointer approch
		
		System.out.println(backspaceCompare);
		
		System.out.println(backspaceCompare1);
		
	}

private static boolean backspaceCompare(String s, String t) {
	// TODO Auto-generated method stub
	
	int i = s.length()-1;
	int j = t.length()-1;
	
	while(i>=0&& j>=0)
	{
		i = findNextValidCharIndex(s, i);
        j = findNextValidCharIndex(t, j);
		if( s.charAt(i)!=t.charAt(j))
		{
			return false;
		}
		
		if (i < 0 && j < 0) {
            return true;
        }
		
		if(i<0 || j<0)
		{
			return false;
		}
		
		i--;
		j--;
	}
	return true;
}

private static int findNextValidCharIndex(String Str, int index) {
	// TODO Auto-generated method stub
	 int backspaceCount = 0;
	 
	 while(index>=0)
	 {
		 if(Str.charAt(index)=='#')
		 {
			 backspaceCount++;
			 index--;
		 }else if(backspaceCount>0)
		 {
			 backspaceCount--;
			 index--;
		 }else 
		 {
			 break;
		 }
	 }
	return index;
}

}

/**
 * 
 * To perform a dry run of the provided code with the input strings s1 = "abef#g##cd" and s2 = "abe#cd", let's analyze how the code processes each string step by step.

Initialization:

    i = s1.length() - 1 = 9 (Index of the last character in s1)

    j = s2.length() - 1 = 5 (Index of the last character in s2)

    counts = 0 (Counter for backspaces in s1)

    countT = 0 (Counter for backspaces in s2)

Processing s1 ("abef#g##cd"):

Starting from the end (i = 9), the code examines each character:

    i = 9: Character is 'd'. No backspace; proceed to comparison.

    i = 8: Character is 'c'. No backspace; proceed to comparison.

    i = 7: Character is '#'. Increment counts to 1; move to i = 6.

    i = 6: Character is '#'. Increment counts to 2; move to i = 5.

    i = 5: Character is 'g'. counts > 0, so decrement counts to 1; move to i = 4.

    i = 4: Character is '#'. Increment counts to 2; move to i = 3.

    i = 3: Character is 'f'. counts > 0, so decrement counts to 1; move to i = 2.

    i = 2: Character is 'e'. counts > 0, so decrement counts to 0; move to i = 1.

    i = 1: Character is 'b'. No backspace; proceed to comparison.

    i = 0: Character is 'a'. No backspace; proceed to comparison.

Resulting s1 after processing: "abcd"

Processing s2 ("abe#cd"):

Starting from the end (j = 5), the code examines each character:

    j = 5: Character is 'd'. No backspace; proceed to comparison.

    j = 4: Character is 'c'. No backspace; proceed to comparison.

    j = 3: Character is '#'. Increment countT to 1; move to j = 2.

    j = 2: Character is 'e'. countT > 0, so decrement countT to 0; move to j = 1.

    j = 1: Character is 'b'. No backspace; proceed to comparison.

    j = 0: Character is 'a'. No backspace; proceed to comparison.

Resulting s2 after processing: "abcd"

Comparison:

After processing both strings to account for backspaces, the resulting strings are:

    s1: "abcd"

    s2: "abcd"

Since both processed strings are identical, the function would return true, indicating that s1 and s2 are equal after considering the backspace characters.

Note: The provided code snippet focuses on processing the strings to handle backspaces. To complete the comparison, you would need to include logic that compares the processed strings and returns the appropriate boolean value.

 */
