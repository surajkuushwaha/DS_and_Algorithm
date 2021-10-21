public class SearchInRange {
    public static void main(String arg[]){
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println(sort(arr,4,0,3));
        System.out.print("pata nahi");

    
    }
    static int sort(int[] nums, int key,int start,int end) {
        if (nums.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (nums[i] == key) {
                return i;
            }
        }
        return -1;        
    }
}
