package practice;

import java.util.Scanner;

public class Employee_Bonus_19 {

    public static void main(String[] args) {


        Scanner ob = new Scanner(System.in);
        System.out.println("Employee's Salary: ");
        int salary = ob.nextInt();

        System.out.println("Employee's Year of Service: ");
        int year = ob.nextInt();

        if(year>5){
            int bonus = (salary*5)/100;
            System.out.println("This employee will get bonus of £"+bonus+".");
        }else{
            System.out.println("This employee is not eligible for bonus.");
        }
    }
}
