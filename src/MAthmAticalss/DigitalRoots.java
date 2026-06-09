package MAthmAticalss;
//Repeatedly add digits of a number until only one digit remains.
public class DigitalRoots {
 
	public int didgitalRootsss(int num)
	{
		
		while(num>=10) //“We run while n >= 10 because any number 10 or above has multiple digits and still needs reduction.”
		{//👉 Keep looping while number has 2 or more digits.
			int sum =0;
			
			while(num>0)
			{
				num = num%10;
				sum = sum+num;
				num= num/10;
			}
			
			num = sum;
		}
		
		return num;
	}
	
	public int didgitalRootssWithOTLOOP(int num)
	{
		if(num==0) return 0;
		
		return 1+(num-1)%9; //“Instead of repeatedly summing digits, use modulo 9 formula for constant time.”
	}
}
