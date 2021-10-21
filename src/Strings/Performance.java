package Strings;

public class Performance {
    public static void main(String[] args) {
        String a = "";
        for(int i=0;i<26;i++){
            char ch =(char)('A'+i);
            a=a+ch;
        }
        System.out.println(a);
    }
}
