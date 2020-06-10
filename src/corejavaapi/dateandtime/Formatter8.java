package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Formatter8 {
    public static void main(String[] args) {
        LocalDate newYears=LocalDate.of(2017,1,1);
        Period period=Period.ofDays(1);
        DateTimeFormatter f=DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println(f.format(newYears.minus(period)));
    }
}
