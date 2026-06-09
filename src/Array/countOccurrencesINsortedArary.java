package Array;

public class countOccurrencesINsortedArary {

    public int countOccurrences(int[] nums, int target) {
        int firstOccurrence = countFirstOccurrence(nums, target);
        int lastOccurrence = countLastOccurrence(nums, target);

        if (firstOccurrence == -1 || lastOccurrence == -1) {
            return 0;
        }

        return lastOccurrence - firstOccurrence + 1;
    }

    private int countFirstOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int firstIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                firstIndex = mid;
                high = mid - 1; // Continue searching on the left side
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return firstIndex;
    }

    private int countLastOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int lastIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                lastIndex = mid;
                low = mid + 1; // Continue searching on the right side
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return lastIndex;
    }

    public static void main(String[] args) {
        countOccurrencesINsortedArary sol = new countOccurrencesINsortedArary();
        int[] nums = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        System.out.println(sol.countOccurrences(nums, target)); // Output: 3
    }
}
