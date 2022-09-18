package practice;

import java.util.Scanner;

public class Calculator_13 {

    public static void main (String[] args){

        Scanner y = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        double a = y.nextDouble();

        System.out.println("Enter the second Number: ");
        double b = y.nextDouble();

        System.out.println("Enter any symbol from -> (+, -, *, /): ");
        char oper = y.next().charAt(0);

        switch (oper){

            case '+':
                System.out.println(a+b);
                break;

            case '-':
                System.out.println(a-b);
                break;

            case '*':
                System.out.println(a*b);
                break;

            case '/':
                System.out.println(a/b);
                break;

                default:
                    System.out.println("You entered wrong sign.");
                    break;

        }


    }

}

