package SORTING.LEETCODE;// package LEETCODE;

import java.util.Arrays;

// https://leetcode.com/problems/set-mismatch/
public class FindErrorNums {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 3 };
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, correct, i);
            } else {
                i++;
            }
        }
        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1)
                return new int[] { nums[index], index + 1 };
        }
        return new int[] { -1, -1 };
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
