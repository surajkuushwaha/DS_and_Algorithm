package SEARCHING.LEETCODE;

public class FindKthPositive {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(findKthPositive(arr,2));
    }
    static int findKthPositive(int arr[],int k){
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end -start)/2;
            if(arr[mid]-(mid+1)<k){
                start = mid+1;
            }
            else end = mid-1;
        }
        return k+start;



    }
}
