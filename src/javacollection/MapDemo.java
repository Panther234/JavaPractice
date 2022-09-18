package javacollection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> list = new HashMap<>();
        list.put(1, "bmw");
        list.put(2, "Honda");
        list.put(4, "Audi");
        // System.out.println(list.get(1));
        for (Map.Entry<Integer, String> car : list.entrySet()){
            System.out.println(car.getKey()+ ", " +car.getValue());

        }
         //   list.put(3, "Toyota");
        //System.out.println(list.get(3));
        System.out.println(list.size());

    }

}
