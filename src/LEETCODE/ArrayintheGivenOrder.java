package LEETCODE;

public class ArrayintheGivenOrder {
    public static void main(String arg[]) {
        int nums[] = { 0, 1, 2, 3, 4 };
        int index[] = { 0, 1, 2, 2, 1 };
        int target[] = createTargetArray(nums, index);
        for (int i : target) {
            System.out.print(i);
        }

    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            insert(ans, index[i], nums[i], n-1);
        }
        return ans;
    }

    static void insert(int[] nums, int index, int value, int size) {
        while (index < size) {
            nums[size] = nums[size - 1];
            size--;
        }
        nums[index] = value;
    }
}
