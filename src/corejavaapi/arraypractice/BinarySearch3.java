package corejavaapi.arraypractice;

import java.util.Arrays;

public class BinarySearch3 {
    public static void main(String[] args) {
        int numbers[]=new int[]{17,23,45,67,77,88,89,9,03,11};  // Third way of creating array;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int indexNumber=Arrays.binarySearch(numbers,12);
        System.out.println(indexNumber);
    }
}
