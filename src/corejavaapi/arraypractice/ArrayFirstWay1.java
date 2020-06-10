package corejavaapi.arraypractice;

import java.util.Arrays;

public class ArrayFirstWay1 {
    public static void main(String[] args) {
        String [] cars=new String[5];               //first declare the array and its size
        cars[0]="BMW";                              // then initialize the elements down here
        cars[1]="Toyota";
        cars[2]="Honda";
        cars[3]="Mercedes";
        //cars[10]="Tesla";                         //if you want to enter this, it will give run time error. (ArrayIndexOutOfBoundException)
        System.out.println(cars);                   // [BMW,Toyota,Honda,Mercedes]
        System.out.println(Arrays.toString(cars));
        for(String car:cars){
            System.out.println(car+ " is the car that i want to buy.");
            }
        }
    }
