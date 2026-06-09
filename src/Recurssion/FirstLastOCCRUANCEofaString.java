package Recurssion;

public class FirstLastOCCRUANCEofaString {
	public static int first =-1;
	public static  int last =-1;
	
	public static void firstlast(String s, int idx, char element)
	{
	  if(idx == s.length()-1)
	  {
		 System.out.println(first);
		 System.out.println(last);
		 return;
	  }
		
	
		 char ch = s.charAt(idx);
		 
		 if(ch == element)
		 {
			 if(first ==-1)
			 {
				 first = idx;
			 }else
			 {
				 last = idx;
			 }
		 }
		
		 
		 firstlast(s, idx+1, element);
	}
	
	public static void main(String[] args) {
		
		String s = "abvgykahvhjvakjh";
		
		firstlast(s, 0, 'a');
	}

}
