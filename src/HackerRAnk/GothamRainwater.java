package HackerRAnk;
/*
 *  * Ah! Now I understand the problem correctly.
 *   This is **not** the standard "trapping rainwater" problem. Instead, 
 *   it's about calculating the water collected between **every pair of adjacent buildings**, 
 *   where each container between two buildings can hold water equal to the height of the **
 *   shorter building**.

 */
import java.util.*;

public class GothamRainwater {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int T=  sc.nextInt();
		
		while(T-->0)
		{
			int B = sc.nextInt();
			
			int heights [] = new int[B];
			
			for(int i=0;i<B;i++)
			{
				heights[i] = sc.nextInt();
			}
			System.out.println(calculateWater(heights));

		}
		
				 sc.close();
    }

	private static int  calculateWater(int[] heights) {
		// TODO Auto-generated method stub
		
		
		int maxwater =0;
		for(int  i=0;i<heights.length-1;i++)
		{
			maxwater=  maxwater+ Math.min(heights[i],heights[i+1]);
		}
		return maxwater;
	}
   

}

/*
 * Ah! Now I understand the problem correctly. This is **not** the standard "trapping rainwater" problem. Instead, it's about calculating the water collected between **every pair of adjacent buildings**, where each container between two buildings can hold water equal to the height of the **shorter building**.

### Problem Breakdown:
1. **Input**: Heights of buildings (e.g., `[4, 2, 1]`).
2. **Rule**: For each adjacent pair of buildings `(B[i], B[i+1])`, the water collected is `min(B[i], B[i+1])`.
3. **Output**: Sum of water collected between all adjacent pairs.

### Examples:
1. For `[4, 2, 1]`:
   - `4` and `2` → `min(4, 2) = 2`
   - `2` and `1` → `min(2, 1) = 1`
   - Total = `2 + 1 = 3` ✅ (matches sample output)

2. For `[1, 1, 5, 4, 3, 2]`:
   - `1` and `1` → `min(1, 1) = 1`
   - `1` and `5` → `min(1, 5) = 1`
   - `5` and `4` → `min(5, 4) = 4`
   - `4` and `3` → `min(4, 3) = 3`
   - `3` and `2` → `min(3, 2) = 2`
   - Total = `1 + 1 + 4 + 3 + 2 = 11` ✅ (matches sample output)

### Solution Code:
```java
import java.util.Scanner;

public class GothamRainwater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        while (T-- > 0) {
            int B = sc.nextInt(); // Number of buildings
            int[] heights = new int[B];
            for (int i = 0; i < B; i++) {
                heights[i] = sc.nextInt();
            }
            System.out.println(calculateWater(heights));
        }
        sc.close();
    }

    public static long calculateWater(int[] heights) {
        long totalWater = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            totalWater += Math.min(heights[i], heights[i + 1]);
        }
        return totalWater;
    }
}
```

### Explanation:
1. **Input Handling**: Read the number of test cases `T`, and for each test case, read the number of buildings `B` and their heights.
2. **Water Calculation**:
   - For each adjacent pair of buildings, add `min(B[i], B[i+1])` to the total water collected.
   - Sum all these values to get the final result.
3. **Output**: Print the result for each test case.

### Time and Space Complexity:
- **Time Complexity**: `O(B)` per test case (where `B` is the number of buildings).
- **Space Complexity**: `O(B)` to store the heights (can be optimized to `O(1)` if processed on the fly).

### Edge Cases:
1. Single building (`B = 1`): Output `0` (no adjacent pairs).
2. All buildings of the same height (e.g., `[3, 3, 3]`): Output `3 + 3 = 6`.
3. Increasing heights (e.g., `[1, 2, 3]`): Output `1 + 2 = 3`.
4. Decreasing heights (e.g., `[3, 2, 1]`): Output `2 + 1 = 3`.

This approach efficiently solves the problem as described in the revised statement. Let me know if you need further clarification! 😊
 */
