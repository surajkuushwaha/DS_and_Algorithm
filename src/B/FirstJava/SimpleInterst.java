package B.FirstJava;

import java.util.Scanner;

public class SimpleInterst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("Simple interest is "+(p*t*r)/100);
    }
}
