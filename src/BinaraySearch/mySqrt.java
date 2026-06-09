package BinaraySearch;
//iven a non-negative integer x, return the square root of x rounded down to the nearest integer. 
//The returned integer should be non-negative as well.

/*
 * We know:

    We want to find the largest integer whose square is <= x

    That’s a classic binary search problem: find a value satisfying a condition.
 */
public class mySqrt {
	 public int mySqrt(int x) {

	        int start =0;
	        int end= x;
	        int ans =0;

	        if(x==0 || x==1)
	        {
	            return x;
	        }

/*
 * if (mid * mid == x)  → return mid   // perfect square
if (mid * mid < x)   → move right → start = mid + 1 (but store mid as potential ans)
if (mid * mid > x)   → move left → end = mid - 1
 */

	        while(start<=end)
	        {
	            int mid =start+(end-start)/2;

	           long square =(long)mid*mid;

	            if(square == x)
	            {
	                return mid;
	            }
	            
	            if(square<x)
	            {
	                ans  = mid;
	                start=mid+1;
	            }else{
	                end= mid-1;
	            }
	        }

	        return ans;
	        
}
}
/*
 * for (int i = 1; i <= x; i++) {
    if (i * i == x) return i;
    if (i * i > x) return i - 1;
}
 */
