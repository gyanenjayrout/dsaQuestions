package Recurssion;

public class PowerOF_X_N_Exponential_Binary {
	
public static void main(String[] args) {
		
		double x =2.000;
		int n =3;
		
		double result = power(x, n);
		
		System.out.println(result);
	}

private static double power(double x, int n) {
	// TODO Auto-generated method stub
	
	long binaryFrom = n;
	
	if(n<0)
	{
		x =1/x;
		binaryFrom = -binaryFrom;
		
	}
	
	double ans =1.0;
	
	while(binaryFrom>0)
	{
		if(binaryFrom%2==1)
		{
			ans = ans * x;
		}
		x =x*x;
		
		binaryFrom= binaryFrom/2;
	}
	return ans;
}


}
