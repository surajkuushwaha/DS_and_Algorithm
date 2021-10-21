package SEARCHING.BinarySearchQue;

// package BinarySearchQue;
public class CeilOfaNumber {
    public static void main(String[] arg) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println("Ceil:" + ceil(arr, 1, true));
        System.out.println("Floor:" + ceil(arr, 1, false));

    }

    static int ceil(int[] arr, int target, boolean op) {
        if(op&&target >arr[arr.length-1]){
            return -1;
        }
        if(op == false&&target<arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else
                return arr[mid];
        }
        return op ? arr[start] : arr[end];
    }

}