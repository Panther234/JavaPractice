package inheritance;

public class MainClass extends ChildClass {

    public void m5(){
       // super.m1();//super means form parent class
       // this.m5(); //this is for same class

        System.out.println("This is main class m5 method");
    }

    public static void main(String[] args) {
        MainClass obj = new MainClass();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        obj.m5();
    }

}
