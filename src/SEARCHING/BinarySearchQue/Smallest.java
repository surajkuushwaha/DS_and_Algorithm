package SEARCHING.BinarySearchQue;// package Searching.BinarySearchQue;

public class Smallest {
    public static void main(String[] args) {
        char arr[]={'c','f','j'};
        System.out.print(nextGreatestLetter(arr,'f'));
        
    }
    public static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start%arr.length]; 
    }
}
