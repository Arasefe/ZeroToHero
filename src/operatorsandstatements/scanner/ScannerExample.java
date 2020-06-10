package operatorsandstatements.scanner;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your name");
        String userName =input.next();
        System.out.println("Your name is " + userName);
        System.out.println("Please enter your Date of Birth " + userName);
        int dateOfBirth = input.nextInt();
        int currentYear=2019;
        int age=currentYear-dateOfBirth;
        System.out.println("Your age is " + age  +  userName);


    }
}
