package HackerRAnk;

public class Anagram {
	 public static void main(String[] args) {
	        System.out.println(minDeletions("abc", "cde")); // Output: 4
	        
	        System.out.println(checkAngaram("abc", "bcaa"));
	    }

	private static int minDeletions(String string, String string2) {
		// TODO Auto-generated method stub
		
		string = string.replaceAll("\\s+", "").toLowerCase();
		
		string2 = string2.replace("\\s+", "").toLowerCase();
		
	    int [] frequmap = new int[26];

		for(char ch: string.toCharArray())
		{
			frequmap[ch-'a']++;
		}
		
		for(char ch : string2.toCharArray())
	      {
	    	  frequmap[ch-'a']--;
	    	  
	    	 
	      }
		
		int deletetion =0;
		
		for(int count : frequmap)
		{
			deletetion= deletetion+Math.abs(count);
		}
		return deletetion;
	}

	private static boolean checkAngaram(String string, String string2) {
		// TODO Auto-generated method stub
		
		 string = string.replaceAll("\\s+", "").toLowerCase();
	     string2 = string2.replaceAll("\\s+", "").toLowerCase();
	     
	     if(string.length() !=string2.length())
	     {
	    	 return false;
	     }
	     
	     int [] frequmap = new int[26];
	     
	      for( char ch: string.toCharArray())
	      {
	    	  frequmap[ch-'a']++;
	      }
	      
	      for(char ch : string2.toCharArray())
	      {
	    	  frequmap[ch-'a']--;
	    	  
	    	  if(frequmap[ch-'a']<0)
	    	  {
	    		  return false;
	    	  }
	      }
	     
		return true;
	}
}
