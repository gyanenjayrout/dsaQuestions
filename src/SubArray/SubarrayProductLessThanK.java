package SubArray;

public class SubarrayProductLessThanK {
	
	
	public static void main(String[] args) {
		int [] nums = {10,5,2,6};
		int k = 100;
		
		 int res  = numSubarrayProductLessThanK(nums, k);
		 
		 System.out.println(res);
	}
/*
	private static int   numSubarrayProductLessThanK(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		int count  =0;
		for(int i=0;i<nums.length;i++)
		{
			int product =1;
			for(int j=i;j<nums.length;j++)
			{
				product  = product *nums[j];
				if(product >=k)
				{
					break;
				}
				
				count++;
				
				
			}
		}
		return count;
		
	}
	*/
	
	private static int   numSubarrayProductLessThanK(int[] nums, int k) {
		
		int start =0;
		
		int count   =0;
		
		int product  =1;
		
		for(int i=0;i<nums.length;i++)
		{
			 product = product * nums[i];
			 
			 while(start <= i && product >=k)
			 {
				 product /= nums[start];
				 start++;
			 }
			 
			 count  = count +i-start+1;
		}
		return count;
	}
	// {10,5,2,6};

}
