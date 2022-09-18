package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

import java.util.Random;

public class GenerateRandomNumbersAndStrings {
    public static void main(String[] args) {
        //---------Approach 1 - Random class------------
        Random rand = new Random();
        int rand_int = rand.nextInt(10); // generate random number, if you choose 10 then it generates random number between 0 and 9
        System.out.println(rand_int);
        // to choose random double,
        double rand_dbl = rand.nextDouble(); //range 0.0 and less than 1.0
        System.out.println(rand_dbl);

        //----------- Approach 2 - Math class-----------
        System.out.println(Math.random()); // to generate random decimal number

        //------------Approach 3 - Apache commons - lang API---------

    }
}
