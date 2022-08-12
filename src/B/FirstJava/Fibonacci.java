package B.FirstJava;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);

    }
    static void fibonacci(int n){
        if(n<2){
            return;
        }
        int a = 1, b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 1 ; i <=n-2;i++){
            int temp = a+b;
            System.out.println(temp);
            int temp1 = a;
            a = b;
            b = temp;
        }

    }
}
