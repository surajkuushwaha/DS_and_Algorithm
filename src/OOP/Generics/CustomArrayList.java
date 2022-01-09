package OOP.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size =0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int number){
        if(this.isfull()){
            resize();
        }
        data[size++] = number;
    }

    private void resize() {
        int[] temp= new int[data.length*2];
//        copy the current item in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove(){
        int remove = data[--size];
        return remove;
    }
    public int get(int index){
        return data[size];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index]=value;
    }



    private boolean isfull() {
        return size==data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.remove();
        System.out.println(list);
    }
}
