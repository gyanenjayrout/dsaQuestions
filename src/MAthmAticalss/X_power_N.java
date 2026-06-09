package MAthmAticalss;

public class X_power_N {
	
	public static double power(int x, int n)
	{
		if(x==0)
		{
			return 0;
		}
		
       if(n==0)
       {
    	   return 1;
       }
       
//       double res = power(x, n-1);
//       
//       return x * res;
       
       if(n%2==0)
       {
    	   return power(x,n/2)*power(x,n/2);
       }
       else
       {
    	   return power(x,n/2)*power(x, n/2)* x;
       }
       
       
	}
	
	public static void main(String[] args) {
		int x = 5;
		int n = 3;
		
		double power = power(x, n);
		
		System.out.println(power);
	}

}
