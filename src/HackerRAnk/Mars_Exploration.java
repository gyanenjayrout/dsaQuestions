package HackerRAnk;
//✅ 10. Mars Exploration (Count altered characters in a repeating signal)
public class Mars_Exploration {
	
	 public static void main(String[] args) {
	        System.out.println(countAlteredChars("SOSSPSSQSSOR")); // Output: 3
	    }

	private static int countAlteredChars(String string) {
		// TODO Auto-generated method stub
		
		int count =0;
		String expcted ="SOS";
		
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=expcted.charAt(i%3))
			{
				count++;
			}
		}
		return count;
	}

}
/*
You're given a string like "SOSSPSSQSSOR" — it's a distorted signal.
You know that originally, the message should have been something like "SOSSOSSOSSOS" — just repeating "SOS" over and over.

You need to count how many characters were altered (not matching "SOS" pattern).
🔁 i % 3 Trick

You're using this trick to cycle through the "SOS" string:

    i = 0 → expected.charAt(0) → 'S'

    i = 1 → expected.charAt(1) → 'O'

    i = 2 → expected.charAt(2) → 'S'

    i = 3 → expected.charAt(0) → 'S'

    i = 4 → expected.charAt(1) → 'O'

...and so on. This repeats "SOS" pattern for comparison.
*/
