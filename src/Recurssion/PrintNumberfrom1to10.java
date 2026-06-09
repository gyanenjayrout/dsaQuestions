package Recurssion;

public class PrintNumberfrom1to10 {
	public static void main(String[] args) {
		
		print(1);
		printt(5);
	}

	private static void print(int i) {
		// TODO Auto-generated method stub
		
		
		if(i>10)
		{
			return ;
		}
		
		System.out.println(i);
		print(i+1);
		
	}
	private static void printt(int n) {
		
		
		if(n<1) return;
		
		printt(n-1);
		
		System.out.println(n);
	}
}
