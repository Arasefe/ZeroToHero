package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArraySumPractice4 {
    public static void main(String[] args) {
        /*
        Create an array of 10 integers and print the sum of the numbers that are bigger than 50 and less than 200.
        And find the total numbers of elements matching the condition and sum of the elements.
         */
        int [] numbers={3,9,23,34,45,67,89,112,124,145};
        int count;
        int sum=0;
        System.out.println(Arrays.toString(numbers));
        for (int i=0; i<numbers.length;i++){
            if (numbers[i]>50 &&numbers[i]<200){
                System.out.println(numbers[i]);
                sum+=numbers[i];

            }

        } System.out.println("The sum of the numbers bigger than 50 and smaller than 200 is "+sum);
    }
}
