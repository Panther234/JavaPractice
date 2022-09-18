package practice;

import java.util.Scanner;

public class Alphabet_Symbol_14 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter any Alphabet / symbol / number:");
        char cha = x.next().charAt(0);

        if (Character.isAlphabetic(cha)) {
            System.out.println("Entered character is Alphabet.");
        } else if (Character.isDigit(cha)) {
            System.out.println("Entered character is Number.");
        } else {
            System.out.println("Entered character is Symbol.");
        }
        x.close();
    }

}
