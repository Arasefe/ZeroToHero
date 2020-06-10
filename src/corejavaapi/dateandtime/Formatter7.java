package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Formatter7 {
    public static void formatterMethod(){
        DateTimeFormatter f= DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date= LocalDate.parse("01 02 2015",f);
        System.out.println(date);
        LocalTime time= LocalTime.parse("09:15");
        System.out.println(time);

    }

    public static void main(String[] args) {
        formatterMethod();
    }
}
