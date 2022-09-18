package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public class CountNumberOfDigits {
    //------without scanner class------
    public static void main(String[] args) {
        int num = 123456;
        int count = 0;

        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
    //------with scanner class------
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number to count digits: ");
//        int num=sc.nextInt();
//
//        int count =0;
//
//        while (num>0){
//            num=num/10;
//            count++;
//        }
//        System.out.println("Number of digits: " + count);
//    }
}
