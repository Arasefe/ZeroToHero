package corejavaapi.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        list.add("eagle");
        Object[]ObjectArray=list.toArray();
        System.out.println(ObjectArray.length);                   //3
        String[]stringArray=list.toArray(new String[0]);
        System.out.println(stringArray.length);

        List<String>a=new ArrayList<String>();
        List<String>b=new ArrayList();
    }

}
