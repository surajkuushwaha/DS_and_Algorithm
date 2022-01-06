package OOP.Intro;

public class Main {
    public static void main(String[] args) {
        Student students = new Student();
        System.out.println(students);
        System.out.println(students.rno);
    }
}

class Student {
    int rno;
    String name;
    float marks;
    Student(){
        System.out.println("Hello");
    }
}
