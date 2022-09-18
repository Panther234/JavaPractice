package blocks;

public class InstanceBlocks {
    String eName;

    {
        System.out.println("Instance block");
        eName = "Prime";
        //instance blocks only {}
    }

    void display() {
        System.out.println(eName);
    }

    public static void main(String[] args) {
        new InstanceBlocks().display();

    }

}
