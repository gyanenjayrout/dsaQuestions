package String;

public class findPalindromeSbstringsss {
	public static void findPalindromesBrute(String s) {
	    int n = s.length();
	    
	    
	    for(int i=0;i<s.length();i++)
	    {
	    	for(int j=i+1;j<s.length();j++)
	    	{
	    		String sub = s.substring(i,j);
	    		if(palldendrome(sub))
	    		{
	    			System.out.println(sub);
	    		}
	    		
	    	}
	    }
}

	private static boolean palldendrome(String s) {
		// TODO Auto-generated method stub
		
		int start =0;
		int end =s.length()-1;
		
		while(start<end)
		{
			if(s.charAt(start) !=s.charAt(end))
			{
				return false;
			}
			
			start++;
			end--;
		}
		return true;
	}
	
	
	   int count = 0;  // make it class level
	    public int countSubstrings(String s) {
	    

	        for(int i=0;i<s.length();i++)
	        {
	            expand(s, i, i);
	            expand(s, i,i+1);
	        }
	         return count;
	    }

	    public void expand(String s, int left, int right)
	    {
	        while (left>=0 && right <s.length() && s.charAt(left )==s.charAt(right))
	        {
	            count++;
	            left--;
	            right++;
	        }
	    }
	   
}
