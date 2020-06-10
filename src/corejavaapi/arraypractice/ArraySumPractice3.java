package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArraySumPractice3 {
    public static void main(String[] args) {
        int sum=0;

        int []numbers=new int[]{12,13,141,23,24,234,345,456,45};
        Arrays.sort(numbers);                           // sort() method will sort the array from smallest to biggest
        System.out.println(Arrays.toString(numbers));   // toString() method will print the array from left to right
        for(int i=0; i<numbers.length;i++){
            sum+=numbers[i];

        }
        System.out.println(sum);
    }
}
