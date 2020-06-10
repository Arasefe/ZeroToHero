package corejavaapi.stringpractice;

import java.util.Scanner;

public class DataVerification {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the date with mm/dd/yyyy format");
        String data1= input.nextLine();
        System.out.println("Please enter the date with mm-dd-yyyy format");
        String data2= input.nextLine();
        data1=data1.replace('/','-');
        boolean result= data1.equals(data2);
        System.out.println("Two result is " + result);

    }
}
