package BinaraySearch;


class SERACH_IN_2D_I {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;       // number of rows
        int n = matrix[0].length;    // number of columns

        int startrow = 0;
        int endrow = m - 1;

        while (startrow <= endrow) {
            int midrow = startrow + (endrow - startrow) / 2;

            // ✅ Check if target lies in this row range
            if (target >= matrix[midrow][0] && target <= matrix[midrow][n - 1]) {
                return searchInSingleRow(matrix[midrow], target);
            } else if (target < matrix[midrow][0]) {
                endrow = midrow - 1;
            } else {
                startrow = midrow + 1;
            }
        }

        return false;
    }

    // 🔍 Simple binary search in a 1D array (one row)
    public boolean searchInSingleRow(int[] row, int target) {
        int start = 0;
        int end = row.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == row[mid]) {
                return true;
            } else if (target < row[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return false;
    }
}
