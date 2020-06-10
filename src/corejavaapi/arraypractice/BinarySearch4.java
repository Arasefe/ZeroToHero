package corejavaapi.arraypractice;

import java.util.Arrays;

public class BinarySearch4 {
    public static void main(String[] args) {
        int[]numbers=new int[6];
        numbers[0]=10;
        numbers[1]=55;
        numbers[2]=35;
        numbers[3]=23;
        numbers[4]=47;
        numbers[5]=16;
        Arrays.sort(numbers);                                       // First sort()
        System.out.println(Arrays.toString(numbers));               // Then print
        int indexNumber=Arrays.binarySearch(numbers,23);       // Arrays.binarysearch(numbers,23)
        System.out.println(indexNumber);                            // print (indexNumber)
    }
}
