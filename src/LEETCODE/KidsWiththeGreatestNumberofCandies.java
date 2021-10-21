package LEETCODE;

import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

public class KidsWiththeGreatestNumberofCandies {
    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
    public static void main(String arg[]){
        int[] nums = {2,3,5,1,5};
        System.out.println(kidsWithCandies(nums,3));
    
    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int max = candies[0];
        for (int i : candies) {
            if(i>max){
                max=i;
            }
        }
        for(int i :candies){
            if(i+extraCandies>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}
