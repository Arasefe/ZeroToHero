package operatorsandstatements.whileloop;

import java.util.Scanner;

public class WhileLoop9 {
    public static void reversed() {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a string");        //5
        String str= input.nextLine();

        String reversed= "";
        int length=str.length()-1;                          //4

        while (length>=0){                                  //4
            reversed+=str.charAt(length);                   //4,3,2,1,0---->
            length--;
        }
        System.out.println("Reversed value is " + reversed);

    }


    public static void main(String[] args) {
        reversed();
    }
}
