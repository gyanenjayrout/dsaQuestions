package Recurssion;

public class print_ONE_TO_HUNDRED {
	
	public static void main(String[] args) {
		int n= 1;
		
		print100(n);
	}

	private static void print100(int n) {
		// TODO Auto-generated method stub
		if(n==100)
		{
			System.out.println(100);
			
			return;
		}
		
		System.out.println(n);
		print100(n+1);
	}

}
