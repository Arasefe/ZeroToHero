package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate1 {
    public static void localDateMethod(){
        LocalDate localDate= LocalDate.of(2018,11,23);

        LocalDate localDate1=LocalDate.of(2018, Month.JANUARY,25);

        System.out.println(localDate);

        System.out.println(localDate1);

        LocalDate localDate2=LocalDate.now();

        System.out.println(localDate2);

    }

    public static void main(String[] args) {
        localDateMethod();
    }
}
