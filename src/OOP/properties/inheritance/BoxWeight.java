package OOP.properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);//It's calling the parent class constructor
//        used to initialise value present in parent class
        System.out.println(this.weight);//refer to this class variable
        System.out.println(super.weight);//refer to the parent class variable
        this.weight = weight;
    } 
}
