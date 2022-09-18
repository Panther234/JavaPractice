package practice;

import java.util.Scanner;

public class Number_Pos_Neg_Zero_8 {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter any number Negative/Zero/Positive: ");
        int number = num.nextInt();
        System.out.println("______________________________________");
        if(number>0){
            System.out.println("Entered number is (+)Positive.");
        }else if(number<0){
            System.out.println("Entered number is (-)Negative.");
        }else{
            System.out.println("Entered number is (0)Zero.");
        }
        System.out.println("______________________________________");
    }
}
