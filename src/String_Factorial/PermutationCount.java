package String_Factorial;

public class PermutationCount {
	public static void main(String[] args) {
        String s = "abc";
        int n = s.length();

        int result = factorial(n);
        String s2= "aaa";
        
       int count = CountAnagram (s2);
       
       
        System.out.println(result);
        System.out.println(count);
        
        //Count anagrams of ONE word using MOD = 1e9 + 7
        
        
    }

	private static int CountAnagram(String s) {
		// TODO Auto-generated method stub
		   int[] freq = new int[26];
	        for (char c : s.toCharArray()) {
	            freq[c - 'a']++;
	        }
	        int n= s.length();
	        int result= factorial(n);
	        
	        for(int f: freq)
	        {
	        	if(f>1)
	        	{
	        		result = result/factorial(f);
	        	}
	        }
	        

		return result;
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}
		return fact;
	}

}
/*“Because division is not allowed in modulo arithmetic.
So to divide by a number, we multiply by its modular inverse.
Since MOD is prime, we use Fermat’s Little Theorem and compute inverse as pow(x, MOD-2).”
 */
