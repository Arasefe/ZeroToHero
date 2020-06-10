package corejavaapi.stringpractice;

import java.util.Scanner;
        /* enter first and last name and make sure both starts with capital letters

         */
public class FindUpperCases_important {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your full name");  // Ismail YILDIRIM
        String fullName=input.nextLine();
        char firstLetter=fullName.charAt(0);                // I
        int indexNumber=fullName.indexOf(" ")+1;            // Location of the first letter of last name
        char lastNameLetter= fullName.charAt((indexNumber));
        System.out.println("First letter " + firstLetter+ "Last name first letter " + lastNameLetter);
        String actualFirstLetter= ""+firstLetter;           // Making String in this line because string is immutable
        String actualLastNameLetter=""+lastNameLetter;      // Making String in this line because string is immutable
        String expectedFirstLetter=actualFirstLetter.toUpperCase();
        String expectedLastNameLetter=actualLastNameLetter.toUpperCase();
        boolean result=actualFirstLetter.equals(expectedFirstLetter) && actualLastNameLetter.equals(expectedLastNameLetter);
        System.out.println("They are starting with upper case or not? " + result);
    }
}
