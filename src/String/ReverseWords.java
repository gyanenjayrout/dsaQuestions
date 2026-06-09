package String;

import java.util.Arrays;

public class ReverseWords {
	
	
	
	public static void main(String[] args) {
		String str = "Hello world";
		
	
	
		
		
		String [] words = str.split(" ");
		
		StringBuilder sb = new  StringBuilder("");
		
		
		for(int  i =words.length-1;i>=0;i--)
		{
			sb.append(words[i]);
			if (i != 0) {
                sb.append(" ");
            }
		}
		
		System.out.println(sb.toString());
		
	}

}

/*Initially, the array after split(" ") is: ["hello", "world"].
In the first iteration, i = 1 (which corresponds to the word "world").

We append "world" and then add a space (since i != 0).

In the second iteration, i = 0 (which corresponds to the word "hello").

We append "hello", but since i == 0, we don't add a space after it.*/