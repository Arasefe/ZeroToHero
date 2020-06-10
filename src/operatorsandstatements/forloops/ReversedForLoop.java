package operatorsandstatements.forloops;

import java.util.Scanner;

public class ReversedForLoop {
    public static void main(String[] args) {
        /*Print Techtorial Acadmy last char to first char.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("What is the string that you want to reverse: ");
        String str=input.nextLine();
        String reversed="";

        int length=str.length()-1;         // Last character
        int i;
        for (i=length;i>=0;i-- ){          // Decrement the i until it reaches to 0 which is the first character of the string.
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);
    }

}
