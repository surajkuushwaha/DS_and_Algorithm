package LEETCODE;

public class Temp {
    public static void main(String arg[]) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        insert(arr, 0, 45, 4);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void insert(int[] nums, int index, int value, int size) {
        while (index < size) {
            nums[size] = nums[size - 1];
            size--;
        }
        nums[index] = value;
    }
}
