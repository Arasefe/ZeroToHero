package corejavaapi.arraypreperation;

import java.util.Arrays;

public class ArrayPractice9 {
    public static void stringArrayMethod(){
        int [] numbers=new int[10];
        for (int i=0;i<numbers.length;i++){
            numbers[i]=i+5;
        }
        System.out.println(Arrays.toString(numbers));

    }

    public static void main(String[] args) {
        stringArrayMethod();
    }
}
