package SORTING.LEETCODE;

// package LEETCODE;
// https://leetcode.com/problems/find-the-duplicate-number/submissions/
// Microsoft
// Amazon

public class FindDuplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 2, 2 };
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                    
                }
            } else {
                i++;
            }
        }
        return -1;

        // for (int index = 0; index < n; index++) {
        // if (arr[index] != index + 1) {
        // return arr[index];
        // }
        // }
        // return n-1;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
