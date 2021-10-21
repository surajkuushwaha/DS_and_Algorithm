package LEETCODE;

import javax.lang.model.element.Element;

public class SentenceIsPangram {
    public static void main(String arg[]){
        String name = new String("thequickbrownfoxjumpsoverthelazydog");
        boolean temp = checkIfPangram(name);
        System.out.println(temp);
    }
    public static boolean checkIfPangram(String sentence) {
        int chara[]= new int[26];
        for(int i:sentence.toCharArray()){
            chara[i-'a']++;
        }
        for(int i:chara){
            if(i==0)return false;
        }
        return true;        
    }
}
