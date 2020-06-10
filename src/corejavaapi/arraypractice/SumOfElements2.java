package corejavaapi.arraypractice;
import java.util.Arrays;
import java.util.Scanner;
public class SumOfElements2 {
    public static void main(String[] args) {
          /*
        Populate an array of integer element of 10 from Scanner.
        ----0,1,2,3,4,5,6,7,8,9
        Using loop print two values if their sum is equals to 5
         */
          Scanner input=new Scanner(System.in);
          int numbers[]=new int [10];
          System.out.println("Please enter the numbers:");
          for (int i=0; i<numbers.length;i++){
              numbers[i]=input.nextInt();

              for (int k=i+1;k<numbers.length;k++){
                  if (numbers[i]+numbers[k]==8){
                     // System.out.println(numbers[i]+"and"+numbers[k]);
                  }
                  System.out.println(numbers[i]+"and"+numbers[k]);


              }
          }
        System.out.println(Arrays.toString(numbers));


    }
}
