package exceptiondemo;

public class RunTimeException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println("Program Start");

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Please enter correct value of b");
        }

        System.out.println("Program end");


    }
}
