package String;

public class ValidPalindrome2 {
public static void main(String[] args) {
	String s = "racecare";
     
	 
	 
	 System.out.println(validPalindrome(s));
}

private static boolean validPalindrome(String s) {
	
	int left =0;
	int right = s.length()-1;
	
	while(left<right)
	{
		if(s.charAt(left)!=s.charAt(right))
		{
			return isPallindrome(s, left+1,right) ||isPallindrome(s , left, right-1);
		}
		
		left++;
		right--;
	}
	
	// TODO Auto-generated method stub
	return true;
}

private static boolean isPallindrome(String s, int left, int right) {
	// TODO Auto-generated method stub
	
	while(left<right) {
		if(s.charAt(right)!=s.charAt(left))
		{
			return false;
		}
		
		left++;
		right--;
	}
	return true;
}

}
