package practice;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Quantity of Product: ");
        int qty = obj.nextInt();

        System.out.println("Enter the Price of Product: ");
        int price = obj.nextInt();

        int total = (qty*price);

        System.out.println("_________________________________________________");

        if(qty>1000){
            System.out.println("Congratulations, You are eligible for Quantity Discount");
            int dis = total*10/100;
//            total = total-dis;
            int discount = total-dis;
//            System.out.println("Total: £"+total);
            System.out.println("Total: £"+discount);
        }else{
            System.out.println("Sorry, You are not eligible for Quantity Discount");
            System.out.println("Total: £"+total);
        }
    }
}
