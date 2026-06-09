package Interview;

import java.util.*;
import java.util.Comparator;

class circularArrangemnt {
    /**
     * Determines if a valid circular arrangement of laptops exists based on RAM capacity.
     *
     * @param N       The number of laptops.
     * @param laptops A 2D array representing the laptops, where each row contains the unique ID and RAM capacity.
     * @return "YES" if a valid arrangement exists, "NO" otherwise.
     */
    public String solve(int N, int[][] laptops) {
        if (N <= 2) {
            return "YES";
        }

        // Sort laptops by RAM capacity
        Arrays.sort(laptops, Comparator.comparingInt(a -> a[1]));

        // Check if a valid arrangement is possible
        for (int i = 0; i < 2; ++i) { //Try both arrangements: smallest first and largest first
            boolean possible = true;
            int[] arrangement = new int[N];
            int left = 0;
            int right = N - 1;

            for (int j = 0; j < N; ++j) {
                if (j % 2 == 0) {
                    arrangement[j] = laptops[i == 0 ? left++ : right--][1];
                } else {
                    arrangement[j] = laptops[i == 0 ? right-- : left++][1];
                }
            }

            for (int j = 0; j < N; ++j) {
                int prev = arrangement[(j - 1 + N) % N];
                int curr = arrangement[j];
                int next = arrangement[(j + 1) % N];

                if (!((curr > prev && curr > next) || (curr < prev && curr < next))) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[][] laptops = new int[N][2];

            for (int i = 0; i < N; i++) {
                laptops[i][0] = scanner.nextInt();
                laptops[i][1] = scanner.nextInt();
            }

            circularArrangemnt solution = new circularArrangemnt();
            System.out.println(solution.solve(N, laptops));
        }
        scanner.close();
    }
}