package Wissen_technology;


import java.util.*;

public class NextPalindrome_Array {

    public static void generateNextPalindrome(int[] num, int n) {
        if (isAll9(num, n)) {
            // Case when all digits are 9
            System.out.print("1");
            for (int i = 1; i < n; i++) System.out.print("0");
            System.out.print("1\n");
            return;
        }

        int[] result = num.clone();

        int mid = n / 2;
        int i = mid - 1;
        int j = (n % 2 == 0) ? mid : mid + 1;

        // Step 1: Mirror left to right
        while (i >= 0) {
            result[j] = result[i];
            i--;
            j++;
        }

        // Step 2: If mirrored number > original → done
        if (compare(result, num, n) > 0) {
            printArray(result);
            return;
        }

        // Step 3: Else, increment the middle and propagate the carry
        i = mid - 1;
        int carry = 1;

        if (n % 2 == 1) {
            result[mid] += carry;
            carry = result[mid] / 10;
            result[mid] %= 10;
            j = mid + 1;
        } else {
            j = mid;
        }

        // Propagate carry and mirror
        while (i >= 0) {
            result[i] += carry;
            carry = result[i] / 10;
            result[i] %= 10;
            result[j++] = result[i--];
        }

        printArray(result);
    }

    private static boolean isAll9(int[] num, int n) {
        for (int digit : num) {
            if (digit != 9) return false;
        }
        return true;
    }

    private static int compare(int[] a, int[] b, int n) {
        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) return a[i] - b[i];
        }
        return 0;
    }

    private static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] num = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2};
        int n = num.length;
        generateNextPalindrome(num, n);
    }
}
