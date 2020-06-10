package operatorsandstatements.forloops;

import java.util.Scanner;

public class ForLoop4 {
    public static void main(String[] args) {
        /*
        String str="Techtorial Academy";
        T
        e
        c
        h
        .
        .
        .
        e
        m
        y
         */
        Scanner input=new Scanner(System.in);
        System.out.println("What is your string");
        String str=input.nextLine();

        int i=str.length()-1;           // Last character

        for(i=str.length()-1; i>=0; i--){
           // System.out.println(i);    // if you want to order index numbers from last to first
            System.out.println(str.charAt(i));
        }


        }

    }

