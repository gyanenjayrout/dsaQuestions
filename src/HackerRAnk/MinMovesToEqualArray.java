package HackerRAnk;

import java.util.*;

public class MinMovesToEqualArray {
    public static int minMovesToEqual(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];  // Find median
        int moves = 0;
        
        for (int num : nums) {
            moves += Math.abs(num - median);
        }
        
        return moves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // Read array size
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        
        System.out.println(minMovesToEqual(nums));
    }
}
/*
 * 
 * nation:

    The first line (4) represents the size of the array.

    The second line (1 10 2 9) represents the array elements.

Steps to Equalize the Array:

    Sort the array: [1, 2, 9, 10]

    Find the median:

        Since there are even elements, the median is the middle two numbers (2 and 9).

        We pick any of them, but 5 (average of 2 and 9) is the best choice.

    Calculate moves to make all elements 5:

        |1 - 5| = 4

        |2 - 5| = 3

        |9 - 5| = 4

        |10 - 5| = 5
 */
