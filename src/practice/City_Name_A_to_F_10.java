package practice;

import java.util.Scanner;

public class City_Name_A_to_F_10 {


    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter your any character from A to F:");
        char city = x.next().charAt(0);

        switch (city){

            case 'a':
            case 'A':
                System.out.println("Amsterdam");
                break;

            case 'b':
            case 'B':
                System.out.println("Birmingham");
                break;

            case 'c':
            case 'C':
                System.out.println("Chicago");
                break;

            case 'd':
            case 'D':
                System.out.println("Dallas");
                break;

            case 'e':
            case 'E':
                System.out.println("Edinburgh");
                break;

            case 'f':
            case 'F':
                System.out.println("Frankfurt");
                break;

                default:
                System.out.println("You didn't enter character between a-f or A-F.");
                break;
        }

    }

}
