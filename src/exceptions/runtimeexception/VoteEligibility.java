package exceptions.runtimeexception;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class VoteEligibility {
    public static void main(String[] args) throws Exception, Error {
        int age;
        Scanner input=new Scanner(System.in);
        System.out.println("How old are you?");
        age=input.nextInt();
        if (age >=18) {

            System.out.println("You are eligible to vote.");
        }else{
            throw new RuntimeException("You are not eligible to vote!");
        }
        System.out.println("After if statement");

    }


}
