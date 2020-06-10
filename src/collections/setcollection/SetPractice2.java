package collections.setcollection;

import java.util.HashSet;
import java.util.Set;

public class SetPractice2 {
    public static void addMethod(){
        Set<Integer>list=new HashSet<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);       // no duplication is allowed thus it will not store duplicate 10. It will compile but not add.
        System.out.println(list);
    }

    public static void main(String[] args) {
        addMethod();
    }
}
