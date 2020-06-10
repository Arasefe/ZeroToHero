package corejavaapi.arraypractice;
import java.util.Scanner;
public class ArrayIntGetCount2 {
    public static void main(String[] args) {
        int numbers[]=new int[10];
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the numbers:");
        int sum=0;
        for (int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
            sum+=numbers[i];
        }
        System.out.println(sum);
    }
}
