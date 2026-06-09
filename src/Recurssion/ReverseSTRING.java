package Recurssion;

public class ReverseSTRING {
	
	public static void main(String[] args) {
		String s="ryfykgkj";
//		reversetring(s);
		System.out.println("------------");
		reversetringg(s, s.length()-1);
	}

	private static void reversetringg(String s, int idx) {
		// TODO Auto-generated method stub
		
		if (idx ==0)
		{
			System.out.println(s.charAt(idx));
			return;
		}
		
	  System.out.println(s.charAt(idx));
	  reversetringg(s, idx-1);
		
	}

	private static void reversetring(String s) {
		// TODO Auto-generated method stub
		
		if(s.isEmpty()) return;
		
		System.out.println(s.charAt(s.length()-1));
		
		reversetring(s.substring(0, s.length()-1));
	}
	
	

}
