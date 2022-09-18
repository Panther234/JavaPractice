package stringmethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringMethods {


    public static void main(String[] args) {
        String s1 = "ThisIsFirstString";
        String s2 = "This is second string";
        String s3 ="";
        List<String> newS1 = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            if (i == 0) {
                currentWord.append(s1.charAt(i));
                continue;
            } else if (i == s1.length() - 1) {
                currentWord.append(s1.charAt(i));
                newS1.add(currentWord.toString());
            }

            if (String.valueOf(s1.charAt(i)).matches("^[a-z]")) {
                currentWord.append(s1.charAt(i));
            } else {
                newS1.add(currentWord.toString());
                currentWord = new StringBuilder().append(s1.charAt(i));
            }
        }
        s1 = newS1.stream().collect(Collectors.joining(" "));
        System.out.println("s1 = " + s1);

        /*int l = s1.length();
        System.out.println("This string length is: "+ l);
        System.out.println("This string length is: " + s1.length());
        char b = s2.charAt(0);
        System.out.println(b);
        String c = s1.concat(s2);
        System.out.println(c);
        boolean d = s1.contains("T");
        System.out.println(d);
        boolean e = s2.startsWith("T");
        System.out.println(e);
        boolean f = s1.endsWith("g");
        System.out.println(f);
        boolean eq = s1.equals(s2);
        System.out.println(eq);
        int index = s1.indexOf("F");
        System.out.println(index);
        boolean empty = s3.isEmpty();
        System.out.println(empty);
        String replace = s1.replace("First", "second");
        System.out.println(replace);
        String substring = s2.substring(1);
        System.out.println(substring);
        char [] array = s1.toCharArray();
        System.out.println(array);
        String lower = s2.toLowerCase();
        System.out.println(lower);
        String upper = s2.toUpperCase();
        System.out.println(upper);
        String t = s1.trim();
        System.out.println(t);
        int t = s2.lastIndexOf(115);
        System.out.println(t);*/
    }
}
