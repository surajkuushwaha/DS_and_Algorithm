package Recursion.Basic;

public class Pelindrome {
    public static void main(String[] args) {
        System.out.println(palin(121));
    }
    static int reverse(int n){
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
    static boolean palin(int n){
        return n==reverse(n);
    }
}
