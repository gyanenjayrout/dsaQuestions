package Sorting;

import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 8};
        int n = arr.length;

        // Call the sort method
        sortArray(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }

    // Recursive method to sort the array using QuickSort
    private static void sortArray(int[] arr, int low, int high) {
        if (low < high) {
            // Find the partition index
            int pivot = partition(arr, low, high);

            // Recursively sort elements before and after the partition
            sortArray(arr, low, pivot - 1);
            sortArray(arr, pivot + 1, high);
        }
    }

    // Partition method to place pivot at the correct position
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low - 1;       // Index for smaller elements

        // Reorder elements based on pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in its correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // Return pivot index
    }
}
