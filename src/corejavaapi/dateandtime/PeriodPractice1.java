package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodPractice1 {
    public static void practice(){
        LocalDate date= LocalDate.of(1977, Month.JANUARY,1);
        Period period= Period.of(43,1,14);
        System.out.println(date.plus(period));
        
    }

    public static void main(String[] args) {
        practice();
    }
}
