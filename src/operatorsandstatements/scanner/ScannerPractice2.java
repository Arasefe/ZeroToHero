package operatorsandstatements.scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter three different numbers");
        int numberOne= input.nextInt();
        int numberTwo=input.nextInt();
        int numberThree=input.nextInt();
        boolean result=(numberOne==numberTwo && numberOne==numberThree);
        System.out.println("Three number is equals to each other " + result);


    }
}
