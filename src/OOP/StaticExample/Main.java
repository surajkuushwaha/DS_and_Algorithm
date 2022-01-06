package OOP.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human suraj = new Human(21,"Suraj kushwaha",10000,false);
        Human rahul = new Human(34,"rahul agarwal",104000,true);
        Human ankit = new Human(34,"ankit agarwal",104000,true);
//        System.out.println(suraj.population);
        System.out.println(Human.population);

    }
//    this is not depends on objects
    static void fun(){
//        this is not allowed without referencing their instances
        Main obj = new Main();
        obj.greetings();
    }
//    something which is not static belongs to an object
    void greetings(){
//        this is allowed
        fun();
        System.out.println("Hello");
    }
}
