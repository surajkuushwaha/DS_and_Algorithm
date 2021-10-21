package SEARCHING.LEETCODE;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println(guessNumber(10,6));
    }
    static int guessNumber(int n,int k) {
        int start =0;
        int end = n;
        while(start<=end){
            int mid = start+(end -start)/2;
            if(mid==k){
                return mid;
            }else if(mid<k){
                start = mid+1;
            }else end = mid -1;
        }
        return -1;
    }
}
