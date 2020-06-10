package corejavaapi.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList18 {
    public static void arrayToList(){
        List<String> list= Arrays.asList("Phone","12","water","234","Gallop","size");
        System.out.println(list);   // [Phone, 12, water, 234, Gallop, size]
        Collections.sort(list);     // [12, 234, Gallop, Phone, size, water]
        System.out.println(list);


    }

    public static void main(String[] args) {
        arrayToList();
    }
}
