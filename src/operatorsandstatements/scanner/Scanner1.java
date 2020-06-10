package operatorsandstatements.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println("Welcome to BoA "+ name);
        System.out.println("What is your date of birth");
        int dateOfBirth=scanner.nextInt();
        scanner.nextLine();                                 //
        int age=2020-dateOfBirth;
        System.out.println("You are "+age+ " years old and there is long way to live");
    }
}
