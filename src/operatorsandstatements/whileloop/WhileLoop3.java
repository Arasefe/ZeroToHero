package operatorsandstatements.whileloop;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {
        /*
        using scanner user will enter two different numbers
        starting from 20 to ending number 50
        print all odd numbers

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber=input.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber=input.nextInt();
        while (firstNumber<=secondNumber){
            // boolean oddNumber=firstNumber%2!=0;     //firstNumber%2==1
            if (firstNumber%2!=0){
                System.out.println(firstNumber);
            }

            firstNumber++;
        }

    }
}
