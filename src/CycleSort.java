

import java.util.Arrays;
public class CycleSort {
    public static void main(String[] args) {
        int nums[] = { 4, 5, 3, 2, 1, 9, 8, 7, 6 };
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void cycleSort( int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }    

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
