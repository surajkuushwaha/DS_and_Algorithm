package SEARCHING.BinarySearchQue;

public class SearchinRotatedArray {
    public static void main(String[] args) {
        int arr[] = { 5,1,3};
        System.out.println("" + search(arr, 5));

    }    

    static int search(int arr[], int target) {
        int pivot = pivit(arr);
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (arr[0] <= target) {
            return binarySearch(arr, target, 0, pivot - 1);
        } 
        
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    // this will not work in dublicate values
    static int pivit(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // four cases
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                System.out.println("*");
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid - 1;
            }
            
        }
        return -1;
    }
    
    static int binarySearch(int arr[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else
                return mid;
        }
        return -1;
    }
}
