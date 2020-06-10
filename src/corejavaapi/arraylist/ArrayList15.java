package corejavaapi.arraylist;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList15 {
    public static void arrayToList(){
        String[]numbers={"12","21","23","34","45","54","53","78"};
        List<String> list = Arrays.asList(numbers);
        Collections.sort(list);                         //alphabetic order
        System.out.println(list);

    }

    public static void main(String[] args) {
        arrayToList();
    }
}
