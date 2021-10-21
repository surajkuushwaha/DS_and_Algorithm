package Recursion.Basic;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(productOfDigits(55));
    }
    static int productOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*productOfDigits(n/10);
    }
}
