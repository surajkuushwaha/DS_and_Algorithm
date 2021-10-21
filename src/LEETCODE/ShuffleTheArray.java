package LEETCODE;

public class ShuffleTheArray {
    public static void main(String arg[]){
    int nums[]=new int[]{2,5,1,3,4,7};

    // shuffle(nums, 3);
    int[] ans = shuffle(nums, 3);
    for (int i : ans) {
        System.out.println(i);
    }
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        
        for(int i=0,j=0;i<2*n;i=i+2){
            ans[i]=nums[j++];
        }
        for(int i=1,j=n;i<2*n;i=i+2){
            ans[i]=nums[j++];
        }
        return ans;

        // for(int i=0;i<n;i++){
        //     System.out.println(nums[i]+"|"+nums[n+i]);            
        // }
    }
}
