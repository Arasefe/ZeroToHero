package corejavaapi.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList8 {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(14);
        list.add(24);
        for (Integer x:list){                   // for (int x:list) possible as well
            System.out.println(x+",");
            break;
        }
    }

}
