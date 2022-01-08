package OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(25);
        Daughter daughter = new Daughter(25);
        son.career();
        daughter.career();

        Parent mom = new Parent(45) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };// for abstract class you cannot create objects like this
    }
}
