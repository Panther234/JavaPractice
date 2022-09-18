package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public class Swapping2Numbers {

    public static void main(String[] args) {
        int a =10;
        int b =20;
        System.out.println("Before swapping values are :" +a+" "+b);

        //Logic 1 - Third variable
//        int t=a;
//        a=b;
//        b=t;
//        System.out.println("After swapping values are :" +a+" "+b);

        //Logic 2 - use + & - operators
//        a=a+b; // 10+20=30
//        b=a-b; // 30-20=10
//        a=a-b; // 30-10=20
//        System.out.println("After swapping values are :" +a+" "+b);

        //Logic 3 - use * & / operators
//        a=a*b;
//        b=a/b;
//        a=a/b;
//        System.out.println("After swapping values are :" +a+" "+b);

        //Logic 4 - bitwise XOR (^)
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println("After swapping values are :" +a+" "+b);
        //Logic 5 - single statement
        b=a+b-(a=b);
        System.out.println("After swapping values are :" +a+" "+b);
    }
}
