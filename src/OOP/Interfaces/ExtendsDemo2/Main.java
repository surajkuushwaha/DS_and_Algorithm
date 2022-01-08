package OOP.Interfaces.ExtendsDemo2;

public class Main implements B,A {
    @Override
    public void greet() {
        B.super.greet();
    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greetings();
    }
}
