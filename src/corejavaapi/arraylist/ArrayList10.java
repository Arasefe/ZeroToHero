package corejavaapi.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList10 {
    public static void listToArray(){
        List<String>list=new ArrayList<>();
        list.add("Hawk");
        list.add("Robin");
        list.add("Eagle");
        list.add("Tucan");
        System.out.println(list);                           // ArrayList
        Object []objectArray=list.toArray();                // Syntax
        System.out.println(objectArray.length);             // 4
        String[]stringArray=list.toArray(new String[4]);    //
        System.out.println(stringArray.length);             //
        for(String arr:stringArray){
            System.out.println(arr);

        }
    }

    public static void main(String[] args) {
        listToArray();
    }
}
