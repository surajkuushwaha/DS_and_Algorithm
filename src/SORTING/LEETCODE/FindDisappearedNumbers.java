package SORTING.LEETCODE;// package LEETCODE;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google
public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int nums[] = { 4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums).toString());
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            if ( arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int index = 0; index < n; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
