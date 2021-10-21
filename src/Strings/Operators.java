package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+3);
        System.out.println("a"+3);
//        Same as "a"+"3"
//        int will be converted to interger that will call toStinng()
        System.out.println("Suraj"+new ArrayList<>());
        System.out.println("Suraj"+new Integer(67));
        System.out.println();
    }
}
