package operatorsandstatements.conditionstatements;

import java.util.Scanner;

public class IfStatementJerseyNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your jersey number?");
        int jerseyNumber=input.nextInt();
        if (jerseyNumber%2==0 && jerseyNumber>0) {
            System.out.println("Your jersey number is even");
        }else if (jerseyNumber%2==1) {
            System.out.println("Your jersey number is odd");
            // if the jersey number is 0 or negative number, then print a message your number is invalid


            /*   int result= (jerseyNumber<0 || jerseyNumber=0);
        }else if (result= true);
            System.out.println("Your jerseyNumber is invalid");
            */



            }
       // }else if (jerseyNumber<0 && jerseyNumber=0){


            System.out.println("Your jerseyNumber is invalid");
        }
        }
