package SORTING;

import java.util.Arrays;

class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 5,4,3,2,1};
        insersionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    

    static void insersionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }

        }
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxindex = getMaxIndex(arr, 0, last);
            swap(arr, maxindex, last);

        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}