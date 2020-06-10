package corejavaapi.arraypractice;

import java.util.Arrays;
import java.util.Scanner;

public class StoreIntegerArrayFromScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 7 integer values");
        int[] numbers=new int [7];

        for (int i=0;i<numbers.length;i++) { // 10,15,22,6,9,36,40
            numbers[i] = input.nextInt();
        }
            System.out.println(Arrays.toString(numbers));
            for (int i=0;i<numbers.length;i++)
            if (numbers[i]>20){
                 System.out.println(numbers[i]);
             }

        }

    }
