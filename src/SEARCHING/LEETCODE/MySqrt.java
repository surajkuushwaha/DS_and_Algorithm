package SEARCHING.LEETCODE;

public class MySqrt {
    public static void main(String[] args) {
        System.out.println(binarySearch(0));

    }

    static int binarySearch(int target){

        int start = 1;
        int end = target;
        while(start<=end){
            int mid = start+(end -start)/2;
            if(target/mid==mid){
                return mid;
            }else if(target/mid > mid){
                start = mid+1;

            }else
                end = mid-1;
        }
        return end;
//        int start = 1;
//        int end = x;
//        int res = 0;
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//            if(mid <= x / mid){
//                start = mid + 1;
//                res = mid;
//            }
//            else{
//                end = mid - 1;
//            }
//        }
//        return res;
    }
}
