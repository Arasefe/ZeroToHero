package operatorsandstatements.conditionstatements;

import java.util.Scanner;

public class IfStatementComparison {
    // in order to run the code we are supposed to use main method
    public static void main(String[] args) {
        int currentSpeed = 80;
        int speedLimit = 70;
        boolean increaseSpeed = currentSpeed < speedLimit;
        boolean decreaseSpeed = currentSpeed > speedLimit;
        System.out.println("Should i increase the speed?" + increaseSpeed);
        System.out.println("Should i decrease the speed?" + decreaseSpeed);
        alternate1();
        alternate2();
        // TASK
        /* Room temperature 75;
        Room expectedTemp =72;
        check two different conditions and increase or decrease
         */
    }

    public static void alternate1() {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperature?: ");
        int temperature = input.nextInt();
        int expectedTemp = 72;
        if (temperature < expectedTemp) {
            System.out.println("Increase the temperature");
        } else if (temperature == expectedTemp) {
            System.out.println("Temperature is equal to expected temperature");
        }
        // event age should be more than 18
        // if age is less than 18, child must have parental consent


    }

    public static void alternate2() {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your age?: ");
        int participantAge = input.nextInt();
        System.out.print("Do you have parental consent: Yes or No?");
        String parentalConsent = input.next();
        if (participantAge < 18 && parentalConsent.equals("Yes")) {
                System.out.println(" You are younger than 18, but you have parental consent. Welcome to the event. ");
            } else if (participantAge >= 18) {
                System.out.println(" Welcome to the event.");
            } else {
                System.out.println("Sorry, you are not allowed to participate this event");
            }
        }
    }