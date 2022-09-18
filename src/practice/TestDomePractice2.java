package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

public class TestDomePractice2 {
    public static class TextInput {
        String value = "";

        public String getValue() {
            return value;
        }

        public void add(char c) {
            value += c;
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(char c) {
            String cString = String.valueOf(c);
            if (cString.matches("^[0-9]$")) value += c;
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
