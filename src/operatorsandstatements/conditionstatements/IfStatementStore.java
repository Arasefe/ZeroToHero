package operatorsandstatements.conditionstatements;

import java.util.Scanner;

public class IfStatementStore {
    public static void main(String[]args){
        /* if customer buys between 10 and 15 tables, he will get %10 discount,
           if buys 15-20 tables, gets %20 discount,
           if buys more than 20 tables, gets 25% discount.
        Write a program that will ask the user of the number of tables he will buy and give him the final price.
        one table is 110 dollars

         */
        Scanner input= new Scanner(System.in);
        System.out.println("How many tables do you want to buy: ");
        byte numberOfTables= input.nextByte();
        int tablePrice=110;

        if (numberOfTables>0 && numberOfTables<10) {
            System.out.println("Your total will be : " + numberOfTables * 110);
            System.out.println("You will get no discount");
        }else if(numberOfTables>=10 && numberOfTables<15) {
            int discountAmount = numberOfTables * 110 * 10 / 100;
            System.out.println("Your discount amount is: $ " + discountAmount);
            System.out.println("Your total will be : $ " + (numberOfTables * 110 - discountAmount));

        }else if (numberOfTables>=15 && numberOfTables<20) {
            int discountAmount = numberOfTables * 110 * 20 / 100;
            System.out.println("Your discount amount is: $ " + discountAmount);
            System.out.println("Your total will be : $" + (numberOfTables * 110 - discountAmount));
        }else if (numberOfTables>=20) {
            int discountAmount = numberOfTables * 110 * 25 / 100;
            System.out.println("Your discount amount is : $ " + discountAmount);
            System.out.println("Your total will be : $ " + (numberOfTables * 110 - discountAmount));
        }else {
            System.out.println("Your number is invalid");


        }

    }
}
