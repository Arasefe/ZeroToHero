package corejavaapi.stringpractice;

import java.util.Scanner;

public class Planet {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your planets name");
        String planetName = input.nextLine();
        int result=planetName.length();
        System.out.println(result);

        System.out.println("First char " + planetName.charAt(0));
        System.out.println("Last char " +planetName.charAt(planetName.length()-1));
        System.out.println("Middle Char " + planetName.charAt((planetName.length()-1)/2));
        System.out.println("First k " + planetName.indexOf("k"));
        System.out.println("Second k " + planetName.indexOf("k",3));
        // makameke---
        //
        //
        // 1. find out the index number of first k--->planetName.indexOf("k")+1---->int 3
        // mapkeleke----> planetName.indexOf("k")+1;---->4
        // kaka---> planetName.indexOf("k")+1------>1
        System.out.println("first k" + planetName.indexOf("k"));
        System.out.println("Second k"+ planetName.indexOf("k",planetName.indexOf("k")+1));




    }
}
