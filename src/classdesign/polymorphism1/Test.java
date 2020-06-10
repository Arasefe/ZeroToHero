package classdesign.polymorphism1;

public class Test {
    public static void main(String[] args) {
        A a=new D();
        a.method1();
        ((E)a).method1();       //Run
    }
}
