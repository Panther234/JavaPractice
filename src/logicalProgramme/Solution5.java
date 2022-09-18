package logicalProgramme;

import java.util.Scanner;

/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */
/*
    Logic to reverse a string
    If the input is “Test” output should be “tseT”
    Write unit tests for this program
 */
public class Solution5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text to convert into reverse: ");
        String text = in.nextLine();
        StringBuilder reverse = new StringBuilder();
        for (int i = 1; i <= text.length(); i++) {
            reverse.append(text.charAt(text.length() - i));
        }
        System.out.println("Reverse string is: " + reverse);
    }
}
