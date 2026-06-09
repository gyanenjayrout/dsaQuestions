package Wissen_technology;

import java.util.*;

public class SplitArray {
    public static void main(String[] args) {
        int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int splitSize = 3;

        List<int[]> result = splitArray(original, splitSize);

        // Print the result
        for (int[] chunk : result) {
            System.out.println(Arrays.toString(chunk));
        }
    }

    public static List<int[]> splitArray(int[] original, int size) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < original.length; i += size) {
            int end = Math.min(original.length, i + size);
            int[] chunk = Arrays.copyOfRange(original, i, end);
            result.add(chunk);
        }

        return result;
    }
}

