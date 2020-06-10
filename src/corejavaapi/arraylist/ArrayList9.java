package corejavaapi.arraylist;

import java.util.ArrayList;

public class ArrayList9 {
    public static void listToArray(){
        ArrayList<String>string=new ArrayList<String>();
        string.add("Prevent");
        string.add("Object");
        string.add("code");
        string.add("now");
        string.add("Romantic");
        System.out.println(string);             //ArrayList

        Object[]array=string.toArray();         //Converts ArrayList to Array
            // for(Object arr:array){
            System.out.println(array);
        }


    public static void main(String[] args) {
        listToArray();
    }
}
