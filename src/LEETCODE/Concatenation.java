package LEETCODE;

import java.util.Scanner;

class Concatenation{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        int nums[]   =new int[6];
        for(int i =0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int nums2[] = getConcatenation(nums);
        for (int i : nums2) {
            System.out.println(i);
        }
        
    }
    static int[] getConcatenation(int[] nums) {
        int ans[]= new int[nums.length*2];
        // for(int i=0;i<nums.length;i++){
        //      ans[i]=nums[i];
        //      ans[i+nums.length]=nums[i];
        // }
        return ans;
    }
}
