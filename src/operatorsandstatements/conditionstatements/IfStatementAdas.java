package operatorsandstatements.conditionstatements;

import java.util.Scanner;

public class IfStatementAdas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
        String userName = input.nextLine();
        if (userName.equals("Ismail")) {
            System.out.println("ooooo adas hosgeldin!!!");
            System.out.println("oooooo hos bulduk");
        } else if (userName.equals("Ahmet")) {
            System.out.println("Ahmet nbr. Ahmet ismini cok severim.");
        } else {

            System.out.println("" + userName + " Hos geldiniz!");
        }
    }
}


