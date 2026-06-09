package HackerRAnk;

public class Pangrams {
	  public static void main(String[] args) {
	        System.out.println(isPangram("The quick brown fox jumps over the lazy dog")); // Output: YES
	    }

	private static String isPangram(String string) {
		// TODO Auto-generated method stub
		
		boolean[] letters = new boolean[26];
		
		 string = string.toLowerCase();
		
		for(char ch: string.toCharArray())
		{
			if (Character.isLetter(ch)) {
                letters[ch - 'a'] = true;
            }
		}
		
		for(boolean exists: letters)
		{
			if(!exists)
			{
				return "NO";
			}
		}
		return "Yes";
	}
}
