package corejavaapi.dateandtime;

import java.time.LocalDateTime;

public class Manipulation7 {
    public static LocalDateTime addLocalDateTime(LocalDateTime dateTime){
        System.out.println(dateTime);
        dateTime=dateTime.plusYears(43).plusMonths(1).plusWeeks(3).plusDays(4).plusHours(5).plusMinutes(6);
        System.out.println(dateTime);
        return dateTime;
    }

    public static void main(String[] args) {
        addLocalDateTime(LocalDateTime.of(1977,1,1,9,34));
    }
}
