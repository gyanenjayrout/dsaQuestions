package Recurssion;
//x ^n  = x* x^(n-1)
public class XpowN_On_height {

	public static void main(String[] args) {
		
		int x =2;
		int n =3;
		
		int result = power(x, n);
		
		System.out.println(result);
	}

	private static int power(int x, int n) {
	
		if(n==0) return 1;
		
		if(x ==0) return 0;
		
		int power = power(x, n-1);
		
		int result = x * power;
		
		return result;
		
	}
}
