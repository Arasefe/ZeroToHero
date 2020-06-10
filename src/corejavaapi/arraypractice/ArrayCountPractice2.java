package corejavaapi.arraypractice;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayCountPractice2 {
    public static void main(String[] args) {
        /*
        Create Scanner and get an array of 10 integers and print the sum of the numbers that are bigger than 50 and less than 200.
        And find the total numbers of elements matching the condition and sum of the elements.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the numbers: ");
        int numbers[]=new int[10];
        int sum=0;
        int count=0;
        for (int i=0; i<numbers.length;i++){
            numbers[i]=input.nextInt();
            sum+=numbers[i];
            if (numbers[i]>50 &&numbers[i]<100){
                count++;

            }

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(count);
        System.out.println(sum);
    }
}
