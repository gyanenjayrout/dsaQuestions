package TwoPointerApproach;
/*
 * 
 * “I use two pointers: one pointer i to read the characters and another pointer index to 
 * write the compressed result back into the same array.

I iterate through the array and count how many times the current character repeats.

Once the group ends, I write the character once and then write the count if it’s greater than one.

Since I write directly into the character array, the compression is done in place.”
 */
import java.util.Arrays;

public class CompreesssString2 {
	public static void main(String[] args) {
		
		String str = "aaabbbcccdd";
		
		int length = Compress(str);
		
		System.out.println(length);
	}

	private static int Compress(String str) {
		// TODO Auto-generated method stub
		
		int index = 0;
		int i =0;
		
		char [] chars= str.toCharArray();
		
		while(i<chars.length)
		{
			int count =0;
			char currentchar = chars[i];
			
			while(i<chars.length && chars[i] == currentchar)
			{
				i++;
				count++;
			}
			
			chars[index++] = currentchar;
			
			if(count>1)
			{
				for(char c: String.valueOf(count).toCharArray())
				{
					chars[index++] = c;
				}
			}
			
			
			
		}
		
		System.out.println(Arrays.copyOf(chars, index));
		System.out.println(new String(chars, 0, index));
		
		return index;
	}
}
