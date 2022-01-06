package OOP.Intro;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10, b = 23;
        swap(a, b);
        System.out.println(a + "|" + b); //this will not swap because it is pass by value & pass by reference is not supported in java
        Integer A = new Integer(34);
        Integer B = 45;
        swap(A, B);
        System.out.println(A + "|" + B);// still not swap becaude Integer class is final

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object cleaning");
    }
}
