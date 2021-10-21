package LEETCODE;

import java.util.Scanner;
public class SumOfArray {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int nums[]   =new int[6];
        for(int i =0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int nums2[] = runningSum(nums);
        for (int i : nums2) {
            System.out.println(i);
        }
    }
    static int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<=i;j++){
                ans[i]+=nums[j];
            }
        }
        return ans;
        
    }
}
