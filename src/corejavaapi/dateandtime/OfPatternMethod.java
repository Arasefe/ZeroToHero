package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class OfPatternMethod {
    public static void ofPatternMethod(){
        /*
        April                                                               December
        MMMM-->It will give full name                                       December
        MMMM-->It will give short name of April (Apr)                       Dec
        MM---->It will give the number of your month(04)                    12
        M----->It will give the number of month(4)                          12

        2020                                                                DAY         06        15
        YYYY--->2020                                                        dd--->      06        15
        YYY---->2020                                                        d---->      6         15
        YY----->20
        Y------>2020

        hour                                                                minute      04          25
        hh---->10           05                                              mm          04          25
        h----->10           5                                               m           4           25

         */

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("MMMM yyyy, dd | hh:mm");
        LocalDateTime time=LocalDateTime.now();
        dateTimeFormatter.format(time);
        System.out.println(dateTimeFormatter.format(time));
        /*
        Format the current date with following pattern 2020/04/Jan
         */

        DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("YYYY/dd/MMM");                // Month must be Capital Letters
        LocalDate date=LocalDate.now();
        date.plusDays(10).plusMonths(4);
        System.out.println(dateFormat.format(LocalDate.now()));

    }

    public static void main(String[] args) {
        ofPatternMethod();
    }
}
