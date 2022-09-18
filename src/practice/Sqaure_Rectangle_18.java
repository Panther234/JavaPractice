package practice;

import java.util.Scanner;

public class Sqaure_Rectangle_18 {

    public static void main(String[] args){

        Scanner x = new Scanner(System.in);

        System.out.println("Enter the Length of Rectangle: ");
        int l = x.nextInt();

        System.out.println("Enter the Breadth of Rectangle: ");
        int b = x.nextInt();

        if(l == b){
            System.out.println("Given dimension is for Square");
        }else{
            System.out.println("Given dimension is for Rectangle");
        }


    }

}
