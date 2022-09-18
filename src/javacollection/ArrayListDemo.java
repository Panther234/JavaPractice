package javacollection;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Arraylist declaration
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        //System.out.println(list.size());
        //for (int i = 0; i < list.size(); i++) {
          //  System.out.println(list.get(i));
       // }
       // list.remove(3);
        //System.out.println("Data after removing from index");
        for (int data : list) {
           System.out.println(data);

        }
    }

}
