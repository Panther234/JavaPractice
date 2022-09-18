package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public class EvenOddFromArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        // Extracting EVEN numbers------------
//        System.out.println("Even numbers in array.......");
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 == 0)
//                System.out.println(a[i]);
//        }

        //Using Enhanced for loop
        System.out.println("Even numbers in array.......");
        for(int value:a){
            if(value%2==0)
                System.out.println(value);
        }

        // Extracting ODD numbers------------
//        System.out.println("Odd numbers in array.......");
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] % 2 != 0)
//                System.out.println(a[i]);
//        }

        //Using Enhanced for loop
        System.out.println("Odd numbers in array.......");
        for(int value:a){
            if(value%2!=0)
                System.out.println(value);
        }

    }
}
