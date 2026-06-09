package HackerRAnk;

import java.util.HashMap;
import java.util.Map;

public class Game_of_Thrones1 {
	  public static void main(String[] args) {
	        System.out.println(canBePalindrome("civic")); // Output: YES
	    }

	private static boolean canBePalindrome(String string) {
		// TODO Auto-generated method stub
		
		Map<Character , Integer> freqmap  = new HashMap<>();
		
		for(char ch: string.toCharArray()) freqmap.put(ch, freqmap.getOrDefault(ch, 0)+1);
		
		 int oddCount = 0;
		
		for(int  count : freqmap.values())
		{
			if(count %2!=0)
			{
				oddCount++;
			}
		}
		
			
		return oddCount >1 ? false : true;
		
	}
}
