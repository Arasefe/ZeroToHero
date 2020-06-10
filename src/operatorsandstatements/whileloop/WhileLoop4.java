package operatorsandstatements.whileloop;

import java.util.Scanner;

public class WhileLoop4 {
    public static void main(String[] args) {
        /*30 usd depositt amoun
        2$ perusage
        use while loop to find the total number of usage
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your deposit: ");
        int depositAmount=input.nextInt();
        int cost=2;
        int totalUsage=0;
        while (depositAmount>=cost){
            totalUsage++;
            depositAmount=depositAmount-cost;
        }
        System.out.println("You have the total usage of " + totalUsage);
    }
}
