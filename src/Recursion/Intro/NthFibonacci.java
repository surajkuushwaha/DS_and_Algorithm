package Recursion.Intro;

public class NthFibonacci {
    public static void main(String[] args) {
        long ans = fiboFormula(49);
        System.out.println(ans);
    }

    static long fiboFormula(int n) {
        return (int) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
//        not a tail recursion
        return fibo(n - 1) + fibo(n - 2);
    }
}
