package operatorsandstatements.switchstatement;

import java.util.Scanner;

public class SwitchStatement2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your student number");
        int studentNumber=input.nextInt();
//        int studentNumberMuammer=123;
//        int studentNumberArslan=223;
//        int studentNumberTima=456;
        switch (studentNumber){
            case 123:
                System.out.println("What is your last name?");
                String lastName=input.next();
                if (lastName.equalsIgnoreCase("Turan")){
                    System.out.println("Your lat name is " + lastName);
                }
                break;
            case 223:
                System.out.println(("How old are you?"));
                int userAge=input.nextInt();
                if (userAge==22) {
                    System.out.println("Your age is " + userAge);
                }
                break;
            case 456:
                System.out.println("Where do you live");
                String userPlace=input.nextLine();
                if (userPlace.equalsIgnoreCase("Sky")){
                    System.out.println("Great, i am living there as well");
                }
                break;
            default:
                System.out.println("Please enter correct student number");


        }
    }
}
