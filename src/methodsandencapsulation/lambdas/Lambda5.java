package methodsandencapsulation.lambdas;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Lambda5 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Aras");
        list.add("Tulpar");
        list.add("Banu");
        list.add("Ismail");
        list.add("Efe");
        list.add("Ege");
        System.out.println(list);
        list.removeIf(a->a.length()==3);
        System.out.println(list);
        list.removeIf(a->a.startsWith("A"));
        System.out.println(list);
    }
}
