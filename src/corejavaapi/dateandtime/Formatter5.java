package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatter5 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of(1977, Month.JANUARY,1);
        LocalTime time=LocalTime.of(9,15);
        LocalDateTime dateTime= LocalDateTime.of(date,time);

        DateTimeFormatter mediumF=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(mediumF.format(dateTime));


    }
}
