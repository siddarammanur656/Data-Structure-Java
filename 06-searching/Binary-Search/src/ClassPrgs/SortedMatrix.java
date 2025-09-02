package ClassPrgs;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(search(matrix, 3))); // Output: [2, 2]
    }

    // Binary search within a specific row and column range
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) return new int[]{row, mid};
            if (matrix[row][mid] < target) colStart = mid + 1;
            else colEnd = mid - 1;
        }
        return new int[]{-1, -1};
    }

    // Main search method for a sorted matrix
    static int[] search(int[][] matrix, int target) {
        if ( matrix.length == 0 || matrix[0].length == 0){
            return new int[]{-1, -1};
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols / 2;

        // Narrow down to two rows
        while (rowStart < rowEnd - 1) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][colMid] == target) return new int[]{mid, colMid};
            if (matrix[mid][colMid] < target) rowStart = mid;
            else rowEnd = mid;
        }

        // Check middle column of the two remaining rows
        if (matrix[rowStart][colMid] == target) return new int[]{rowStart, colMid};
        if (matrix[rowStart + 1][colMid] == target) return new int[]{rowStart + 1, colMid};

        // Search in 4 quadrants
        if (target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, rowStart, 0, colMid - 1, target); // Top-left
        } else if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][cols - 1]) {
            return binarySearch(matrix, rowStart, colMid + 1, cols - 1, target); // Top-right
        } else if (target <= matrix[rowStart + 1][colMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target); // Bottom-left
        } else {
            return binarySearch(matrix, rowStart + 1, colMid + 1, cols - 1, target); // Bottom-right
        }
    }
}
