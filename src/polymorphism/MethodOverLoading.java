package polymorphism;

public class MethodOverLoading {

    public void m1(int a) {
        System.out.println(a);
    }

    public void m1(int a, int b) {
        System.out.println("Two params method");
    }

    public void m1(String name) {

    }

    void m2(int a, String name) {

    }

    void m2(String name, int a) {

    }
}

