package operatorsandstatements.conditionstatements;

import java.util.Scanner;

public class IfStatementMexicoFlight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a ticket?");
        String ticket = input.nextLine();
        System.out.println("Do you have a passport?");
        String passportStatus = input.nextLine();
        System.out.println("How much do you have?");
        int moneyAmount = input.nextInt();
       // Scanner scanner=new Scanner(System.in);

        if (ticket.equalsIgnoreCase("Yes") && moneyAmount >= 200 && passportStatus.equalsIgnoreCase("Yes"))
        {
            System.out.println("You can go to Mexico");
        }

        else if (ticket.equalsIgnoreCase("No") && moneyAmount >= 200 && passportStatus.equalsIgnoreCase("Yes"))
        {
            System.out.println("You need a ticket");
        }
        else if (ticket.equalsIgnoreCase("Yes") && moneyAmount >= 200 && passportStatus.equalsIgnoreCase("No"))
        {
            System.out.println("You need a passport");
        }

        else if (ticket.equalsIgnoreCase("Yes") && moneyAmount < 200 && passportStatus.equalsIgnoreCase("Yes"))
        {
            int additionalMoney=200-moneyAmount;
            System.out.println("You need more money. The amonut is " + additionalMoney);
        }
        else {
            System.out.println("Go kill yourself");
        }
    }
    }


