package operatorsandstatements.conditionstatements;

import java.util.Scanner;

public class IfStatementNameLength {
    public static void main(String[] args) {
        /*create an app will ask from the user his name and will check the number of characters in the name and
         if it is less than 5 it will give the message Characters is less than 5. Else it will give the message
         your name characters are more than 5
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your name?");
        String name = input.next();

        System.out.println("Your name is " + name);
        System.out.println(name.length());  // java can find the characters of the given string with str.length method.
        if (name.length() <5) {
            System.out.println("Your name has less than 5 character ");
        }else if (name.length()>5){
            System.out.println("Your name has more than 5 characters");
        }
    }
}
