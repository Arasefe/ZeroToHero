package corejavaapi.dateandtime;

import java.time.LocalTime;

public class LocalTime1 {
    public static void localTimeMethod(){
        LocalTime localTime=LocalTime.of(6,15);                                 // hour and minute

        LocalTime localTime1=LocalTime.of(6,15,30);                     // hour , minute, seconds

        LocalTime localTime2= LocalTime.of(6,15,30,200);   // hour, minute, second and nano-second

        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);

    }

    public static void main(String[] args) {
        localTimeMethod();
    }
}
