package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {

        int [] num = {1,3,5,6,2,0};

       Arrays.sort(num);

       for (int numb : num) {

           System.out.println(numb);

       }

        System.out.println(Arrays.toString(num));
    }
}
