package encapsulation;

public class Test {

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setId(101);
        obj.setName("Prime");

        System.out.println(obj.getId());//101
        System.out.println(obj.getName());//Prime
    }

}
