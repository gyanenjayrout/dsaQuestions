package Array;

public class LargestElemnt {
	public static void main(String[] args) {
		int arr[]  = {3,2,4,5};
		int res = findoutLargest(arr);
		
		System.out.println(res);
				
		
			
				
	}
	
	static int findoutLargest(int[]nums)
	{
		int largest =nums[0];
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>largest)
			{
				largest  =nums[i];
			}
		}
		
		return largest;
	}
		

}
