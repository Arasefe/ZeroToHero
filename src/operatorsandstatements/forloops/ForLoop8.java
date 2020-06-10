package operatorsandstatements.forloops;

import java.util.Scanner;

public class ForLoop8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int numberOne=input.nextInt();
        System.out.println("Please enter second number");
        int numberTwo=input.nextInt();


        // int i;
        for (numberOne=numberOne; numberOne<=numberTwo;numberOne++){
            System.out.println(numberOne);
        }
    }
}
