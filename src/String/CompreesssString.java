package String;

public class CompreesssString {
	
	public static String Compress(String str)
	{
		if(str == null || str.isEmpty()) return str; 
		
		
		///Because calling isEmpty() on null causes NullPointerException. if we do if(str.isEmpty() || str == null)

		
		
	  char [] chars = str.toCharArray();
	  
	  StringBuilder sb = new StringBuilder();
	  
	  
	  char curentchar = chars[0];
	  int count =1;
	  
	  
	  for(int i=1;i<chars.length;i++)
	  {
		  if(chars[i]== curentchar)
		  {
			  count++;
		  }
		  else {
			  sb.append(curentchar).append(count);
			  curentchar = chars[i];
			  count=1;
		  }
	  }
	  sb.append(curentchar).append(count); // Append last character group
	  
	  
	  /*
	   * 
	   * for (int i = 1; i < chars.length; i++) {
        if (chars[i] == chars[i - 1]) {
            count++;
        } else {
            sb.append(chars[i - 1]).append(count);
            count = 1;
        }
    }
    sb.append(chars[chars.length - 1]).append(count); // last group
	   */
	  return sb.length() < str.length() ? sb.toString() : str;  
	  
	  /*
	   * Input: "abc"
Compressed: "a1b1c1"
Length: 3 → 6 ❌
 compression makes the string longer. So the method should return the original string "abc" instead of "a1b1c1".
	   */
	}
	
	
	public static void main(String[] args) {
		
		String str = "aaabbbcccdd";
		
		String compress = Compress(str);
		
		System.out.println(compress);
	}

}
