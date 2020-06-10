package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArrayReverseBuckhalka {

    public static void main(String[] args) {

        int[] array = { 1, 5, 3, 7, 11, 9, 15};
        System.out.println(array.toString());

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
