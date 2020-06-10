package classdesign.abstraction3;

import java.util.ArrayList;
import java.util.List;

public final class Example2 {
    public final List<String> list;
    {
        list=new ArrayList<>();
        list.add("Java");

    }
    public Example2(){
        list.add("Selenium");
                // list = new ArrayList<>(); we can not reinitialize final Objects
    }

    public static void main(String[] args) {
        Example2 example2=new Example2();
        example2.list.add("Cucumber Testing Tool");
        System.out.println(example2.list);

        Example2 example21=new Example2();
        System.out.println(example21.list);
    }

    public final void myMethod(){
        System.out.println("I am inside of my method");

    }
    public final void myMethod(String name){
        System.out.println("This is the overloaded final method");
    }
}
