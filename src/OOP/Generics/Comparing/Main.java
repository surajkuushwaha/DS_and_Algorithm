package OOP.Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
    Student suraj = new Student(23,99.76f);
    Student suman = new Student(5,56.76f);
        Student ankit = new Student(2,66.76f);
        Student akash = new Student(13,56.76f);
        Student karan = new Student(9,59.76f);

        Student[] list = {suraj,suman,akash,karan,ankit};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks-o2.marks));//lambda functions
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return  -(int)(o1.marks-o2.marks);
//            }
//        });
        System.out.println(Arrays.toString(list));



//    if(suraj.compareTo(suman)<0){
//        System.out.println(suraj.compareTo(suman));
//        System.out.println("Suraj has more marks");
//    }

    }
}

