package methodrevision;

public class MethodRevision {

    public static void main(String[] args) {

        MethodRevision me = new MethodRevision();
        me.additionCalculation();
        me.subtraction(200, 100);
        me.subtraction(50, 25);
        me.myAddition();//5,10
        int value = me.myAddition();
        System.out.println(value);//5,10,15
        System.out.println(me.myAddition());//5,10,15
        String name  = myName("Prime");
        System.out.println(name);
        System.out.println(myName("Prime"));

    }

    //1. No return type(void), no parameter(args)
    public void additionCalculation() {
        //method signature
        int a = 10;//int type local variable
        int b = 20;//int type local variable
        System.out.println(a + b);
    }

    //2. No return type(void), with parameter(args)
    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }

    //3. With return type(data), no parameter(args)
    public int myAddition() {
        int a = 5;
        int b = 10;
        System.out.println("First value: " + a);
        System.out.println("Second value: " + b);
        return a + b;
    }

    //4. With return type(data), with parameter(args)
    //static method
    private static String myName(String name) {
        System.out.println("The name is: " + name);
        return name;
    }

}
