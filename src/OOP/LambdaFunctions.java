package OOP;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {
           ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }
//        arr.forEach((item)->{
//            System.out.println(item*2);
//        });
        Operation sum = (a,b)->a+b;
        Operation divide = (a,b)->a/b;
        Operation multipley = (a,b)->a*b;
        Operation subtract = (a,b)->a-b;
        LambdaFunctions fun = new LambdaFunctions();
        System.out.println(fun.operate(2,3,sum));
        System.out.println(fun.operate(2,3,divide));
        System.out.println(fun.operate(2,3,multipley));
        System.out.println(fun.operate(2,3,subtract));

    }
    private int operate(int a,int b,Operation op){
        return op.operaction(a,b);
    }
}
interface Operation{
    int operaction(int a, int b);
}


