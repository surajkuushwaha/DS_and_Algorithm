package Recursion.Basic;

public class ReverseANumber {

    static int sum =0;
    static void reverse1(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10+rem;
        reverse1(n/10);
    }
    static int reverse2(int n){
        int dig = (int) (Math.log10(n)+1);
        return helper(n,dig);
    }
    private static int helper(int n, int dig){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem * (int)(Math.pow(10,dig-1)) + helper(n/10,dig-1);
    }
    public static void main(String[] args) {

        System.out.println(reverse2(1234));
    }

}
