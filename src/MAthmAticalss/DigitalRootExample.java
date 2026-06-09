package MAthmAticalss;

public class DigitalRootExample {
	public static void main(String[] args) {
        String num = "124492614927173";

        int result = reduceToSingleDigit(num);

        System.out.println("Single Digit Result: " + result);
    }

	private static int reduceToSingleDigit(String num) {
		// TODO Auto-generated method stub
		
		while(num.length()>1)
		{
			int sum =0;
			
			for(char ch : num.toCharArray())
			{
				sum = sum+ ch-'0';
			}
			
			num =  String.valueOf(sum);
		}
		return Integer.parseInt(num);
	}
	
	private static int digitalRootRecursive(String num)
	{
		if(num.length() ==1) return Integer.parseInt(num);
		
		int sum =0;
		
		for(char ch : num.toCharArray())
		{
			sum = sum+ ch-'0';
		}
		
		
		return digitalRootRecursive(String.valueOf(sum));
	}
	
	public static int digitalRootMath(String num) {
		long n = Long.parseLong(num);
		
		if(n==0) return 0;
		
		return 1+ (int)((n-1)%9);
	}
	
	public static int digitalRootBig(String num) { //For very large numbers beyond long, use string approach:
	    int mod = 0;

	    for (char ch : num.toCharArray()) {
	        mod = (mod + (ch - '0')) % 9;
	    }

	    return mod == 0 ? 9 : mod;
	}
}
