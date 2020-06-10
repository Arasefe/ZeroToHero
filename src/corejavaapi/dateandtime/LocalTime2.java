package corejavaapi.dateandtime;

import java.time.LocalTime;

public class LocalTime2 {
    public static void localTimeMethod(){
        LocalTime localTime=LocalTime.of(13,45);
        LocalTime localTime1=LocalTime.of(13,45,58);
        LocalTime localTime2=LocalTime.of(13,45,58,1000);
        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);


    }

    public static void main(String[] args) {
        localTimeMethod();
    }
}
