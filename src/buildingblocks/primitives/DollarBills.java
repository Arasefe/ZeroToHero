package buildingblocks.primitives;

public class DollarBills {
   public static void main (String[]args){
        int value=999;
        int hundredDollarBill=value/100;  //2
        int hundredDollarRemainder= value%100; //98
        int fiftyDollarBill=hundredDollarRemainder/50;  //1
        int fiftyDollarRemainder=hundredDollarRemainder%50; //48
        int twentyDollarBill=fiftyDollarRemainder/20;  //2
        int twentyDollarRemainder=fiftyDollarRemainder%20; //8
        int tenDollarBill=twentyDollarRemainder/10;  //0
        int tenDollarRemainder=twentyDollarRemainder%10;  //0
        int fiveDollarBill=tenDollarRemainder/5;  // 1
        int fiveDollarRemainder=tenDollarRemainder%5;  // 3
        int oneDollarBill=fiveDollarRemainder/1;
        int oneDollarRemainder=fiveDollarRemainder%1;
        System.out.println("The value is " + value);
        System.out.println("Hundred dollar bill quantity is " + hundredDollarBill);
        System.out.println("Fifty dollar bill quantity is " + fiftyDollarBill);
        System.out.println("Twenty dollar bill quantity is " + twentyDollarBill);
        System.out.println("Ten dollar bill quantity is " + tenDollarBill);
        System.out.println("Five dollar bill quantity is " + fiveDollarBill);
        System.out.println("One dollar bill quantity is " + oneDollarBill);




   }
}
