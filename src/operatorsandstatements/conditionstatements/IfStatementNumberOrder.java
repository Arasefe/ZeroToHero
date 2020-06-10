package operatorsandstatements.conditionstatements;

import java.util.Scanner;
/*
TASK Using Scanner enter 4 different numbers.
Print the numbers from smallest to biggest one.
int first = 10;
int second=5;
int third=3;
ont fourth=8;
Pseudo
first>second --->change the places if not bigger than leave as it is.
first>third ----> change the places if not bigger than leave as it is
first>fourth ---->change the places if not bigger than leave as it is.
second>third---->change the places if not leave as it is
second>fourth---->change the places if not leave as it is
third>fourth-----> change the places if not leave as it is
 */
public class IfStatementNumberOrder {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter 4 numbers consecutively ");
        int first=input.nextInt();          //10---->5
        int second= input.nextInt();        //5------>10
        int third=input.nextInt();          //4----
        int fourth=input.nextInt();

        if (first>second){
            int temp=first;
            first=second;
            second=temp;
        }
        if (first>third){
            int temp=first;
            first=third;
            third=temp;
        }
        if (first>fourth){
            int temp=first;
            first=fourth;
            fourth=temp;
        }
        if (second>third){
            int temp=second;
            second=third;
            third=temp;
        }
        if (second>fourth){
            int temp=second;
            second=fourth;
            fourth=temp;
        }
        if (third>fourth){
            int temp=third;
            third=fourth;
            fourth=temp;
        }
        System.out.println(fourth+"\n"+third+"\n"+second+"\n"+first);
    }
}
