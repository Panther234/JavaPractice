package methodpractice;

public class NoReturnTypeWithParameters {

    public static void main(String[] args) {
        NoReturnTypeWithParameters obj = new NoReturnTypeWithParameters();
        obj.addition(10, 20, 30);//60
        obj.addition(1,2,3);//6



    }

    //3. No return type with parameters
    public void addition(int a, int b, int c) {
        System.out.println(a + b + c);


    }

}
