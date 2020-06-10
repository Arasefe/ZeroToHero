package operatorsandstatements.conditionstatements;

import java.util.Scanner;

public class IfStatementStudentNumber {
    public static void main(String[] args) {
        //  int apples = 15;
        // int banana = 21;
        // this condition is true
        //  if (banana > apples) {
        //    System.out.println("We have more bananas than apples");
        // } else {
        //    System.out.println("We have more apples than bananas");
        //  }
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of students:");
        int numberOfStudents = input.nextInt();

        System.out.println("Please enter the capacity of class: ");
        int capacityOfClass = input.nextInt();

        if (capacityOfClass > numberOfStudents) {
            System.out.println("You are welcome to class");
        }
        else if (numberOfStudents == capacityOfClass) {
            System.out.println("Our class is full now");
        }
        else {
            System.out.println("We can not accept " + numberOfStudents + "As we have less capacity in the class");
        }
    }
}


