package corejavaapi.dateandtime;

import java.time.LocalDate;

public class Manipulation1 {
    public static void manipulationMethod(){
        LocalDate date=LocalDate.now();
        date=date.plusDays(20);
        System.out.println(date);
        /*
        Date and Time objects are immutable. Once you use the methods it will not change your original value
         until you reassign them.
         06/12/1976
         */
        date=date.minusYears(43).minusMonths(7).minusDays(16);

        System.out.println("My birth date is "+date);

    }

    public static void main(String[] args) {
        manipulationMethod();
    }
}
