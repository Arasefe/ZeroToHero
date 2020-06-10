package corejavaapi.arraypractice;
import java.util.Scanner;
import java.util.Arrays;

public class ArraySumPractice2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the numbers to sum : ");
        double numbers[]=new double [10];
        int i=0;
        double sum=0;
        for (i=0; i<numbers.length;i++){
            numbers[i]=input.nextDouble();

            sum+=numbers[i];
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(sum);
        }
    }

