package exceptions.runtimeexception;

import java.util.Scanner;

public class RuntimeException3 {
    public static void main(String[] args) {

        String name="John";
        System.out.println(name.length());

        try {
            String name1 = null;
            int length = name1.length();
            System.out.println(length);             //java.lang.NullPointerException
        }catch(NullPointerException exception){     //You can use Exception instead of NullPointerException
            System.out.println("You can not get length of null String");
        }


    }
}
