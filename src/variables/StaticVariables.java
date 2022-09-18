package variables;

public class StaticVariables {

    static int x = 10; //static variable
    static String name = "Hiren";


    public static void main(String[] args) {
        int b = 10;
        System.out.println(x); //10, direct access
        System.out.println(StaticVariables.x);//10 access with class name
        System.out.println(name);//direct access
        System.out.println(StaticVariables.name);//Hiren access with class name

        myMethod();
    }

    public static void myMethod() {
        System.out.println(x);//direct access
        System.out.println(StaticVariables.x);// access with class name
        System.out.println(name);//direct access
        System.out.println(StaticVariables.name);//Hiren access with class name


    }
}
