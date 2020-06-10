package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArraySplitMethod4 {
    public static void main(String[] args) {
        String date="15-5-2019";
        String [] numbers=date.split("-");
        System.out.println(Arrays.toString(numbers));

    }
}
