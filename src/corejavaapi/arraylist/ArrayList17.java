package corejavaapi.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList17 {
    public static void arrayToList(){
        List<String>list= Arrays.asList("EMPTY","BIRD","METHOD","SIGNATURE","CLEAR");
        System.out.println(list);       //as is
        Collections.sort(list);         // sort the Collection
        System.out.println(list);       // prints as sorted alphabetical
    }

    public static void main(String[] args) {
        arrayToList();
    }
}
