package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public class Fibonacci {
    //To find fibonacci series using recursion
    //nth number = Sum of (n-1)th and (n-2)th numbers

    static int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        int n = 8; //n starts from 0
        if (n < 0)
            System.out.println("Fibonacci number is not defined");
        else
            System.out.println(fib(n));
    }

    // To print fibonacci series like 0,1,1,2,3,5,8,13,21,34,55,89....
//    public static void main(String[] args) {
//        int n1=0, n2=1, sum =0;
//        System.out.print(n1+" "+n2);
//
//        for(int i=2; i<10;i++){
//            sum=n1+n2;
//            System.out.print(" "+sum);
//            n1=n2;
//            n2=sum;
//        }
//    }

}
