package variables;

public class InstanceVariables {
    int a = 100; //instance variable


    public static void main(String[] args) {
        //static area
        InstanceVariables obj = new InstanceVariables();// object
        System.out.println(obj.a);// access with object
       obj.test();

    }

    public void test() {
        //instance area
        InstanceVariables t = new InstanceVariables(); //object
        System.out.println(a);//direct access in instance area
        System.out.println(t.a);//access with object

    }
}
