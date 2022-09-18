package practice;

import java.util.Scanner;

public class Practice1810_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = in.nextInt();
        if (a % 2 == 0) {
            System.out.println("A must be odd");
        } else {
            System.out.println("A is odd");
        }
    }
}
