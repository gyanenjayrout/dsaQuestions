package TwoPointerApproach;
import java.util.*;
/*
 * 
 * We take the maximum heights on both sides to identify boundaries, and the minimum of those
 *  boundaries determines the water level.”
 *  
 *   Look left → what is the tallest building?

     Look right → what is the tallest building?

     Take the smaller one

     Subtract current height

     Add to total water
     
     
     if : The bar itself is as tall as the left boundary

Water cannot sit on top of a bar that is already touching the water level



For any bar, I imagine water falling on the structure.
Water will spread to all bars on the left and right, but it can be held only if there are taller bars on both sides.

The maximum level water can reach at that bar is decided by the shorter of the tallest bars on the left and right.
If water goes above that level, it will spill from the shorter side.

So, for each bar, I find:

the tallest bar on its left

the tallest bar on its right

Then the water stored on that bar is:
min(leftMax, rightMax) − height of the bar.

Only bars that are lower than both sides (valleys) can store water.
If a bar is equal to or taller than one side, no water is stored there.
 */
public class Trapping_RainWater {

    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       
//       int T = sc.nextInt();  // Number of test cases
//       while (T-- > 0) {
//           int B = sc.nextInt();  // Number of buildings
//           int[] heights = new int[B];
//           
//           for (int i = 0; i < B; i++) {
//               heights[i] = sc.nextInt();
//           }
//           
//           System.out.println(trapRainWater(heights));
//       }
//       sc.close();
    	
    	int [] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
    	
    	long height = trapRainWater(arr);
    	long height2 =trapRainWater2(arr);
    	
    	System.out.println(height);
    	System.out.println(height2);
   }
    /*
     * Instead of precomputing left and right arrays, I use two pointers from both ends.
I maintain the maximum height seen so far from the left and from the right.

At every step, I move the pointer with the smaller height, because the water level is always limited by the shorter boundary.
The taller side can always hold more water later.

I use two pointers and always process the smaller side, because the trapped water is limited by the shorter boundary, 
which lets me compute water in one pass using constant space.
     */

    public static int trapRainWater2(int[] height) {
        int left = 0, right = height.length - 1;
        int leftmax = 0, rightmax = 0;
        int maxwater = 0;

        while (left < right) {// 
//        	if(height[left] < height[right]) or if(height[left] <= height[right])
        	
            
            if (height[left] < height[right]) {
                leftmax = Math.max(leftmax, height[left]);
                maxwater += leftmax - height[left]; //“I update max first, then calculate water. If current is max, added water becomes 0 automatically.”
                left++;
            } else {
                rightmax = Math.max(rightmax, height[right]);
                maxwater += rightmax - height[right];
                right--;
            }
        
            
        }
        return maxwater;
    }

	  /*
	   * First, I compare the left and right bars and choose the smaller one, because the water level is always
	   *  limited by the shorter boundary.

Once the smaller side is fixed, the maximum on the opposite side doesn’t matter anymore — it is guaranteed to be higher or equal.

Then I compare the chosen bar with its corresponding maximum (leftMax or rightMax) to decide how much water can be stored at that position.

After calculating water, I move only that pointer inward and repeat the process. 


In two-pointer approach, we first compare left and right heights. The smaller side becomes the limiting boundary, 
so we process that side and use its max boundary (leftMax or rightMax) to calculate trapped water.
	   */
	       
	
public static long trapRainWater(int[] heights) {
       int [] leftbar = new int[heights.length];
      int maxwater =0;
       int []rightbar = new int[heights.length];
       int n = heights.length;
       leftbar[0] = heights[0];
       
       rightbar[n-1] = heights[n-1];
       
       for(int i=1;i<heights.length;i++)
       {
    	   leftbar[i] = Math.max(leftbar[i-1], heights[i]);
       }
       
       for(int i=n-2;i>=0;i--)
       {
    	   rightbar[i] = Math.max(rightbar[i+1], heights[i]);
       }
       
       
       for(int i=0;i<heights.length;i++)
       {
    	   maxwater = maxwater+Math.min(leftbar[i], rightbar[i])-heights[i];
       }
       return maxwater;
   }
}
/*2
3
4 2 1
6
1 1 5 4 3 2
 */
