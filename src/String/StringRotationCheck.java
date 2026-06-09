package String;

public class StringRotationCheck {
	

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "deabc";

        System.out.println(isRotation(s1, s2)); // Output: true

        s1 = "hello";
        s2 = "lohel";
        System.out.println(isRotation(s1, s2)); // Output: true

        s1 = "abc";
        s2 = "acb";
        System.out.println(isRotation(s1, s2)); // Output: false
    }

	private static boolean isRotation(String s1, String s2) {
		// TODO Auto-generated method stub
		
		if(s1.length() !=s2.length()) return false;
		
		
		String concatinate = s1+s1;
		
		
		
		return concatinate.contains(s2) ;
		
		
	}

}
