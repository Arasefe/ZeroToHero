package operatorsandstatements.whileloop;

import java.util.Scanner;

public class WhileLoop15 {
    public static void main(String[] args) {
        /*
        // i want to print my name 5 times
         */
        Scanner input=new Scanner(System.in);
        System.out.println("How many times do you want to print?");
        int number=input.nextInt();
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=scanner.nextLine();

        while (number>0){
            System.out.println(name);
            number--;
        }
        System.out.println("YASA MUSTAFA KEMAL PASA YASA.");
    }

}
