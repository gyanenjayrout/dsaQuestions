package TwoPointerApproach;

public class ContainerWithMostWater {
	
	 
	 public static void main(String[] args) {
		 int [] height = {1,8,6,2,5,4,8,3,7};
		 
		 int maxArea = maxArea(height);
		 
		 System.out.println(maxArea);
	}
	/* 
	 public  static int maxArea(int[] height) {
		 
		 
		 int maxwarter =0;
		 for(int i=0;i<height.length;i++)
		 {
			 for(int j=i+1;j<height.length;j++)
			 {
				 int minht  = Math.min(height[i], height[j]);
				 
				 int width = j-i;
				 int area = width * minht;
				 
				 maxwarter =  Math.max(maxwarter, area);
			 }
		 }
		 
		 return maxwarter;
	        
	    }
	
	*/
	 
	 public  static int maxArea(int[] height) {
		 
		 int start=0;
		 int maxwarter =0;
		 int end =height.length-1;
		 
//		while(start<end)
//		{
//			int wp = end-start;
//			
//			int ht =  Math.min(height[start], height[end]);
//			
//			int ares = wp * ht;
//			
//			 maxwarter  =  Math.max(maxwarter, ares);
//			 
//			 if (height[start] < height[end]) {
//		            start++;
//		        } else {
//		            end--;
//		        }
//		}
		 
		 while(start<end)
		 {
			 int currentArea = Math.min(height[start], height[end])* (end-start);
			 maxwarter = Math.max(maxwarter, currentArea);
			 
			 if(height[start]<height[end]) start++;
			 else end--;
				 
		 }
		return maxwarter;
		 
	 }

}
