package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArraySecondWay1 {
    public static void main(String[] args) {
        int []numbers={2,34,32,3,4,45,67,65,45,6778,87};
        int [] newArray=new int[11];
        System.out.println(Arrays.toString(numbers));       // toString method is used to print all elements of array.
                                                            // However, we can not manipulate
        System.out.println(numbers[4]);                     // print the number whose index number is written inside.
        Arrays.sort(numbers);                               // sort() method sorts from lowest to biggest
        System.out.println(Arrays.toString(numbers));

        for(int i=0,k=0;i<numbers.length;i++,k++){
            newArray[k]=numbers[i]+3;
            System.out.println(newArray[k]);
        }            System.out.println(Arrays.toString(newArray));

    }
}
