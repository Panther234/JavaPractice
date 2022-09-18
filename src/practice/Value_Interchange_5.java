package practice;

import java.util.Scanner;

public class Value_Interchange_5 {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the Value of A:");
        int a = ob.nextInt();

        System.out.println("Enter the Value of B:");
        int b = ob.nextInt();

        System.out.println("Here you entered the value of A and B as per below:");
        System.out.println("A: "+a);
        System.out.println("B: "+b);

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("After interchanging the value, new value of A & B as per below:");
        System.out.println("A: "+a);
        System.out.println("B: "+b);

    }
}
