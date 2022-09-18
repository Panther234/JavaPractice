package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();
        System.out.print("Enter Third number: ");
        int c = sc.nextInt();

        //Approach 1 -Logical
        /*if (a > b && a > c) {
            System.out.println(a + " is Largest number");
        } else if (b > a && b > c) {
            System.out.println(b + " is Largest number");
        } else {
            System.out.println(c + " is Largest number");
        }*/

        //Ternary Operator
//        int largest1 = a>b? a:b; //largest of a & b
//        int largest2 = c>largest1? c:largest1; //largest of C & largest1
//        System.out.println(largest2 + " is Largest number");

        int largest = c>(a>b? a:b)? c:(a>b? a:b);
        System.out.println(largest + " is Largest number");

        sc.close();
    }
}
