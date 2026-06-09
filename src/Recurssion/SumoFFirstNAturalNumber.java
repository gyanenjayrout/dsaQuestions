package Recurssion;

public class SumoFFirstNAturalNumber {
	
	public static void main(String[] args) {
		
		int n =5;
		
		
		sumofFirst5(1, 5, 0);
//		int sum = n*(n+1)/2;
//		
//		System.out.println(sum);
		
	}

	private static void sumofFirst5(int i, int n, int sum) {
		// TODO Auto-generated method stub
		if(i==n)
		{
			sum  =sum+i;
			
			System.out.println(sum);
			return;
		}
		
		
		sum = sum+i;
		
		sumofFirst5(i+1, n,  sum);
		System.out.println("sum: "+  sum +" ");
		System.out.print(  "i value :  "+  i);
		
	}

}
