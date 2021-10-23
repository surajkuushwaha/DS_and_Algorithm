package Recursion.Arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 23, 21, 23};
//        System.out.println(find(arr, 4, 0));
//        System.out.println(lastindex(arr, 4, arr.length-1));
//        findAllIndex(arr,4,0);
//        System.out.println(list);
//        ArrayList<Integer> list1 = new ArrayList<>();
//        System.out.println(findAllIndexList(arr,4,0,list1));
//        System.out.println(list1);
        System.out.println(findAllIndexList1(arr,4,0));
    }

    static int find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return find(arr, target, index + 1);
        }
    }

    static int lastindex(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return lastindex(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);

    }

    static ArrayList findAllIndexList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndexList(arr, target, index + 1, list);
    }

    static ArrayList findAllIndexList1(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls= findAllIndexList1(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return  list;
    }

}
