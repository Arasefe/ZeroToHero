package corejavaapi.dateandtime;

import java.time.LocalDateTime;
import java.time.Month;

public class Manipulation6 {
    public static LocalDateTime add(LocalDateTime dateTime){
        System.out.println(dateTime);
        dateTime=dateTime.plusYears(1).plusMonths(2).plusWeeks(3).plusHours(4).plusMinutes(5);
        System.out.println(dateTime);
        return dateTime;
    }

    public static void main(String[] args) {
        add(LocalDateTime.now());
    }
}
