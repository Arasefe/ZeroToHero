package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.Month;

public class Manipulation4 {
    public static LocalDate addDay(LocalDate date){
        System.out.println(date);
        date=date.plusDays(21);
        System.out.println(date);
        return date;
    }

    public static void main(String[] args) {
        addDay(LocalDate.of(2020,Month.JANUARY,21));
    }

}
