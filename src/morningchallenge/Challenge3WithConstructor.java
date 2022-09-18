package morningchallenge;

public class Challenge3WithConstructor {
    int eld; 
    int deptNo;
    String eName;
    String job;

    public void display() {
        System.out.println("eld = " + eld);
        System.out.println("eName = " + eName);
        System.out.println("deptNo = " + deptNo);
        System.out.println("job = " + job);
    }

    public Challenge3WithConstructor(int _eld, int _deptNo, String _eName, String _job) {
        job = _job;
        eName = _eName;
        eld = _eld;
        deptNo = _deptNo;
    }

    public static void main(String[] args) {
        Challenge3WithConstructor challenge3WithConstructor = new Challenge3WithConstructor(101, 10, "John", "Manual Tester");
        challenge3WithConstructor.display();
    }
}
