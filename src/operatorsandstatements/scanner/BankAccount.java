package operatorsandstatements.scanner;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How much did you make in the first day of business: ");
        int firstDaySalary= input.nextInt();
        System.out.println("How much did you make in the second day of business: ");
        int secondDaySalary=input.nextInt(); // amount+=input.nextInt();
        System.out.println("How much did you make in the third day of business: ");
        int thirdDaySalary=input.nextInt(); // amount+=input.nextInt();
        System.out.println("Total amount of my bank account");
        System.out.println("How much did you spend for the computer: ");
        double computerPrice= input.nextDouble();
        System.out.println("How much did you spend for the phone: ");
        double phonePrice= input.nextDouble();
        double bankAccountTotal= (firstDaySalary+secondDaySalary+thirdDaySalary)-(computerPrice+phonePrice); // amount-=spending;
        System.out.println("Your total amount of bank account is " + bankAccountTotal);


    }
}
