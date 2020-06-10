package corejavaapi.dateandtime;

import java.time.LocalDate;

public class Manipulation2 {
    public static void manipulationMethod(){
        LocalDate date= LocalDate.now();
        System.out.println(date);
        date=date.plusYears(12);
        System.out.println(date);
        date=date.plusMonths(7);
        System.out.println(date);
        date=date.plusWeeks(7);
        System.out.println(date);
        date=date.plusDays(34);
        System.out.println(date);
    }

    public static void main(String[] args) {
        manipulationMethod();
    }
}
