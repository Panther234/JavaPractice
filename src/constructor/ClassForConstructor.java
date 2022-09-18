package constructor;

public class ClassForConstructor {

    int empid;
    String empName;
    float empSalary;

    public void display() {
        System.out.println("emp id is: " + empid);
        System.out.println("emp name is: " + empName);
        System.out.println("emp salary is: " + empSalary);
    }

    ClassForConstructor(int empid, String empName, float empSalary) {
        this.empid = empid;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public static void main(String[] args) {
        ClassForConstructor obj1 = new ClassForConstructor(100, "Prime", 100000);
        ClassForConstructor obj2 = new ClassForConstructor(101, "Rajesh", 200000);
        obj1.display();
        obj2.display();
    }
}
