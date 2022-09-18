package practice;

import java.util.Scanner;

public class Average_7 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a_1 = x.nextInt();

        System.out.println("Enter Second Number:");
        int a_2 = x.nextInt();

        System.out.println("Enter Third Number:");
        int a_3 = x.nextInt();

        System.out.println("Enter Fourth Number:");
        int a_4 = x.nextInt();

        System.out.println("Enter Fifth Number:");
        int a_5 = x.nextInt();

        int Avg = (a_1 + a_2 + a_3 + a_4 + a_5)/5;

        System.out.println("The average of all these is: "+Avg+".");


    }

}
