package Strings;



public class ValidParentheses {
    public static boolean isValid(String s) {

        for (int i =0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        return true;
    }
    public static void main(String[] args) {
        isValid("{}{}{}");
        
    }
}
