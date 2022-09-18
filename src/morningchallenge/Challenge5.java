package morningchallenge;

import java.util.Scanner;

public class Challenge5 {
    public String reverseTheString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the string you want to reverse: ");
        String string = input.nextLine(); // Scans for next whole line
        Challenge5 c5 = new Challenge5(); // Create object
        String reverseTheString = c5.reverseTheString(string); // Object access of reverseTheString method
        System.out.print("String after reversing: " + reverseTheString);
        input.close(); // Closes the scanner
    }
}
