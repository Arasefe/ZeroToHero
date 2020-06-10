package javabuildingblocks.object;

public class ChristmasAttendeesTest {
    public static void main(String[] args) {
        ChristmasAttendees temp= new ChristmasAttendees();
        ChristmasAttendees attendee1 = new ChristmasAttendees("John", "Photo Frame");
        ChristmasAttendees attendee2 = new ChristmasAttendees("Kate", "Computer Keyboard");

        ChristmasAttendees.giftExchange(attendee1, attendee2);
        System.out.println("John has a gift of : " +attendee1.giftName);
        System.out.println("Kate has a gift of : " + attendee2.giftName);


        ChristmasAttendees ismail = new ChristmasAttendees("Ismail", null);
        ChristmasAttendees omer = new ChristmasAttendees("Omer", "diamond");
        ChristmasAttendees.giftExchange(attendee1, attendee2);

        System.out.println("Ismail has a gift of : " + ismail.giftName);
        System.out.println("Omer has a gift of : " + omer.giftName);

        ChristmasAttendees.giftExchange(ismail,omer);
        System.out.println("I have no gift but thank you though");
       ChristmasAttendees.updateGift("temp","canta");
    }
}
