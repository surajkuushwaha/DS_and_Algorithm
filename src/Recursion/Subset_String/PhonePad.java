package Recursion.Subset_String;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
//        pad("", "12");
        System.out.println(padLeet("", "1"));
    }

    static ArrayList<String> padLeet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            p=p.replaceAll("[[^A-Za-z0-9]]","");
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt(0) - '0';//this will coonvert "2" into 2
        if (((digit - 2) * 3) == 15) {
            for (int i = (digit - 2) * 3; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padLeet(p + ch, up.substring(1)));
            }
        } else if (((digit - 2) * 3) == 18) {
            for (int i = ((digit - 2) * 3) + 1; i <= (digit - 1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padLeet(p + ch, up.substring(1)));
            }
        } else if (((digit - 2) * 3) == 21){
            for (int i = ((digit - 2) * 3) + 1; i <= (digit - 1) * 3+1; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padLeet(p + ch, up.substring(1)));
            }
        }else {
            for (int i = (digit - 2) * 3; i < (digit-1) * 3; i++) {
                char ch = (char) ('a' + i);
                list.addAll(padLeet(p + ch, up.substring(1)));
            }
        }
        return list;
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';//this will coonvert "2" into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padString(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';//this will coonvert "2" into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(padString(p + ch, up.substring(1)));
        }
        return ans;
    }
}
