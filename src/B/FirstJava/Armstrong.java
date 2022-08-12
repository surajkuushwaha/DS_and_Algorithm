package B.FirstJava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        armstrong(num);

    }

    static void armstrong(int num) {
        int sum = 0;
        int num1 = num;
        while (num1 > 0) {
            int temp = num1 % 10;
            sum = (int) Math.pow(temp, 3) + sum;
            num1/=10;
        }
        System.out.println(sum);
    }

}
