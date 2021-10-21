package SEARCHING;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {5,6,7,8},
            {7,8,9,10},
            {11,12,13,14}
        };
        System.out.print(Arrays.toString(search(arr, 14)));
    }

    // search in the row provided between the column provided
    static int[] binarySearch(int[][] matrix, int row, int colstart, int colend, int target) {
        while (colstart <= colend) {
            int mid = colstart + (colend - colstart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] > target) {
                colend = mid - 1;
            } else {
                colstart = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;// be cautaious matrix may be empty
        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }
        // run the loop till 2 rows are remaining
        int rstart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while (rstart < (rEnd - 1)) {// while this is true it will have more then 2 rows
            int mid = rstart + (rEnd - rstart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[] { mid, cMid };
            }
            if (matrix[mid][cMid] < target) {
                rstart = mid;
            } else {
                rEnd = mid;
            }
        }
        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rstart][cMid] == target) {
            return new int[] { rstart, cMid };
        }
        if (matrix[rstart + 1][cMid] == target) {
            return new int[] { rstart + 1, cMid };
        }
        // search in first half
        if (target <= matrix[rstart][cMid - 1]) {
            return binarySearch(matrix, rstart, 0, cMid - 1, target);
        }
        // search in second half
        if (target >= matrix[rstart][cMid + 1] && target <= matrix[rstart][cols - 1]) {
            return binarySearch(matrix, rstart, cMid + 1, cols - 1, target);
        }
        // search in third half
        if (target <= matrix[rstart + 1][cMid - 1]) {
            return binarySearch(matrix, rstart + 1, 0, cMid - 1, target);
        } else {
            return binarySearch(matrix, rstart + 1, cMid + 1, cols - 1, target);
        }

    }
}
