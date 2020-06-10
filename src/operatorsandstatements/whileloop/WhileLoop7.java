package operatorsandstatements.whileloop;

import java.util.Scanner;

public class WhileLoop7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=input.nextLine();
        int indexNumber=name.length()-1;
        while (indexNumber>=0){
            System.out.println(name.charAt(indexNumber));
            indexNumber--;

        }

    }
}
