package corejavaapi.arraypreperation;

import java.util.Arrays;

public class ArrayPractice4 {
    public static void methodArraySort(){
        String [] arr={"time","result","might","expect","output","string","custom"};
        Arrays.sort(arr);                           // first sort then toString and print
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        methodArraySort();
    }
}
