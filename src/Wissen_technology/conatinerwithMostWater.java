package Wissen_technology;

public class conatinerwithMostWater {
	public static void main(String[] args) {
		 int [] height = {1,8,6,2,5,4,8,3,7};
		 
		 int maxArea = maxArea(height);
		 
		 System.out.println(maxArea);
	}

	private static int maxArea(int[] height) {
		// TODO Auto-generated method stub
		int maxarea =0;
		int start=0;
		int end =height.length-1;
		
		while(start<end)
		{
		    int ht = Math.min(height[start], height[end]);
		    int width = end-start;
		    
		    int are = width* ht;
		    
		    maxarea= Math.max(maxarea, are);
		    
		    if(start<end)
		    {
		    	start++;
		    }else
		    {
		    	end--;
		    }
		}
		return maxarea;
	}
}
