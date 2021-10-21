package SEARCHING.BinarySearchQue;

public class FindPeakinMountain {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 1 };
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {                
                // you are in increasing part of the array                
                start = mid + 1;//because we know that mid+1 >mid
            } else{
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

}
