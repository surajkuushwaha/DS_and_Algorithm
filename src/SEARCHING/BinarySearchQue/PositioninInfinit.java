package SEARCHING.BinarySearchQue;

public class PositioninInfinit {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        System.out.print("" + search(arr, 170));

    }

    static int search(int[] arr, int target) {
        // first start with a size of 2
        int start = 0;
        int end = 1;
        while (arr[end] < target) {
        // then keep doubling it
        int temp = end + 1;
        end = end + (end - start +1) * 2;
        start = temp;
        // do not include fo infinite array
        if(end>arr.length-1){
            end = arr.length-1;
        }
        }
        
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;//// might be possible that (start + end) exceeds the range of int in
                                                //// java
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
