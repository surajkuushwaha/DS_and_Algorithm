package SEARCHING.BinarySearchQue;

public class SearchInMontain {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 3, 1 };
        System.out.println("" + search(arr, 2));

    }

    public static int search(int arr[], int target) {
        int peak = peakIndexInMountainArray(arr);
        System.out.println("|" + peak);
        int first = binarySearch(arr, target, 0, peak);
        System.out.println("|" + first);
        if (first != -1) {
            return first;
        } else {
            return binarySearch(arr, target, peak + 1, arr.length - 1);
        }
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // you are in increasing part of the array
                start = mid + 1;// because we know that mid+1 >mid
            } else {
                // you are in dec part of the array
                // this may be ans ,but look at left
                // this is why end !=mid-1
                end = mid;
            }
        }
        // at last end==start and pointing largest alement in the array
        // start and end alwayas trying to find the max element in the array

        return start;

    }

    static int binarySearch(int[] arr, int key, int start, int end) {
        // System.out.println("|" + a[0]+"|"+end);
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
        } else {
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
