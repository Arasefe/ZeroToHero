package corejavaapi.arraypractice;
import java.util.Arrays;
import java.util.Scanner;
public class ArraySecondWay2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 10 numbers: ");
        int numbers[]=new int[10];
        int reversed[]=new int[10];
        for (int i=0; i<numbers.length;i++){
            numbers[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(numbers));

        for ( int k=numbers.length-1;k>=0;k--){
            System.out.println(numbers[k]);
        }


    }
}
