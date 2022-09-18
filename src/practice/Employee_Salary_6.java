package practice;

import java.util.Scanner;

public class Employee_Salary_6 {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("Employee Id: ");
        int id = ob.nextInt();

        System.out.println("Employee Name: ");
        String name = ob.next();

        System.out.println("Employee's Basic Salary: ");
        int salary = ob.nextInt();

        int HRA, DA, TA, PF, GS;

        HRA = (salary * 10)/(100);
        DA = (salary * 8)/(100);
        TA = (salary * 9)/(100);
        PF = (salary * 20)/(100);
        GS = salary + HRA + DA + TA - PF;

        System.out.println("Salary Calculation of "+name+" is as per below: ");
        System.out.println("______________________________________");
        System.out.println("Basic Salary: £"+salary);
        System.out.println("HRA: £"+HRA);
        System.out.println("DA:  £"+DA);
        System.out.println("TA:  £"+TA);
        System.out.println("PF:  £"+PF);
        System.out.println("______________________________________");
        System.out.println("Gross Salary: £"+GS);
    }
}
