package SlididngWindow;

public class MinSizesubArray {
public static int minSubArrayLen(int target, int[] nums) {
        
        int start =0;
        int minlength = Integer.MAX_VALUE;
        int sum =0;
        for(int end =0;end<nums.length;end++)
        {
            sum = sum+ nums[end];

            while(sum>=target)
            {
                minlength = Math.min(minlength, end-start+1);
                sum = sum - nums[start];
                start++;
            } 
        
        }
        return minlength == Integer.MAX_VALUE ? 0: minlength;
    }

public static void main(String[] args) {
	int arr[] = {2,3,1,2,4,3};


	
	int num = 7;
	int minSubArrayLen = minSubArrayLen(num, arr);
	
	System.out.println(minSubArrayLen);
	
}
}