package logicalProgramme;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */
/* Write a short program that prints each number from 1 to 20 on a new line.For each multiple of 3,
  print"3"instead of the number.For each multiple of 5,print"5"instead of the number.
  For numbers which are multiples of both 3and 5,print"3 & 5"instead of the number.
*/

public class Solution3 {
        public static void main(String args[]) {
        int n = 20;
        // loop for 20 times
        for (int i = 1; i <= n; i++) {
            // number divisible by 3, print '3'
            // in place of the number
            if (i % 3 == 0)
                System.out.println("3");
                // number divisible by 5, print '5'
                // in place of the number
            else if (i % 5 == 0)
                System.out.println("3");
            else // print the numbers
                System.out.println(i);
        }
    }
}

