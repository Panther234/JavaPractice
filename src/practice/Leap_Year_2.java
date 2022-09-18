package practice;

import java.util.Scanner;

public class Leap_Year_2 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = x.nextInt();

        if(year%4==0 || year%100==0){
            System.out.println("Entered year("+year+") is Leap Year.");
        } else{
            System.out.println("Entered year("+year+") is not Leap Year.");
        }


    }

}
