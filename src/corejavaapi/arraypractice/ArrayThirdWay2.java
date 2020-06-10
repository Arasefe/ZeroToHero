package corejavaapi.arraypractice;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayThirdWay2 {
    public static void main(String[] args) {
        System.out.println("Please enter the car brands you like most");
        Scanner input=new Scanner(System.in);
        String cars[]=new String[6];
        for (int i=0; i<cars.length;i++){
            cars[i]=input.nextLine();

        }
        System.out.println(Arrays.toString(cars));
        for (int k=cars.length-1;k>=0;k--){
            System.out.println(cars[k]);
        }
    }

}
