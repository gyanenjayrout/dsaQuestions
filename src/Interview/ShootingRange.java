package Interview;
import java.util.*;
public class ShootingRange {
	
	public static int calculateScore(int n) {
        // Sum of all numbers from 1 to N
        int totalSum = (n * (n + 1)) / 2;
        
        

        // Find the largest power of 2 less than or equal to N
        int powerOfTwo = 1;
        while (powerOfTwo <= n) {
            powerOfTwo <<= 1; // Multiply by 2
        }
        powerOfTwo >>= 1; // Get the last valid power of 2
            
            

        // Score is the sum of all numbers minus the last remaining target
        return totalSum - powerOfTwo;
    }

    public static void main(String[] args) {
    	int[] testCases = {5, 6, 7, 8, 9};

        for (int n : testCases) {
            System.out.println("N = " + n + " -> Total Score = " + calculateScore(n));
        }
    }
}

/*
 * 
 * 1. Understanding Left Shift (<<)

The left shift (<<) operator in Java shifts the binary representation of a number to the left by the specified number of positions.

    Left shift by 1 (x << 1) is the same as multiplying by 2.
    Example:
        2 << 1 → 4
        4 << 1 → 8
        8 << 1 → 16
        
        2. Code Execution Step-by-Step
        int powerOfTwo = 1;
while (powerOfTwo <= n) {
    powerOfTwo <<= 1; // Multiply by 2 using left shift
}
powerOfTwo >>= 1; // Go back to the last valid power of 2



📌 Step-by-step execution for n = 9

    Initialization: powerOfTwo = 1
    Loop runs until powerOfTwo > n (9)
        1 << 1 → 2
        2 << 1 → 4
        4 << 1 → 8
        8 << 1 → 16 (Exceeds 9, so stop here)
    At this point, powerOfTwo = 16, which is greater than n.
    Right shift (>>= 1) moves back to the last valid power of 2:
        16 >> 1 → 8
        
        
        ✅ Result: Largest power of 2 ≤ 9 is 8
3. General Behavior for Different n Values
n	Powers of 2 Computed	                  Stops at powerOfTwo	         After >>= 1	     Largest Power of 2 ≤ n
5	1 → 2 → 4 → 8	                                      8	                     4	                4
6	1 → 2 → 4 → 8                                        8	                 	4	             4
7	1 → 2 → 4 → 8	                                      8	                       4	            4
8	1 → 2 → 4 → 8 → 16	                                16                       8                8
9	1 → 2 → 4 → 8 → 16	                                  16	                 8	               8


4. Why is the Right Shift (>>= 1) Needed?

    Without it, powerOfTwo exceeds n, which is incorrect.
    The right shift divides by 2, bringing us back to the last valid power of 2.

5. Time Complexity

    This loop runs in O(log N) time since powers of 2 grow exponentially (e.g., 1, 2, 4, 8, 16, 32, ...).
    At most, it executes log₂(N) steps, which is very efficient.

6. Summary

✅ Purpose: Finds the largest power of 2 ≤ n
✅ How it works:

    Keep doubling (<<= 1) until exceeding n.
    Shift back (>>= 1) to return to the last valid power of 2. ✅ Example:

    For n = 9, powers generated: 1, 2, 4, 8, 16
    Since 16 > 9, we shift back: 8 is the answer
 */




