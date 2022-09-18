package practice;

import java.util.Scanner;

public class Commission {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("Sales Id: ");
        int id = ob.nextInt();

        System.out.println("Seller's Name: ");
        String name = ob.next();

        System.out.println("Sales Amount: ");
        int amount = ob.nextInt();

        System.out.println("Employee's Basic Salary: ");
        int salary = ob.nextInt();

        int comm;

        if(amount >= 50000){
            comm = (amount*35)/100;
        }else  if(amount >= 30000){
            comm = (amount*20)/100;
        }else  if(amount >= 20000){
            comm = (amount*10)/100;
        }else  if(amount >= 10000){
            comm = (amount*5)/100;
        }else {
            comm = (amount*2)/100;
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Total Commission for sales id:"+id+" is: "+comm);
        System.out.println("-----------------------------------------------");
    }
}
