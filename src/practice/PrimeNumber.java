package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

import java.util.Scanner;
// Natural number > 1
// Which has only 2 factors 1 and itself

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

//        int num = 10;
        int count = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println(num + " is Prime number");
            } else {
                System.out.println(num + " is not Prime number");
            }
        } else {
            System.out.println(num + " is not Prime number");
        }
        sc.close();
    }
}
