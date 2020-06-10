package corejavaapi.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList11 {
    public static void listToArray(){
        List<String>list=new ArrayList<>();
        list.add("Ahmet");
        list.add("Bilgi");
        list.add("Zehra");
        list.add("Aras");
        list.add("Tulpar");
        list.add("Banu");
        System.out.println(list);           // ArrayList
        Object[]names=list.toArray();       // Converting ArrayList to Array
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

    }

    public static void main(String[] args) {
        listToArray();
    }
}
