package practice;

import java.util.Scanner;

public class Odd_Even_1 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = x.nextInt();

        String n = (a%2 == 0) ? "Even" : "Odd";

        System.out.println("Entered number ("+a+") is "+n);

    }

}
