package Recursion.Basic;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(count(302104));
    }

    static int count(int n) {
        return helper(n, 0);
    }

    //    special pattern, how to pass a value of above calls
    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 10 == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);

    }
}
