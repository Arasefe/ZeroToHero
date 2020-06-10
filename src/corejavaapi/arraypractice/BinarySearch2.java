package corejavaapi.arraypractice;

import java.util.Arrays;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] num = {41, 13, 11, 310, 130, 82, 346, 23, 78, 139};
        Arrays.sort(num);                                         // iot make binarysearch first sort()
        System.out.println(Arrays.toString(num));;                // print from smallest to biggest

        int indexNumber=Arrays.binarySearch(num,130);        //
        System.out.println(indexNumber);                          //  31 is on the 7th place. But there is no 31 so it gives -7
    }
}