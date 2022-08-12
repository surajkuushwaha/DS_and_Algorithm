package A.Flowofprogram;

public class Table {
    public static void main(String[] args) {
        tablePrint(3);

    }
    static void tablePrint(int a){
        for(int i =1;i<=10;i++){
            System.out.println(""+a+" x "+i+" = "+a*i);
        }
    }
}
