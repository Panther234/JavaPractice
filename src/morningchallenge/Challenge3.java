package morningchallenge;
//create java class with name Challenge3
public class Challenge3 {
    int eId;// int type instance variable
    int deptNo;//int type instance variable
    String eName;//String type instance variable
    String job;//String type instance variable

    public void display() {//no return type method, all four variables call inside method
        System.out.println(eId);
        System.out.println(eName);
        System.out.println(deptNo);
        System.out.println(job);
    }

    public static void main(String[] args) {
        // object emp1
        Challenge3 emp1 = new Challenge3();
        emp1.eId = 101;
        emp1.deptNo = 10;
        emp1.eName = "John";
        emp1.job = "Manual Tester";
        emp1.display();

        // object emp2
        Challenge3 emp2 = new Challenge3();
        emp2.eId = 102;
        emp2.deptNo = 11;
        emp2.eName = "Smith";
        emp2.job = "Automation Tester";
        emp2.display();

    }
}
