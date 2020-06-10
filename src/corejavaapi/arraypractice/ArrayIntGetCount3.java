package corejavaapi.arraypractice;
import java.util.Scanner;
public class ArrayIntGetCount3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numbers[]=new int [12];
        int sum=0;
        int mean=0;
        System.out.println("Please enter the numbers:");
        for (int i=0; i<numbers.length;i++){
            numbers[i]=input.nextInt();
            sum+=numbers[i];
            mean=sum/numbers.length;
        }
        System.out.println("The sum of the numbers is "+ sum);
        System.out.println("The mean of the numbers is "+ mean);
    }
}
