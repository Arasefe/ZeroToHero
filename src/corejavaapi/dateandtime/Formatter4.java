package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatter4 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of(2020, Month.JANUARY,20);
        LocalTime time=LocalTime.of(11,22,34);
        LocalDateTime dateTime= LocalDateTime.of(date,time);
        System.out.println(dateTime);
        DateTimeFormatter shortF=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(shortF.format(dateTime));
    }
}
