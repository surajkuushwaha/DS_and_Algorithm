package Math.BitWise;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(isEven(4));
    }
    static boolean isEven(int n){
        return (n & 1)==1;
    }
}
