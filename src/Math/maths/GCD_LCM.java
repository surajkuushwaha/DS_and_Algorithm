package Math.maths;

public class GCD_LCM {
    public static void main(String[] args) {
//        System.out.println(gcd(18,9));
        System.out.println(lcm(2, 7));
    }

    //    greatest common divisor (GCD)
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    //    least common multiple(LCM)
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);

    }
}
