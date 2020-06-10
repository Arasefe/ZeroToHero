package operatorsandstatements.whileloop;

import java.util.Scanner;

public class WhileLoop5 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the phone price amount: ");

        int offeredAmount=input.nextInt();

        int expectedAmount=800;

        while (offeredAmount<expectedAmount){

            int difference=expectedAmount-offeredAmount;

                System.out.println("Please enter the amount of "+ difference);

                int restAmount=input.nextInt();

                offeredAmount+=restAmount;

            }
             System.out.println("You can enjoy IPhone");
        }

    }

