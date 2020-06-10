package methodsandencapsulation.constructors;

public class StaticExample {
    int num1;                                       // one copy for each object
    static int num2;                                // One copy for all objects

    public static void main(String[] args) {        // static methods can only call static variables.
        num2=10;
        StaticExample example1=new StaticExample();  // we can have access to non-static variables by creating object
        StaticExample example2=new StaticExample();
        example1.num1=20;

        num2=example1.num1*5;                        //5*20=100
        example1.num1=num2*2;                        //
        example1.num1=example2.num2*2;               //
        example1.num1=example2.num1*2;
        System.out.println(example1.num1);
        System.out.println(num2);
    }
}
