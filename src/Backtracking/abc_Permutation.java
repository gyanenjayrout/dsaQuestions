package Backtracking;


/*
 * Example Explanation

    The function permutation generates all permutations of the input string using recursion. The base case is when the input 
    string becomes empty (str.length() == 0), at which point the current permutation is printed. The recursive case loops through 
    each character in the input string, removing it to create a smaller string and adding it to the current permutation. By doing this 
    for all characters, the function explores all possible branches in a recursive tree.
     The recursion ends when all characters are processed, and the function backtracks to try other possibilities.
 */
public class abc_Permutation {
	
	public static void main(String[] args) {
		String str = "abc";
		
		permutation(str, 0, "");
		
		System.out.println(str);
	}

	private static void permutation(String str, int idx, String perm) {
		// TODO Auto-generated method stub
		
		if(str.length()==0)
		{
			System.out.println(perm);
			return;
		}
		
		for(int i=0;i<str.length();i++)
		{
			char currchar = str.charAt(i);
			
		   String newstring = str.substring(0,i)+str.substring(i+1);
		   permutation(newstring, idx+1,perm+currchar);
		   /*
		    * The key is that Java strings are immutable (cannot be changed after creation), 
		    * so each recursive call works with its own copy of the string.
		    *  This is why backtracking happens automatically without requiring explicit steps.
		    */
		   
		}
		
	}

}

/*
 *
 * 
 * 1. Exploring branch for "A":

    Call: printPermutation("BC", 1, "A")
    str = "BC"
    perm = "A"

Iteration over "BC":

    i = 0, currChar = 'B', newStr = "C"
        Call: printPermutation("C", 2, "AB")
    i = 1, currChar = 'C', newStr = "B"
        Call: printPermutation("B", 2, "AC")
        
       
        --------------------------------------------
        Exploring "AB":

    Call: printPermutation("C", 2, "AB")
    str = "C"
    perm = "AB"

Iteration over "C":

    i = 0, currChar = 'C', newStr = ""
        Call: printPermutation("", 3, "ABC")
            Base Case: Prints "ABC".
            ---------------------------------------------------

Exploring "AC":

    Call: printPermutation("B", 2, "AC")
    str = "B"
    perm = "AC"

Iteration over "B":

    i = 0, currChar = 'B', newStr = ""
        Call: printPermutation("", 3, "ACB")
            Base Case: Prints "ACB".
 */
