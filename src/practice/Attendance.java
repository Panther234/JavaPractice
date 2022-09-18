package practice;

import java.util.Scanner;

public class Attendance {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Total number of class which held: ");
        double total = x.nextDouble();

        System.out.println("Total Attended class by Student: ");
        double attended = x.nextDouble();

        double percentage = (attended*100)/(total);

        System.out.println("Total Attendance is: " + percentage +"%");

        if(percentage<75){
            System.out.println("Student is not allowed to sit in exam.");
        }else{
            System.out.println("Student can sit in exam.");
        }


    }

}
