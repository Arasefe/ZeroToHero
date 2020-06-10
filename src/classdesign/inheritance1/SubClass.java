package classdesign.inheritance1;

public class SubClass extends SuperClass {
    public void subClassMethod(){
        myMethod();
        System.out.println(name);

    }

    public static void main(String[] args) {
        SubClass subClass=new SubClass();
        subClass.subClassMethod();
    }
}
