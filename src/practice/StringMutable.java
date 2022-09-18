package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public class StringMutable {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        System.out.println(a);
        String s= new String("hello");
        String s1= new String("hello");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
