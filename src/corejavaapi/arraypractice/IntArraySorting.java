package corejavaapi.arraypractice;

import java.util.Arrays;

public class IntArraySorting {
    public static void methodSorting(){
        int []num={34,54,656,65,87,567,45,24,454};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
    public static void methodSorting1(){
        int [] num={12,32,11,23,34,345,546,34,21,543};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }

    public static void methodSorting2(){
        int [] num={2,32,1,3,34,34,54,21,543};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
    public static void methodSorting3(){
        String []arr={"10","9","100"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        methodSorting();
        methodSorting1();
        methodSorting2();
        methodSorting3();
    }
}
