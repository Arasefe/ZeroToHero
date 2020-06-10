package collections.setcollection;

import java.util.HashSet;
import java.util.Set;

public class SetPractice1 {
    public static void main(String[] args) {
        Set<String> list=new HashSet<>();           //1 st way
        HashSet<String> list1=new HashSet<>();      // 2 nd way
        Set list2=new HashSet<>();                  // 3 rd way

        list2.add(10);          // Autoboxing to Wrapper class
        list2.add(20);
        list2.add(30);
        list2.add(40);

        list.add("Ahmet");
        list.add("Mehmet");
        list.add("Betul");
        list.add("Ceren");


    }
}
