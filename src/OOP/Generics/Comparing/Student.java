package OOP.Generics.Comparing;

public class Student implements Comparable<Student> {
    @Override
    public int compareTo(Student o) {
        System.out.println("In compare to method");
        int diff = (int)(this.marks-o.marks);
//        if diff==0: means both are equal
        return diff;
    }

    int rollnumber;
    float marks;

    public Student(int rollnumber, float marks) {
        this.rollnumber = rollnumber;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks+"";
    }
}
