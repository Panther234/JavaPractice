package methodrevision;

public class JavaRevision {
    int a = 10;
    String name = "Prime";
    boolean result = true;
    String[] names = {"Prime", "Testing", "Java"};
    String myCarName;

    public JavaRevision(String myCarName) {
        this.myCarName = myCarName;
        System.out.println("This is a one arg constructor");
    }

    public JavaRevision() {
        System.out.println("0 arg constructor");
    }


    public static void main(String[] args) {
        JavaRevision obj1 = new JavaRevision();//object creation
        System.out.println(obj1.name);//variable calling
        new JavaRevision("Honda");//nameless object creation
        System.out.println(obj1.myCarName);
//calling firstMethod
        new JavaRevision().firstMethod();
        obj1.firstMethod();
        obj1.secondMethod("Hiren");
        System.out.println(thirdMethod());//50
        System.out.println(fourthMethod("xyz"));

    }

    //No return type with no parameters
    public void firstMethod() {
        JavaRevision javaRevision = new JavaRevision();
        new JavaRevision();//nameless object
        System.out.println("First Method" + javaRevision.a);//outcome 10
        System.out.println(a);//call direct variable
        System.out.println(new JavaRevision().name);//Prime//call with nameless object
        System.out.println(name);//call direct variable
    }

    //No return type with parameters
    public void secondMethod(String myName) {
        System.out.println(myName);
    }

    //return type with no parameters
    public static int thirdMethod() {
        int x = 20;
        int y = 30;
        int result = x + y;

        return result;
    }

    //return type with parameters
    private static String fourthMethod(String yourName) {
        return yourName;

    }

    private void statements() {
        for (int i = 1; i <= 5; i++) {  //1,2,Hello,4,5
            if (i != 3) {
                System.out.println(i);
            } else {
                System.out.println("Hello");
            }
        }
        int a = 1;
        while (a <= 5) {
            System.out.println(a);
            a++;
        }
    }

}
