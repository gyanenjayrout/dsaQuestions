package practice2;

public class Anangram {
	
	public static void main(String[] args) {
		String s1 = "listen";
		String s2=  "silent";
		
		boolean  b = checkAnagrm(s1,s2);
		System.out.println(b);
	}

	private static boolean checkAnagrm(String s1, String s2) {
		// TODO Auto-generated method stub
		
	 s1   = s1.replaceAll("\\s+", "").toLowerCase();
	 s2 = s2.replaceAll("\\s+", "").toLowerCase();
	 
	  int [] charcount = new int[26];
	  
	  for(char c: s1.toCharArray())
	  {
		  charcount[c-'a']++;
	  }
	  
	  for(char c: s2.toCharArray())
	  {
		  charcount[c-'a']--;
		  
		  if(charcount[c-'a']<0)
		  {
			  return false;
		  }
	  }
	 
	 
		return true;
	}

}
