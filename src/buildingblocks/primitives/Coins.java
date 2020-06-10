package buildingblocks.primitives;

public class Coins {
    public static void main(String[]args){

        /*

            GIVEN WHOLE VALUE FROM 1 TO 99
            QUARTER-25,
            DIME-10,
            NICKEL-5,
            PENNY-1
        */
            int value=98;
            int quarters = value/25; // 3
            int quarterRemainder= value % 25; //23,
            int dimes= quarterRemainder/10; //2 dimes
            int dimesRemainder=quarterRemainder%10; // 23%10 =3,
            int nickels=dimesRemainder /5; // 0
            int nickelRemainder=dimesRemainder%5; //3
            int pennies=nickelRemainder/1; //3,
            int penniesRemainder=nickelRemainder%1;
            System.out.println("The value is " + value);
            System.out.println("Quarter is " + quarters);
            System.out.println("Dimes is " + dimes);
            System.out.println("Pennies is " + pennies);


    }
}
