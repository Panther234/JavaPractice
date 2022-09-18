package logicalProgramme;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */
/*
    Logic to reverse a string - using the recursive method
    IF THE input is “Good” , output should be “dooG”
	IF THE input is “G” , output should be “G”
	Write unit tests for the same
 */

public class Solution6 {
    public static String reverseRecursive(String text) {
        if (text.length() > 1)
            return reverseRecursive(text.substring(1)) + text.charAt(0);
        else return text;
    }

    public static void main(String[] args) {
        System.out.println(reverseRecursive("Test"));
    }
}
