package set;

import java.util.*;

public class FindMissingAndRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int N = n * n;  // Total elements from 1 to N*N

        long expectedSum = (long) N * (N + 1) / 2;  // Sum from 1 to N^2
        long actualSum = 0;
        int duplicate = -1;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];

                // Identify the duplicate number
                if (set.contains(num)) {
                    duplicate = num;
                }
                set.add(num);

                actualSum += num;
            }
        }

        int missing = (int) (expectedSum - (actualSum - duplicate));

        return new int[]{duplicate, missing};
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3},
            {2, 2}
        };

        int[] result = findMissingAndRepeatedValues(grid);
        System.out.println("Duplicate: " + result[0] + ", Missing: " + result[1]);
    }
}

