package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArrayReverseMethod1 {
    public static void method(){
        int[] array = { 1, 5, 3, 7, 11, 9, 15};
        int []reversed=new int[7];
        int sum=0;
        for (int i=0,k=6;i<array.length;i++,k-- ){
            reversed[k]=array[i];
            System.out.println(reversed[k]);
        }
        System.out.println(Arrays.toString(reversed));
    }

    public static void main(String[] args) {
        method();
    }
}
