package corejavaapi.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList16 {
    public static void arrayToList(){
       // String[]numbers={"12","21","23","34","45","54","53","78"};
        List<String> list = Arrays.asList("12","21","23","34","45","54","53","78");
        System.out.println(list);                       // as is
        Collections.sort(list);                         // sorts as alphabetic order
        System.out.println(list);                       // as sorted
}

    public static void main(String[] args) {
        arrayToList();
    }
    }
