package A.Flowofprogram;

import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char sum='3';
        System.out.println("Enter x to print sum of entered number");
        while(sum=='v'){
            sum = sc.next().charAt(0);
            System.out.println(sum);
        }
    }
}
