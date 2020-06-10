package corejavaapi.arraypractice;

import java.util.Arrays;

public class BinarySearch1 {
    public static void binarySearch1() {
        int[] num={4,3,1,30,10};
        Arrays.sort(num);                                   // First we have to sort the array
        System.out.println(Arrays.toString(num));           // [1,3,4,10,30]
        int indexNumber=Arrays.binarySearch(num,10);    // First divides thea array to two parts and takes the second part.
        System.out.println(indexNumber);                     // prints the index number of 10 (3)
    }

    public static void binarySearch2(){
        int[] arr = {4, 3, 1, 30, 10, 82, 346, 723, 78, 13};
        Arrays.sort(arr);                                        // iot make binarySearch, first sort()
        System.out.println(Arrays.toString(arr));                // print from smallest to biggest
        // [1, 3, 4, 10, 13, 30, 78, 82, 346, 723]
        int indexNumber = Arrays.binarySearch(arr, 31);     //
        System.out.println(indexNumber);                         //  31 is on the 7th place. But there is no 31 so it gives -7
    }
    public static void binarySearch3() {
        int numbers[] = new int[]{1, 23, 45, 67, 7, 8, 89, 9, 0, 11};  // Third way of creating array;
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int indexnumber = Arrays.binarySearch(numbers, 12);
        System.out.println(indexnumber);
    }
    public static void main(String[] args) {
        binarySearch1();
        binarySearch2();
        binarySearch3();

    }
}
