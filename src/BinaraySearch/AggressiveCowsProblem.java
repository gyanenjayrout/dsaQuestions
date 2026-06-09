package BinaraySearch;

import java.util.Arrays;
//When we test a distance D, EVERY pair of adjacent cows must be at least D apart , means more than >=D
public class AggressiveCowsProblem  {
	public static void main(String[] args) {
        int[] stalls = {0, 3, 4, 7, 9, 10}; 
        int cows = 4;

        int result = aggressiveCows(stalls, cows);

        System.out.println("Largest minimum distance between cows is: " + result);
    }

	private static int aggressiveCows(int[] stalls, int cows) {
		// TODO Auto-generated method stub
		
		Arrays.sort(stalls);

	    int n = stalls.length;
	    int min = 1;
	    int max = stalls[n - 1] - stalls[0];
	    /*
	     * In Aggressive Cows, we binary search on the distance. low = 1 and high = max(stall) - min(stall). 
	     * We try to maximize the minimum distance between cows using greedy placement and binary search.
	     * 
	     * A minimum distance of 0 means two cows can be in the same stall, 
	     * which violates the problem constraints — each cow must be in a separate stall.
	     */
	    
	    int ans = -1;
	   /* 
	    for (int distance = min; distance <= max; distance++) {
	        boolean place = isPossibleToPlace(stalls, distance, cows);
	        
	        if (place) {
	            ans = distance; // store the latest valid distance
	        }
	    }
	    */
	    while(min<=max)
	    {
	    	int distance = min+(max-min)/2;//mid
	    	
	        boolean place = isPossibleToPlace(stalls, distance, cows);
	        
	        if(place)
	        {
	        	ans = distance;
	        	min= distance+1;// try for bigger minimum distance
	        }
	        else
	        {
	        	max= distance-1;
	        }
	    	
	    	
	    }
	    return ans;
	}
	public static boolean isPossibleToPlace(int[] stalls, int distance, int cows) {
	    int countCows = 1; // first cow is placed
	    int lastCow = stalls[0];
	    
	    for (int i = 1; i < stalls.length; i++) {
	        if (stalls[i] - lastCow >= distance) {
	            countCows++;
	            lastCow = stalls[i];
	        }
	    }
	    
	    return countCows >= cows;
	}
}
/*“We always compare minimum distance between adjacent cows for each placement,
 *  because the smallest gap limits how far apart cows 
 * can be.
Then we choose the placement with the largest of these minimum distances — 
that’s why it’s called maximizing the minimum distance.



“We don’t manually check every combination. Instead, we binary search on distance:

Pick a candidate distance mid

Try to place all cows keeping at least mid distance

If possible → try bigger distance

If impossible → try smaller distance
This automatically finds the largest possible minimum distance.”
 * 
 */
