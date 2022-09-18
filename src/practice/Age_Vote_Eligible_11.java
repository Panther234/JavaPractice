package practice;

import java.util.Scanner;

public class Age_Vote_Eligible_11 {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = ob.nextInt();

        if(age>=18){
            System.out.println("This person is eligible for Voting.");
        }else{
            System.out.println("Sorry!! This person is not eligible for Voting.");
        }

    }
}
