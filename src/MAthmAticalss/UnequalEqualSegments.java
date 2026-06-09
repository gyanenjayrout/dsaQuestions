package MAthmAticalss;
/*
 * An unequal equal is a data encryption technique in which one divides the segment of length N into 4 
 * segments of integer length such that 2 segments should be of equal length and other 2 segments are also of equal length, 
 * Also all 4 segments should not be of the same size. you are given 
 * integer N.Count the number of ways to form Unequal equals. N represents length of the segments write the optimized code in Java
 * Understanding the Problem

We need to divide a given segment of length N into four integer-length segments with the following conditions:

    Two segments should be of equal length.
    The other two segments should also be of equal length.
    All four segments should not be of the same size.

Example Cases:

    If N = 8, one possible way to split:
        (1,1,3,3) ✅ (Two pairs of equal-length segments, but different from each other)
        (2,2,4,4) ✅
        (1,1,2,2) ❌ (All same)

Breakdown of Solution Approach

    Since we need two equal pairs, we define a and b as the sizes of these two pairs.
    The equation must satisfy:
    2a+2b=N
    2a+2b=N which simplifies to:
    a+b=N2
    a+b=2N​
    Valid Constraints:
        N should be even (since a + b should be an integer).
        a ≠ b (since all four segments should not be the same).
        We count the valid (a, b) pairs where a ≠ b.
 */
public class UnequalEqualSegments {
	public static void main(String[] args) {
        System.out.println(countWays(8));  // Output: 2
        System.out.println(countWays(10)); // Output: 4
        System.out.println(countWays(12)); // Output: 4
        System.out.println(countWays(7));  // Output: 0
    }

	private static int countWays(int N) {
		// TODO Auto-generated method stub
		
		
		
		// N must be even, otherwise division into equal pairs is impossible
        if (N % 2 != 0) return 0;
        
        int half = N / 2;
        int count = 0;
        
        // Iterate over possible values of 'a'
        for (int a = 1; a < half; a++) {
            int b = half - a;
            if (a != b) { // Ensure segments are not all the same
                count++;
            }
        }
        return count;
		
		
		
	}

}

/*
 * 
 * ✅ Case 1: N = 8

We need to find valid (a, b) pairs where:
a+b=4
a+b=4

Possible pairs:

    (1, 3)
    (2, 2) ❌ (Invalid because the pairs are the same)
    (3, 1)

✅ Valid pairs: (1,3), (3,1) → Total = 2 ways

Output should be: 2 (NOT 3)
✅ Case 2: N = 10

We need:
a+b=5
a+b=5

Possible pairs:

    (1, 4)
    (2, 3)
    (3, 2)
    (4, 1)

✅ Valid pairs: All are valid as no two pairs are the same → Total = 4 ways

Output: 4 (Correct)
✅ Case 3: N = 12

We need:
a+b=6
a+b=6

Possible pairs:

    (1, 5)
    (2, 4)
    (3, 3) ❌ (Invalid)
    (4, 2)
    (5, 1)

✅ Valid pairs: (1,5), (2,4), (4,2), (5,1) → Total = 4 ways

Output should be: 4 (NOT 5)
✅ Case 4: N = 7

Since N is odd, no valid pairs can be formed.

✅ Output: 0 (Correct)
*/
