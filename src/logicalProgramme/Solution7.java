package logicalProgramme;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */
/*
    How to get the length of the string without using the inbuilt method
   	If the input is “Good” , output should be 4
	If the input is “G” , output should be 1
	If the input is “test200” , output should be 6
	Write unit tests for the same
 */

public class Solution7 {
    public static Integer lengthOfString(String text) {
        int len = 0;
        for (int i = 0; i < text.length(); i++) {
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfString("Test"));
    }
}
