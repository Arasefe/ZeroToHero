package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArrayReverseMethod2 {
    public static void main(String[] args) {
        int [] nums;                // All the values of the nums are assigned to numbers array
        nums=new int[]{4,5,6,7};
        int [] numbers=nums;        // to be able to use toString method we need to give the name of Array as a  parameter.

        System.out.println(Arrays.toString(numbers));
        int reversed[]=new int[4];

        for(int i=0,k=3;i<numbers.length;i++,k--){
            reversed[k]=numbers[i];
            System.out.println(reversed[k]);

        }
        System.out.println(Arrays.toString(reversed));
    }
}
