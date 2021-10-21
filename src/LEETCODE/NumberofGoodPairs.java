package LEETCODE;

public class NumberofGoodPairs {
    //https://leetcode.com/problems/number-of-good-pairs/
    public static void main(String arg[]){
    int[] nums = {1,2,3,1,1,3};
    System.out.println(numIdenticalPairs(nums));
    }
    public static int numIdenticalPairs(int[] nums) {
        int pair=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j] &&i<j){
                    pair++;
                }
            }
        }
        return pair;
    }

}
