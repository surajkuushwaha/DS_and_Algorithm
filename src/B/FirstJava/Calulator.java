package B.FirstJava;

import java.util.Scanner;

public class Calulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a:");

        int a = sc.nextInt();
        System.out.println("Enter a number b:");

        int b = sc.nextInt();
        System.out.println("Enter a operation + - / * :");
        char c = sc.next().charAt(0);
        if (c == '+') {
            System.out.println(a+b);
        } else if (c == '-') {
            System.out.println(a-b);
        } else if (c == '*') {
            System.out.println(a*b);
        } else if (c == '/') {
            System.out.println(a/b);

        } else {
            System.out.println("Entered char is not valid");
        }
    }
}
