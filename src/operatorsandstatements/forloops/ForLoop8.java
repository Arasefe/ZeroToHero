package operatorsandstatements.forloops;

import java.util.Scanner;

public class ForLoop8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=input.nextInt();
        System.out.println("Please enter second number");
        int num2=input.nextInt();


        // int i;
        for (num1=num1; num1<=num2;num1++){
            System.out.println(num1);
        }
    }
}
