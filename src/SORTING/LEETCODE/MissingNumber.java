package SORTING.LEETCODE;

// https://leetcode.com/problems/missing-number/
// Amazon quesction
class MissingNumber {
    public static void main(String[] args) {
        int arr[] = { 3, 0, 1 };
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int arr[]) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correct = arr[i];
            if (arr[i] < n && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < n; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        return n;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
