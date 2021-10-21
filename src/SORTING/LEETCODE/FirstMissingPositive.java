package SORTING.LEETCODE;// package LEETCODE;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 0 };
        System.out.println(firstMissingPositive(nums));
    }

    static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] < n && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < n; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }
        return n + 1;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
