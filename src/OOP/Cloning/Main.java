package OOP.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws CloneNotSupportedException {
        Human suraj = new Human(34,"Suraj Kushwaha");
//        Human twin = new Human(suraj);

        Human twin = (Human)suraj.clone();
        System.out.println(twin.age);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        twin.name="Suman";
        System.out.println(Arrays.toString(suraj.arr)+"| "+suraj.name);

    }
}
