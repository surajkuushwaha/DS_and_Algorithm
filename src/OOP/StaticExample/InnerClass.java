package OOP.StaticExample;

public class InnerClass {
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    public static void main(String[] args) {
        Test a =  new Test("Suraj");
        Test b = new Test("Rahul");
        System.out.println(a);
        System.out.println(b.name);
    }
}
