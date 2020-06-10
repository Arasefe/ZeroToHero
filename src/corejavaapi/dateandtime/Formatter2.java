package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatter2 {
    public static void method(){
        /**
         * String date="04 Apr 1982";--->"dd MMM YYYY";
         * To be able to convert String to Date object we have to use parse method
         * 1. Define your format
         * DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd MMM YYYY");
         */
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd MMM yyyy");
        String date="04 Apr 1982";
        LocalDate localDate=LocalDate.parse(date,dateTimeFormatter);
        System.out.println(localDate);
    }

    public static void main(String[] args) {
        method();
    }
}
