package corejavaapi.stringpractice;

import java.util.Scanner;

public class MethodEquality {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the first input in format of 6.10% of 26.5%");
        String str1=input.nextLine();
        System.out.println("Please enter the second input in format of 6.10 - 26.5");
        String str2=input.nextLine();
        str1=str1.replace("%","").replace("of","-").trim();
        System.out.println(str1);
        boolean result=str1.equals(str2);
        System.out.println("Both string value is matching? " + result);



    }
}
