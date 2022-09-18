package practice;

public class MainMethodOverload1 {
    public static void main(Integer args){
        System.out.println("Overloaded main () method invoked that parses an integer argument");
    }
    public static void main(char args){
        System.out.println("Overloaded main() method invoked that parses a char arguments");
    }

    public static void main(String[] args) {
        System.out.println("Original main() method invoked");
    }
}
