package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Formatter6 {
    public static void formatterMethod(){
        DateTimeFormatter f=DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date=LocalDate.parse("01 02 2015",f);
        System.out.println(date);



    }

    public static void main(String[] args) {
        formatterMethod();
    }
}
