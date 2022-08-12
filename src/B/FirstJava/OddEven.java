package B.FirstJava;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(oddeven(a));
    }
    static boolean oddeven(int a){
        if(a%2==0){
            return true;
        }
        return false;
    }
}
