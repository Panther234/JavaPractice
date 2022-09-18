package operators;

public class OperatorsExamples {

    public static void main(String[] args) {
        //1// Arithmetic operators ---> +, -, *, /, %
        int a = 10;
        int b = 20;

        System.out.println(a + b);//30
        System.out.println(b - a);//10
        System.out.println(a * b);//200
        System.out.println(b / a);//2
        System.out.println(b % a);//0

        //2// Relational operators ---> <, >, <=, >=, !=, ==

        System.out.println(a < b); // true
        System.out.println(a > b); // false
        System.out.println(a <= b); // true
        System.out.println(a >= b); //false
        System.out.println(a == b); //false
        System.out.println(a != b); //true

        //3// logical operators ---> &&, ||, !a, !b

        //4// Assignment operators ---> =, +=, *+, /=,

        int c=4;
        int var;
        var=c;
        System.out.println(var); //4
        var +=c;
        System.out.println(var); //8 (4*2)
        var*=c;
        System.out.println(var); //32 (8*4)
        var/=c;
        System.out.println(var); // 8


        int x = 5;
        int y = ++x; //increment operator ++
        System.out.println(y);
        int z = --x; //decrement operator --
        System.out.println(z);

        int H= 10;
        int I= ++H;
        System.out.println(I);

    }
}
