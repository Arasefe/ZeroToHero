package corejavaapi.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList13 {
    public static void arrayToList(){
        String[]names={"Ahmet","Mehmet","Cevdet","Veli","Davut","Hasan"};
        List<String> list= Arrays.asList(names);
        System.out.println(list);
        Collections.sort(list);                     //Alphabetic order

    }

    public static void main(String[] args) {
        arrayToList();
    }
}
