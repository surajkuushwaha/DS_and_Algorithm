package OOP.AccessControl;

public class A {
    private int nums;
    String name;
    int[] arr;

    public int getNums() {
        return nums;
    }

    public A(int num, String name) {
        this.nums = num;
        this.name = name;
        this.arr =  new int[num];
    }
}
