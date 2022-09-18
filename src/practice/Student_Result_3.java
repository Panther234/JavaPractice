package practice;

import java.util.Scanner;

public class Student_Result_3 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Student Name: ");
        String name = x.next();

        System.out.println("Enter Student's Roll No: ");
        int roll = x.nextInt();

        System.out.println("Marks in Science: ");
        int sc = x.nextInt();

        System.out.println("Marks in Maths: ");
        int mt = x.nextInt();

        System.out.println("Marks in History: ");
        int hi = x.nextInt();

        int per = (sc+mt+hi)/3;


        System.out.println("______________________________________");
        System.out.println(name+" got "+per+"%");

        if(per>=35){
            System.out.println(name+" Passed this exam successfully.");
        }else {
            System.out.println("Sorry! "+name+", failed this exam.");
        }

        System.out.println("______________________________________");

        if(per >= 80){
            System.out.println("Overall, "+name+" got A+ grade.");
        }else if(per >= 60){
            System.out.println("Overall, "+name+" got A grade.");
        }else if(per >= 50){
            System.out.println("Overall, "+name+" got B grade.");
        }else if(per >= 35){
            System.out.println("Overall, "+name+" got C grade.");
        }else{
            System.out.println("Overall, "+name+" failed this exam.");
        }

        System.out.println("______________________________________");

    }

}
