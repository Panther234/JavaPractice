package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public class CountSumOfDigits {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number to count sum of digits: ");
//        int num = sc.nextInt();

        int num = 123456;
        int sum = 0;
        while(num>0){
            sum = sum+num%10;
            num=num/10;
        }
        System.out.println("Sum of digits in number: " + sum);
    }

}
