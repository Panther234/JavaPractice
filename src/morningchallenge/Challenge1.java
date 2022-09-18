package morningchallenge;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name :");
        String name = scanner.nextLine();
        System.out.println("Please enter greetings message :");
        String message = scanner.nextLine();
        System.out.println ("Hi " + name);
        System.out.println (message);

    }
}
