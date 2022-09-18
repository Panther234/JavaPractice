package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); //print the statement for user to add value
        int num = sc.nextInt(); // it will take the value from user and store into num variable

        // Using algorithm
//        int rev=0;
//        while (num!=0){
//            rev=rev*10 + num %10;
//            num=num/10;
//        }
//        System.out.println("Reverse number is: " + rev);

        //Using StringBuffer class
//        StringBuffer sb= new StringBuffer(String.valueOf(num)); // object of StringBuffer class and 'valueof' method convert num value in to string
//        StringBuffer rev = sb.reverse();
//        System.out.println("Reverse number is: " + rev);

        //Using StringBuilder class
        StringBuilder sbl = new StringBuilder();
        sbl.append(num); //sbl variable hold the user added 'num' value
        StringBuilder rev = sbl.reverse();
        System.out.println("Reverse number is: " + rev);

    }
}
