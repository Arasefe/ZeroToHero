package buildingblocks.primitives;

public class AssignmentOperators {
    public static void main(String[]args){
        // flight ticket cost at 12 pm
        int flightTicket= 200;

        System.out.println("Flight price at 12pm $" + flightTicket); // 300
        // flight ticket cost at 2 pm
        flightTicket=300;
        System.out.println("Flight price at 2pm $" + flightTicket); // 300

        // flight ticket cost at 4 pm
        flightTicket=flightTicket+50;
        System.out.println("Flight price at 4pm $" + flightTicket); // 350

        // flight ticket cost at 6pm +50
        flightTicket+=50; //         flightTicket=flightTicket+50;

        System.out.println("Flight price at 6pm $" + flightTicket); // 400

        // flight ticket cost at 8 pm
        flightTicket-=150; // ----->flightTicket=flightTicket-150
        System.out.println("Flight price at 8pm $" + flightTicket); // 250



        int bookPrice=5;
        bookPrice*=4;  //---->bookPrice=bookPrice*4;  //20
        // bookPrice is $20
        bookPrice/=4;  //----> bookPrice=bookPrice/4;  // 5
        //bookPrice is $ 4
        bookPrice %= 3;   // ----> bookPrice=bookPrice%3; //4%3=1
        bookPrice+=1;   //------> bookPrice=bookPrice+1
        bookPrice-=2;   //-------> bookPrice=bookPrice-2

        System.out.println(bookPrice);
        /*
        short numberA=8;
        int numberB=7;
        int numberResult=numberA+numberB;
        System.out.println(numberResult);



        // JAVA WILL AUTOMATICALLY ASSIGN INT
        */
    }
}
