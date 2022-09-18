package javacollection;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int i = 10;

        Integer wrapper = new Integer(i);//wrapped primitive data as wrapper class
        System.out.println(wrapper);
        int unwrapped = wrapper.intValue();
        System.out.println(unwrapped);
    }
}
