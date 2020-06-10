package corejavaapi.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList21 {
    public static void addMethod(){
        ArrayList list=new ArrayList();             // Java 5 1st way
        list.add("Hawk");
        list.add("Falcon");
        list.add("Peagen");
        list.add("BlueRay");
        list.add(null);
        System.out.println(list);                   // [Hawk,Falcon,Peagen,BlueRay]
        Collections.sort(list);                     // sort the list
        System.out.println(list);                   // [BlueRay,Falcon,Hawk,Peagen]
        Object[]array=list.toArray();               // Converts ArrayList to Array
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array)); // [BlueRay,Falcon,Hawk,Peagen]

    }
    public static Object addMethod1(){
        ArrayList<String> list=new ArrayList<>();
        list.add("Hawk");
        list.add("Falcon");
        list.add("Peagen");
        list.add("BlueRay");
        list.add("HummingBird");
        list.add("Macan");                          //[Hawk,Falcon,Peagen,BlueRay,HummingBird,Macan]
        list.remove("Hawk");                     //[Falcon,Peagen,BlueRay,HummingBird,Macan]
        list.remove(1);                       //[Falcon,BlueRay,HummingBird,Macan]
        list.remove("cardinal");                 //
        list.remove(3);                       //[Falcon,BlueRay,HummingBird]
        System.out.println(list);
        return list;
    }
    public static void main(String[] args) {
        addMethod();
        addMethod1();
    }
}
