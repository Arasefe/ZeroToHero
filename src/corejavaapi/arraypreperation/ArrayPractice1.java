package corejavaapi.arraypreperation;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void arrayMethod(){
        int num1[]=new int[3];
        num1[0]=2;
        num1[1]=18;
        num1[2]=45;
        int[]num2=new int[]{42,55,99};
        int[]num3={23,45,67};
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));
    }

    public static void main(String[] args) {
        arrayMethod();
    }
}
