package corejavaapi.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList6 {
    public static void main(String[] args) {
        List<String> words=new ArrayList();
        words.add("Java");
        words.add("Loves");
        words.add("Me");
        words.add("i");
        words.add("Love");
        words.add("Java");
        words.add("too");
        /*
        String []myArr=new String[]{};
        Arrays.sort(myArr);
        In array we use sort() method to sort
        In ArrayList we have to use Collections.sort() method
         */
        System.out.println(words);
        Collections.sort(words);            // Alphabetical order
        System.out.println(words);
        words.remove(0);
        System.out.println(words);
        words.remove("Me");
        System.out.println(words);
        words.remove("Love");
        System.out.println(words);
        words.remove("Love");
        System.out.println(words);
        System.out.println(words.contains("Java"));
        words.set(2,"Me");
        System.out.println(words);
        words.add(2,"i");
        System.out.println(words);
        //Converting Array to List
        // Arrays.asList(arr)

        // Converting List and ArrayList to an Array
        Object []wordsInArray=words.toArray();
        System.out.println(Arrays.toString(wordsInArray));  // to print all elements of array
        System.out.println(wordsInArray[3]);                // print the third element

        //Converting from Array to ArrayList using Arrays.asList(array)

        List<Object>list=Arrays.asList(wordsInArray);
        System.out.println(list);
        System.out.println(words);
        System.out.println("++++++++++++++++++++++++++++++");

        List<Integer>numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(-2);
        numbers.add(0);
        numbers.add(14);
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);

        numbers.remove(Integer.valueOf(0));     //if you want to remove according to index number, remove the value index number 0

        System.out.println();

        numbers.clear();

        System.out.println(numbers);







    }
}
