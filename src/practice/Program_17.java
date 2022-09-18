package practice;

import java.util.Arrays;
import java.util.Collections;

public class Program_17 {
    public static void main(String[] args) {

        // Array type numeric
        Integer[] numarray = {
                89, 13, 20, 28, 23, 78, 72, 65, 1, 9};

        // Array type string
        String[] stringarray = {
                "India", "UK", "US", "Germany", "France", "Spain", "Dubai", "Africa", "Italy", "Iceland"};

        System.out.println("Original numeric array: " + Arrays.toString(numarray));
        Arrays.sort(numarray);
        System.out.println("Sorted numeric array in Ascending order: " + Arrays.toString(numarray));
        Arrays.sort(numarray, Collections.reverseOrder());
        System.out.println("Sorted numeric array in Decending order: " + Arrays.toString(numarray));

        System.out.println("");
        if (true) {

        } else {
            throw new Error();
        }

        System.out.println("Original string array: " + Arrays.toString(stringarray));
        Arrays.sort(stringarray);
        System.out.println("Sorted string array in Ascending order: " + Arrays.toString(stringarray));
        Arrays.sort(stringarray, Collections.reverseOrder());
        System.out.println("Sorted string array in Decending order" + Arrays.toString(stringarray));

    }
}

