package SEARCHING.BinarySearchQue;// package BinarySearchQue;

import java.util.*;

public class FirstandLastPosition {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 7, 8, 8, 10 };
        System.out.print(Arrays.toString(searchRange(arr, 7)));

    }

    public static int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };
        int start = search(arr, target, true);
        int end = search(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    static int search(int[] arr, int target, boolean findstart) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findstart) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return ans;
    }
}
