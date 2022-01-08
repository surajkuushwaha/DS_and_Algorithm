package OOP.Interfaces.ExtendsDemo2;

public interface A {
//    static interface methods should hava a body
//   call by interface name
    static void greetings(){
        System.out.println("Hello! Good Morning!!");
    }
    default void fun(){
        System.out.println("I'm in A");
    };
}
