package OOP.Abstraction;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I an going to be Doctor");
    }

    @Override
    void partner() {
        System.out.println("I love paper ports");
    }

}
