package blocks;

public class StaticBlocks {


    static {
        System.out.println("I am Static block 1");
        //static block with static word
    }
    static {
        System.out.println("I am static block 2");
    }
    public static void main(String[] args) {
        System.out.println("I am in main method");
    }
    static {
        System.out.println("I am in static block 3");
    }
}
