package HackerRAnk;
//Alternating Characters (Remove adjacent duplicates)
public class AlternatingCharacters {
	public static void main(String[] args) {
	    System.out.println(countDeletions("AABAAB"));  // Output: 2
	    System.out.println(countDeletions("AAAA"));    // Output: 3
	    System.out.println(countDeletions("BBBBB"));   // Output: 4
	    System.out.println(countDeletions("ABABAB"));  // Output: 0
	    System.out.println(countDeletions("ABBABBA")); // Output: 3
	}

	private static int countDeletions(String string) {
		// TODO Auto-generated method stub
		
		int deletion =0;
		
		
		
		for(int i=1;i<string.length();i++)
		{
			if(string.charAt(i) ==string.charAt(i-1))
			{
				deletion++;
			}
		}
		return deletion;
	}
}
/*

The string should alternate: A B A B
AABAAB
The problem occurs at indices where characters repeat:
Index	Character	Action
0	A	✅ Keep
1	A	❌ Delete (Same as previous 'A')
2	B	✅ Keep
3	A	✅ Keep
4	A	❌ Delete (Same as previous 'A')
5	B	✅ Keep
*/