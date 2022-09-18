package logicalProgramme;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */
 /*
    Explain the logic for identifying that number is prime or not
 */
public class Solution8 {
    public static boolean isPrime(Integer number) {
        if (number <= 1) return false;
        double sqrt = Math.sqrt(number);
        for (double i = 2; i <= sqrt; i++) {
            if (number/i % 1 == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(5));
        System.out.println(isPrime(7));
    }
}
