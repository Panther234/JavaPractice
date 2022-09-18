package logicalProgramme;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

/*  Fizz buzz problem:
    The rules of the FizzBuzz game are very simple.
    Say Fizz if the number is divisible by 3.
    Say Buzz if the number is divisible by 5.
    Say FizzBuzz if the number is divisible by both 3 and 5.
    Return the number itself if the number is not divisible by 3 and 5.
*/

public class Solution4 {
    public static void fizzBuzz(int n){
//        if (n%3==0 && n%5==0){
//            System.out.println("Fizz Buzz");
//        }else if(n%5 ==0){
//            System.out.println("Buzz");
//        }else if (n%3 ==0){
//            System.out.println("Fizz");
//        }else {
//            System.out.println("Not Fizz Buzz");
//        }

        String output = "";
        if (n % 3 == 0) output += "Fizz";
        if (n % 5 == 0) output += "Buzz";
        if (output.isEmpty()) output = "Not FizzBuzz";
        System.out.println(output);
    }
    public static void main(String[] args) {
        fizzBuzz(21);
    }
}
