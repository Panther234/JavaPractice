package blocks;

public class StaticBlocksUse {
    static String eName;
    static int eId;

    static{
        eName = "Hiren";
        eId = 101;
    }

    public static void main(String[] args) {
        System.out.println("Employee name: " + eName);
        System.out.println("Employee ID: " + eId);
    }
}
