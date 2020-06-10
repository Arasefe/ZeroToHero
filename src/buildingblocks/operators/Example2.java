package buildingblocks.operators;


import java.util.Scanner;

// enter a number that is even and less than 100
public class Example2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Please enter a even number less than 100: "); // if please enter an even number or less than 100
        // int number = 25;
        int number = input.nextInt();
        System.out.println("Entered number is " + number);
        boolean result = number % 2 == 0;    // first condition
        boolean result2 = number< 100;      // second condition

        System.out.println("Enter number is " + (result && result2));       // System.out.println("Enter number is " + (result || result2));



    }
}
