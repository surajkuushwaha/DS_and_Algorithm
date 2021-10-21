package SEARCHING;

// package Searching;
class BinarySearch {
    public static void main(String arg[]) {
        int arr[] = { 1,2,3,4,5};
        System.out.print("search:" + binarySearch(arr, 2));

    }

    static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] < arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] < key) {
                    start = mid + 1;
                } else if (arr[mid] > key) {
                    end = mid - 1;
                } else
                    return mid;
            }
        }else{
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] < key) {
                    end = mid - 1;
                } else if (arr[mid] > key) {
                    start = mid + 1;
                } else                    
                    return mid;

            }
        }
        return -1;
    }    
}