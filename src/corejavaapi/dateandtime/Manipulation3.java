package corejavaapi.dateandtime;

import java.time.LocalDateTime;

public class Manipulation3 {
    public static void manipulationMethod(){
        LocalDateTime dateTime=LocalDateTime.of(2020,01,12,20,45);

        dateTime=dateTime.plusYears(3).plusMonths(8).plusWeeks(3).plusDays(4);
        System.out.println(dateTime);
        dateTime=dateTime.plusHours(5).plusMinutes(34);
        System.out.println(dateTime);
    }

    public static void main(String[] args) {
        manipulationMethod();
    }
}
