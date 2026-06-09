package String;

public class ValidPalindrome1 {
	
	 public boolean isPalindrome(String s) {

		    //     s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

		    //     StringBuilder  reverse =  new StringBuilder(s).reverse();

		    //    return s.equals(reverse.toString());

		    int left  =0;
		    int right = s.length()-1;

		    while(left<right)
		    {
		        while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
		        {
		             left++;
		        }
		        while(left<right && !Character.isLetterOrDigit(s.charAt(right)))
		        {
		             right--;
		        }
		        if(Character.toLowerCase(s.charAt(left)) !=Character.toLowerCase(s.charAt(right)))
		        {
		            return false;
		        }
		        left++;
		        right--;
		    }

		return true;

		    }


}
