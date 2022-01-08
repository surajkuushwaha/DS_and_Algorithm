package OOP.Abstraction;

public abstract class Parent {

//    all the methods should be override by child
    int age;
    final int VALUE;

    public Parent(int age) {
        this.age=age;
        VALUE = 132465;
    }
    void normal(){
        System.out.println("Normal function");
    }

    abstract void career();
    abstract void partner();
}
