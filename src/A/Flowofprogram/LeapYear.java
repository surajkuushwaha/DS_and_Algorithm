package A.Flowofprogram;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(leapyear(2000));

    }
    static boolean leapyear(int a){
        if(a%400==0){
            return true;
        }
        if(a%100==0){
            return false;
        }
        if(a%4==0){
            return true;
        }
        return false;
    }
}
