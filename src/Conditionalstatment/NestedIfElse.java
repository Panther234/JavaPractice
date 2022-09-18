package Conditionalstatment;

public class NestedIfElse {

    public static void main(String[] args) {
        int marks = 100;

        if (marks > 100) {
            System.out.println("Not valid marks");
        } else if (marks >= 80 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks < 80 && marks >= 70) {
            System.out.println("Grade B");
        } else if (marks < 70 && marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Pass");
        }
    }


}

