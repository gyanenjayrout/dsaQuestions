package BasicQuestion;

public class NmberMAnupulation {
	
	public static void main(String[] args) {
		
		int num1 = 124;
		
		int num2=0;
		
		int multplier = 1;
		
		while(num1>0)
		{
			
			int digit = num1%10;
			num2 = num2*10+digit;
			
			
			num1 = num1/10;
		}
		
		System.out.println(num2);
				
	}

}
