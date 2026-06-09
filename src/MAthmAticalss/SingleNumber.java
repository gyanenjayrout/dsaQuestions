package MAthmAticalss;

public class SingleNumber {
	
	public static void main(String[] args) {
		

		       int []  nums = {4,1,2,1,2};

		       int number =0;
		       int xor =0;
		        for(int num:nums)
		        {
		          xor ^= num;
		        }

		      System.out.println(xor);
		        
		    
	}

}
