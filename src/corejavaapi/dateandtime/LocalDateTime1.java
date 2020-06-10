package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalDateTime1 {
    public static void method(){
        LocalDate now=LocalDate.now();
        LocalDateTime now1=LocalDateTime.now();
        LocalTime time=LocalTime.now();

        DateTimeFormatter format1=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter format2=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        DateTimeFormatter format3=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(format1.format(now));
        System.out.println(format2.format(now));
        System.out.println(format3.format(now));
        System.out.println(format1.format(now1));
        System.out.println(now1);       //date and time together
        //System.out.println(format1.format(time)); unsupported type exception

        DateTimeFormatter format4=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(format4.format(time));
        System.out.println(format4.format(now));

        DateTimeFormatter format5=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);







    }

    public static void main(String[] args) {
        method();
    }
}
