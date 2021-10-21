package LEETCODE;

import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class CountItemsMatchingARule {
    public static void main(String arg[]){
        List<List<String>> item = new ArrayList<>();
        item.add(new ArrayList<String>());
        item.add(new ArrayList<String>());
        item.add(new ArrayList<String>());
        item.get(0).add("phone");
        item.get(0).add("blue");
        item.get(0).add("pixel");
        item.get(1).add("computer");
        item.get(1).add("silver");
        item.get(1).add("lenovo");
        item.get(2).add("phone");
        item.get(2).add("gold");
        item.get(2).add("iphone");
        System.out.println(countMatches(item, "color", "silver"));

    }
     static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // System.out.print(items);
         int key=-1,count=0;         
         switch(ruleKey){
            case "type" : key = 0;
            break;
            case "color" : key = 1;
            break;
            case "name" : key = 2;
            break;
        }        
         for(int i=0;i<items.size();i++){
            System.out.println(items.get(i).get(key)==ruleValue);
            if(items.get(i).get(key)==ruleValue){
                count++;
            }
         }
        return count;
    }
}
