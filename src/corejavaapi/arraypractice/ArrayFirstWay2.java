package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArrayFirstWay2 {
    public static void main(String[] args) {
        String books[]=new String[5];               //Declare the array with size of 5
        books[0]="PMBOK";                           //Initialize the array elements here one by one
        books[1]="Early Childhood Development";
        books[2]="Physical Training";
        books[3]="Math";
        books[4]="Chemistry";

        for (int i=0;i<books.length;i++){
            System.out.println(books[i]);
        }
        System.out.println(Arrays.toString(books));     // Arrays.toString() method can not manipulate array just print
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        method();
    }



    public static void method(){
        String[]books={"PMBOK","Early Childhood Development","Physical Training","Math","Chemistry"};
        for(String book:books){
            System.out.println("I want to read "+ book + " book this month.");
        }
        System.out.println(Arrays.toString(books));

    }
}
