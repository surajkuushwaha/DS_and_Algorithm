package LEETCODE;

public class RichestCustomerWealth {
    public static void main(String arg[]) {
        int[][] nums = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(maximumWealth(nums));
    }

    static int maximumWealth(int[][] accounts) {
        int temp[] = new int[accounts.length];
        for(int i=0;i<accounts.length;i++){
            for(int a= 0 ;a<accounts[i].length;a++){
                temp[i]+=accounts[i][a];
            }
        }        
        for (int i : temp) {
            if(i>temp[0]){
                int temp1=temp[0];
                temp[0] = i;
                i = temp1;
            }
        }
        return temp[0];
    }

}
