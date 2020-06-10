package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatter1 {
    /**
     * How to convert Date to String
     * LocalDate now=LocalDate.now();
     * String date=""+now;
     * How to convert String to Date?
     * String date="26 Apr 2018";--->"dd MMM YYYY";
     * TO be able to convert String to Date object we have to use parse method
     * 1. Define your format
     * DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd MMM YYYY");
     */
    public static void main(String[] args) {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd MMM yyyy");
        String date="24 Apr 2020";
        // Convert String to Date Object
        LocalDate localDate=LocalDate.parse(date,f);
        System.out.println(localDate);
        // TASK Change the format of localDate (2020-04-24) to April 24, 2020

//        DateTimeFormatter fr=DateTimeFormatter.ofPattern("MMMM dd, YYYY");
//        System.out.println(fr.format(localDate));
    }

}
