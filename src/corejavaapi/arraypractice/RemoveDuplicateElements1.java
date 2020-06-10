package corejavaapi.arraypractice;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveDuplicateElements1 {
    public static void main(String[] args) {
        /*

        */
        Scanner input=new Scanner(System.in);
        int numbers[]=new int[6];
        System.out.println("Please enter the numbers:");
        for (int i=0;i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        int removed[]=new int[numbers.length];
        System.out.println(Arrays.toString(numbers));           // sort the array first

        int number=numbers[0];
        removed[0]=number;
        for (int i=1;i<numbers.length;i++){
            if (number!=numbers[i]){
                removed[i]=numbers[i];
            }
            number=numbers[i];

        }
        System.out.println(Arrays.toString(removed));
    }

}
