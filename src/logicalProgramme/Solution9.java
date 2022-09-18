package logicalProgramme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */
 /*
    Explain the login for identifying the reverse order of the words in the sentence
    If the input is “ I am good” , output should be “good am I”
	If the input is “You are bad” , output should be “bad are You”
 */
public class Solution9 {
    public static String reverseOrderOfWords(String text) {
        List<String> words = Arrays.stream(text.trim().split("[ ]+")).collect(Collectors.toList());
        List<String> reverse = new ArrayList<>();
        for (String word : words) {
            reverse.add(0, word);
        }
        return String.join(" ", reverse);
    }
    public static void main(String[] args) {
        System.out.println(reverseOrderOfWords(" I am good"));
        System.out.println(reverseOrderOfWords("You are bad"));
    }
}

