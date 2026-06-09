package MAthmAticalss;

public class PoerOF_FOUR {
	
	/*
	 * (n & 0xAAAAAAAA) == 0

    This ensures that the 1 bit is in an even position.
    0xAAAAAAAA in hexadecimal represents a 32-bit binary number where all odd positions are set to 1:
    
    Binary: 10101010101010101010101010101010

    
        The odd bit positions are 1, 3, 5, 7, etc. (0-based indexing).
    The even bit positions are 0, 2, 4, 6, etc.

If (n & 0xAAAAAAAA) is 0, it means the 1 bit of n is not in any odd position, meaning it is in an even position (required for powers of 4).
	 */
	
	public static boolean isPowerOfFour(int n) {
		
//		return n>0 && (n &(n-1))==0 && (n & 0xAAAAAAAA)==0;
		
//		if(n<0)
//		{
//			return false;
//		}
//		
//		if(n==1)
//
//		{
//			return true;
//		}
//		
//		while(n%4==0)
//		{
//		    return isPowerOfFour(n/4);
//		}
//		
//		return false;
		
if (n <= 0) return false; // Only positive numbers are valid
        
        while (n % 4 == 0) { // Keep dividing by 4 as long as possible
            n /= 4;
        }
        return n == 1; // If the final value is 1, it's a power of 4
		
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(isPowerOfFour(16));
	}
	

}
