package B.FirstJava;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(palindrome(str));
    }

    static boolean palindrome(String str) {
        int n = str.length() - 1;
        for (int i = 0, j = n; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;

    }
}
