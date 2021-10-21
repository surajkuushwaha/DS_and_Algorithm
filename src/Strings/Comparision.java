package Strings;

public class Comparision {
    public static void main(String[] args) {
        String  a = "suraj";
        String b = "suraj";
        System.out.println(a==b);
        String x = new String("Suraj");
        String y = new String("Suraj");
        System.out.println(x==y);
        System.out.println(x.equals(y));
    }
}
