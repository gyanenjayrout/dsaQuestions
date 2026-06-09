package MAthmAticalss;

public class PowerOF_two {
	public  static boolean isPowerOfTwo(int n) {
//	    if (n <= 0) return false; // Negative numbers and 0 are not powers of 2
//	    while (n % 2 == 0) {
//	        n /= 2;
//	    }
//	    return n == 1;
		
		if(n<=0)
		{return false;
		
		}
		
		if(n==1)
		{
			return true;
		}
		
		while(n%2==0)
		{
			return isPowerOfTwo(n/2);
		}
		return false;
	}
	
	/*
	 * Start with n=8n=8.
Divide 8/2=4 , 4/2=2  , 2/2=1.
If you reach 1, the number is a power of 2.
	 */
	
	/*
	 * 
	 * n=8 (binary: 1000).
      n−1=7 (binary: 0111).
Bitwise AND: n&(n−1)=1000&0111=0000
If the result is 00, nn is a power of 2.
	 */
	
//	
	public static  boolean isPowerOfTwoo(int n) {
		return n>0 && (n & (n-1))==0;
	}
	
	
	
	public static void main(String[] args) {
		
		
		int n =8;
		
		System.out.println(isPowerOfTwoo(n));
		System.out.println(isPowerOfTwo(n));
		
		
		
	}
	
	

}
