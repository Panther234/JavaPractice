package polymorphism;

public class ChildClass extends ParentClass {
//overriding  from parentclass
    public void m1 (int a, int b){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.m1(20,10);//10
    }

}
