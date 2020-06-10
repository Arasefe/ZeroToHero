package corejavaapi.arraypreperation;

import java.util.Arrays;

public class ArrayPractice10 {
    public static void main(String[] args) {
        int [] numbers = {45, 56, 67, 78, 89, 98, 78, 67, 345, 2345};
        int [] reversed= new int[numbers.length];

        for (int i=0, k=9 ; i<numbers.length ; i++, k-- ){
            reversed[i]=numbers[k];

            System.out.println(reversed[i]);

        }
            System.out.println(Arrays.toString(reversed));
        }
    }

