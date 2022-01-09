package OOP.Cloning;



public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr=new int[]{3,4,5,6,7,6};
    }
//    public Human(Human other){
//        this.age=other.age;
//        this.name=other.name;
//    }
//    public Object clone() throws CloneNotSupportedException{
////        this is shallow copy
////        creat new copy for primitive only
////        Object will not be copyed it will just point other object
//        return super.clone();
//    }
    @Override
    public Object clone() throws CloneNotSupportedException{
//        this is Deep copy
        Human twin =(Human) super.clone();
        twin.arr= new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i]=this.arr[i];
        }
        return twin;
    }

}
