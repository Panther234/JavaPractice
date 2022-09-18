package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public class ReverseString {
    public static void main(String[] args) {
        //1. Using + operator
        String str = "ABCD";
        String rev="";

//        int len= str.length();//it will give number of characters in string
//       for(int i=len-1;i>=0; i--){
//           rev=rev+str.charAt(i);
//       }
//        System.out.println("Reverse string is: " + rev);

        //2. Using Character array

//        char a[]=str.toCharArray(); //covert string to multiple char
//        int len = a.length;
//        for (int i=len-1;i>=0;i--) {
//            rev=rev+a[i];
//        }
//        System.out.println("Reverse string is: " + rev);

        //3. Using string buffer class
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reverse string is: " + sb.reverse());
    }


}
