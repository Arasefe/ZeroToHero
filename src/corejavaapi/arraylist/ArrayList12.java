package corejavaapi.arraylist;

import java.util.ArrayList;

public class ArrayList12 {
    public static void listToArray(){
        ArrayList<Integer>numbers=new ArrayList<>(2);
        numbers.add(10);
        numbers.add(13);
        numbers.add(15);
        numbers.add(18);
        numbers.add(21);
        numbers.add(34);
        System.out.println(numbers);
        Object[]numbersArray=numbers.toArray();
        for(int i=0;i<numbersArray.length;i++){
            System.out.println(numbersArray[i]);
        }

    }

    public static void main(String[] args) {
        listToArray();
    }
}
