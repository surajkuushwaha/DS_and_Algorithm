package SORTING.LEETCODE;// package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(arr).toString());
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> ans = new ArrayList<Integer>();
        int n = arr.length;
        int i = 0;
        while (i < n) {            
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            
        }
        for (int index = 0; index < n; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
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
