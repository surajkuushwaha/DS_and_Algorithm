package OOP.properties.Polymorphism;

public class Numbers {
    double sum(double a ,int b){
        return a+b;
    }
    double sum(int a ,int b){
        return a+b;
    }
    int sum(int a, int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj =  new Numbers();
        obj.sum(2,5);
        obj.sum(2.5,5);
        obj.sum(4,5,6);
        obj.sum(4,5,6);

    }
}

