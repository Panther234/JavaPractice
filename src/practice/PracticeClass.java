package practice;

import java.text.DecimalFormat;

public class PracticeClass {
    public static void main(String[] args) {
        double a = 2232311;
        double b = 6160;
        double c = a/b;


        DecimalFormat numberFormat = new DecimalFormat("0.00");
        System.out.println(numberFormat.format(c));
    }
}


