package corejavaapi.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList14 {
    public static void arrayToList() {
        String[] names = {"Ahmet", "Mehmet", "Cevdet", "Veli", "Davut", "Hasan"};
        List<String> list = Arrays.asList(names);
        Collections.sort(list);                         //alphabetic order
        System.out.println(list);

    }

    public static void main(String[] args) {
        arrayToList();
    }
}
