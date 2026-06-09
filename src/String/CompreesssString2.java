package String;

public class CompreesssString2 {
	
	 public int compress(char[] chars) {
		 
		 int i=0;
		 int index= 0;
		 
		 while(i<chars.length)
		 {
			 
			 char currentchar =chars[i];
			 int count =1;
			 
			 while(i<chars.length && chars[i] == currentchar)
			 {
				
				 count++;
				 i++;
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
		 
		 return index;
	 }

}
