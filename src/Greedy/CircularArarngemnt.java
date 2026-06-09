package Greedy;
/*
 * 
 * Circular arrangement
Company A has recently hired N new employees. 
To welcome them, the company has procured N new laptops. 
The employees are invited to a circular meeting arrangement. They are to be assigned their laptops in the meeting. Each laptop has the following:
unique_id: uniquely identified by an ID

✅ Problem Summary:

Given N laptops with unique IDs and distinct RAM capacities, you have to check if you can arrange them in a circle such that:

    Each laptop has neighbors (left and right).

    Its RAM is strictly greater or strictly less than both neighbors — meaning it should be a local maximum or minimum.
    RAM[i] < RAM[i-1] && RAM[i] < RAM[i+1]   // local minimum
OR
    RAM[i] > RAM[i-1] && RAM[i] > RAM[i+1]   // local maximum


 */
import java.util.*;
public class CircularArarngemnt {

	public class CircularArrangement {

	    public static String solve(int N, int[][] laptops) {

	        // Special Cases
	        if (N == 1) return "YES";
	        if (N == 2) return laptops[0][1] != laptops[1][1] ? "YES" : "NO";

	        // Count RAM frequencies
	        HashMap<Integer, Integer> ramCounts = new HashMap<>();
	        for (int i = 0; i < N; i++) {
	            int ram = laptops[i][1];
	            ramCounts.put(ram, ramCounts.getOrDefault(ram, 0) + 1);
	        }

	        // Find max frequency
	        int maxFrequency = 0;
	        for (int freq : ramCounts.values()) {
	            maxFrequency = Math.max(maxFrequency, freq);
	        }

	        // Main logic
	        if (N % 2 == 0) {
	            return maxFrequency <= N / 2 ? "YES" : "NO";
	        } else {
	            return maxFrequency <= (N + 1) / 2 ? "YES" : "NO";
	        }
	    }
	/*
	 * If interviewer asks something tricky like this:

    "Can you find a valid arrangement where no two laptops with same RAM are adjacent?"

Your thinking should be:

    Count frequencies

    What’s the max frequency?

    Can we place all copies non-adjacently?

        YES → if maxFreq <= (N + 1) / 2

        NO → impossible
        
        
     if (N % 2 == 0) {
    return maxFrequency <= N / 2 ? "YES" : "NO";
} else {
    return maxFrequency <= (N + 1) / 2 ? "YES" : "NO";
}
	 */
		
		
	}
	   public static void main(String[] args) {
	        int[][] laptops1 = {{1, 4}, {2, 5}, {3, 6}};
	        int[][] laptops2 = {{1, 1}, {2, 1}, {3, 1}, {4, 2}};

	        System.out.println(CircularArrangement.solve(3, laptops1)); // YES
	        System.out.println(CircularArrangement.solve(4, laptops2)); // NO
	    }
	
}
