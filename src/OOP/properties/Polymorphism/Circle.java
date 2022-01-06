package OOP.properties.Polymorphism;

public class Circle extends Shape{
    @Override // this is annotation (Gives error if not over written)
    void area(){
        System.out.println("I'm in circle ");
    }
}
