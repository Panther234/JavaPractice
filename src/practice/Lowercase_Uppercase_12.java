package practice;

import java.util.Scanner;

public class Lowercase_Uppercase_12 {

    public static void main (String[] args){

        Scanner x = new Scanner(System.in);
        System.out.println("Enter any character in Uppercase or Lowercase: ");
        char ch = x.next().charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println("Entered character is in Uppercase");
        }else if (Character.isLowerCase(ch)){
            System.out.println("Entered character is in Lowecase");
        }else{
            System.out.println("You didn't enter character");
        }


    }

}
