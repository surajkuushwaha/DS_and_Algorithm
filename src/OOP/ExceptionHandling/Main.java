package OOP.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b=0;
        try {
//            int c =divide(a,b);
//            throw new Exception("Just for fun");
            String name = "Suraj";
            if (name.equals("Suraj")){
                throw new MyExceptions("Name is Suraj");
            }

        }catch (MyExceptions e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Normal exceptions");
        }finally{
            System.out.println("Finally block");
        }
    }
    static int divide(int a, int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
