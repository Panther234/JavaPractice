package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public class CountEvenAndOddDigits {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number to find Odd & Even number count: ");
//        int num = sc.nextInt();

        int num = 123456;
        int even = 0;
        int odd = 0;

        while(num>0){
            int rem = num % 10;
            if (rem % 2 ==0) {
                even++;
            } else {
                odd++;
            }
            num=num/10;
        }
        System.out.println("Number of Even numbers: " + even);
        System.out.println("Number of Odd numbers: " + odd);
    }

}
