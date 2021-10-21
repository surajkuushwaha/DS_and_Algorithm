package LEETCODE;

public class SmallerThanCurrentNumber {
    public static void main(String arg[]) {
        int[] nums = { 36, 28, 40, 50, 89, 49, 85, 99, 22, 1, 49, 83, 44, 77, 100, 99, 78, 28, 29, 8, 78, 40, 49, 26,
                90, 37, 12, 55, 0, 44, 11, 52, 19, 14, 68, 93, 22, 96, 43, 18, 48, 55, 41, 69, 81, 89, 66, 35, 26, 24,
                20, 21, 68, 20, 18, 15, 56, 74, 66, 16, 55, 17, 42, 77, 93, 89, 87, 40, 76, 17, 2, 45, 99, 22, 28, 30,
                88, 63, 75, 62, 4, 83, 11, 17, 68, 60, 72, 18, 26, 46, 90, 17, 35, 94, 44, 8, 49, 60, 3, 67, 59, 25, 92,
                30, 26, 88, 0, 92, 89, 38, 5, 34, 66, 24, 9, 13, 98, 14, 51, 42, 13, 57, 91, 73, 66, 90, 83, 61, 85, 35,
                18, 55, 47, 82, 44, 96, 49, 52, 55, 47, 70, 26, 25, 8, 18, 30, 30, 2, 30, 85, 50, 58, 100, 78, 56, 72,
                12, 6, 22, 67, 0, 5, 55, 100, 35, 53, 16, 30, 88, 98, 84, 47, 53, 99, 43, 74, 95, 6, 64, 58, 16, 88, 66,
                46, 74, 7, 44, 15, 31, 81, 81, 15, 55, 19, 2, 46, 16, 19, 36, 3, 60, 81, 3, 61, 8, 96, 75, 55, 11, 60,
                69, 77, 64, 12, 16, 68, 86, 90, 50, 82, 77, 69, 52, 30, 66, 48, 61, 93, 40, 56, 14, 8, 26, 75, 78, 89,
                47, 13, 12, 45, 13, 25, 14, 88, 83, 75, 11, 0, 65, 55, 30, 11, 39, 62, 78, 7, 73, 54, 71, 38, 50, 80, 5,
                85, 76, 3, 35, 79, 61, 56, 28, 34, 41, 99, 61, 56, 68, 7, 34, 65, 22, 95, 90, 56, 58, 37, 74, 75, 23,
                41, 65, 84, 50, 97, 85, 88, 52, 87, 71, 76, 50, 61, 96, 80, 28, 39, 2, 8, 18, 63, 14, 46, 33, 39, 69,
                38, 17, 13, 64, 17, 58, 4, 57, 60, 93, 72, 41, 69, 47, 16, 91, 1, 68, 25, 98, 34, 79, 8, 100, 59, 36, 1,
                82, 34, 92, 64, 88, 2, 72, 51, 14, 12, 87, 41, 77, 79, 81, 89, 88, 73, 57, 11, 78, 63, 67, 43, 75, 86,
                5, 24, 21, 7, 78, 14, 5, 15, 71, 67, 39, 96, 100, 25, 20, 68, 19, 29, 27, 11, 64, 45, 88, 72, 55, 34,
                78, 17, 36, 73, 31, 8, 76, 33, 7, 2, 55, 78, 36, 60, 54, 55, 8, 23, 27, 98, 86, 4, 81, 96, 54, 53, 45,
                45, 65, 18, 22, 28, 29, 7, 46, 8, 57, 41, 27, 28, 32, 19, 88, 90, 66, 48, 13, 61, 87, 93, 100, 78, 0,
                60, 39, 33, 99, 89, 37, 26, 16, 88, 81, 48, 84, 4, 100, 98, 48, 58, 68, 3, 16, 29, 63, 82, 12, 37, 89,
                79, 55, 25, 66, 42, 12, 31, 31, 62, 73, 14, 22, 63, 45, 90, 82, 76, 81, 79, 55, 51, 70, 53, 96, 3, 80,
                51 };
        nums = smallerNumbersThanCurrent(nums);
        for (int i : nums) {
            System.out.print(" "+i);
        }
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        // int ans[] = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        // int temp = 0;
        // for(int j=0;j<nums.length;j++){
        // if(nums[i]>nums[j]){
        // temp++;
        // }
        // }
        // ans[i]=temp;
        // }
        // return ans;

        // array memory will be used as short-term memory with max numbers from 0 to
        // 100.
        // int[] memory = new int[100];

        // //additional variable length for better reading
        // final int length = nums.length;

        // //answer array that will be returned
        // int[] ans = new int[length];

        // //this loop counts how many digits we have in nums array
        // for (int num : nums) {
        // memory[num]++;
        // }

        // //this loop checks how many numbers are before the number, meaning bigger,
        // for example 8 has 4 number before it
        // int count = 0, temp;
        // for (int i = 0; i < 100 && count < length; i++) {
        // if (memory[i] != 0) {
        // temp = memory[i];
        // memory[i] = count;
        // count += temp;
        // }
        // }

        // //this loop simply copies values to answer array
        // for (int i = 0; i < length; i++) {
        // ans[i] = memory[nums[i]];
        // }
        // return ans;

        int memory[] = new int[501];

        for (int i : nums) {
            memory[i]++;
        }
        int count = 0;
        for (int i = 0; i < 501 && count < memory.length; i++) {
            if (memory[i] != 0) {
                int temp = memory[i];
                memory[i] = count;
                count += temp;
            }
        }
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = memory[nums[i]];
        }
        return ans;

    }
}
