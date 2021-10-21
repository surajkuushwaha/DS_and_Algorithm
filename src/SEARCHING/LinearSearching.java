package SEARCHING;

public class LinearSearching {
    public static void main(String arg[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 4;
        System.out.println("" + sort(arr, key));
        System.out.println("" + sortString("Suraj", 'S'));

    }

    static int sort(int[] nums, int key) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static int sortString(String str, char key) {
        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (key == str.charAt(i)) {
                return i;
            }
        }
        return -1;
    }
}