package methodsandencapsulation.constructors;

public class StaticMethods {

    //Access modifier   static      return type     method name (method name + parameters=method signature)
    public static void method1(){  // static public void method1(){ can be written as well
        System.out.println("I am static method 1");
    }
    public void method2(){
        System.out.println("I am non static method 2");
        method1();
        method3();
        method4();
    }
    public static void method3(){
        System.out.println("I am static method 3");
    }

    public void method4(){
        System.out.println("I am non static method 4");

    }

    public static void main(String[] args) {
        method1();
        method3();

        //method2(); static method can not call non static method() and variables;Static method can call directly only static methods.
        // Non static method can call directly static and non static methods.

        StaticMethods sm=new StaticMethods();
        sm.method4();
        sm.method2();
    }
}
