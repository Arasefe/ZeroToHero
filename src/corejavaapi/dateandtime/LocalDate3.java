package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate3 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        date.plusDays(2);
        date.plusMonths(3);
        date.plusYears(1);
        date.plusWeeks(4);
        System.out.println(date);

    }
}
