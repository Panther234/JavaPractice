package practice;

import java.util.Scanner;

public class Vowel_Consonent_17 {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter any Character: ");
        char ch = ob.next().charAt(0);

        System.out.println("Input: "+ch);


        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Output: Entered Character is Vowel.");
        }else if(Character.isDigit(ch)){
            System.out.println("Output: Entered Character is Numeric.");
        }else {
            System.out.println("Output: Entered Character is Consonant.");
        }
        //System.out.println("Output: Entered data is String.");




    }
}
