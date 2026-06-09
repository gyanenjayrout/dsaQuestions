package String;

public class UniqCharacter {
	
	 public  static int firstUniqChar(String s) 
	 {
		for(int i =0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				return i;
			}
		}
		
		return -1;
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(firstUniqChar("leetcode")); // Output: 0
	        System.out.println(firstUniqChar("loveleetcode")); // Output: 2
	        System.out.println(firstUniqChar("aabbcc")); // Output: -1
	}
    
//	 
//	 public int firstUniqChar(String s) {
//
//	        int [] arr  = new int [26];
//
//	        for(char  ch : s.toCharArray())
//	        {
//	            arr[ch -'a']++;
//	        }
//
//	        for(int i = 0;i<s.length();i++)
//	        {
//	            if(arr[s.charAt(i)-'a']==1)
//	            {
//	                return i;
//	            }
//	        }
//
//	        return -1;
//	        
//	    }

}
