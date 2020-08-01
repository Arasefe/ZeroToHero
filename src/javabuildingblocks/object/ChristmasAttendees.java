package javabuildingblocks.object;

public class ChristmasAttendees {
    // Variables
    String name;
    String giftName;

    // Constructors---->have to be the same name as class
    public ChristmasAttendees() {

    }

    public ChristmasAttendees(String name, String giftName) {
        this.name = name;
        this.giftName = giftName;
    }

    // Methods
        public static void giftExchange(ChristmasAttendees attendee1, ChristmasAttendees attendee2) {
            boolean hasGift=true;
            String temp = attendee1.giftName;
            attendee1.giftName =attendee2.giftName;
            attendee2.giftName = temp;
            if(!hasGift){
                attendee1.giftName=attendee1.giftName;
                attendee2.giftName=attendee2.giftName;
            }
        }


    public static void updateGift(String attendee1, String newGift){
    /*
    Create updateGift method which will accept two parameters ChristmasAttendees object and
    String newGift and will set newGift value to gift variable of ChristmasAttendees object.
     */


    }
}


