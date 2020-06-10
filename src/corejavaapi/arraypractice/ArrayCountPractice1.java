package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArrayCountPractice1 {
    public static void main(String[] args) {
        /*
        Create an array of 8 integers and print the sum of the numbers that are bigger than 10 and less than 30.
        And find the total numbers of elements matching the condition
         */

       int []numbers={10,15,25,35,56,100,48,90};        // int []numbers=new int [8];
       int count=0;
       for (int i=0;i<numbers.length;i++){
           if (numbers[i] > 10 && numbers[i]<30) {
               System.out.println(numbers[i]);
               count++;

           }
       }
        Arrays.sort(numbers);                           // sort method
        System.out.println(Arrays.toString(numbers));

    }

}
