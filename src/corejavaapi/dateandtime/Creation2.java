package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Creation2 {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2015,2,14);
        LocalTime time1=LocalTime.of(2,15,34);
        LocalDateTime dateTime1=LocalDateTime.of(2020,2,14,2,17,25);
        System.out.println(date1);
        System.out.println(time1);
        System.out.println(dateTime1);
    }
}
