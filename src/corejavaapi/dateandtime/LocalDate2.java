package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.Month;

public class LocalDate2 {
    public static void localDateMethod(){
        LocalDate localDate= LocalDate.of(2020,1,8);
        LocalDate localDate1=LocalDate.of(2020, Month.JANUARY,8);
        LocalDate localDate2=LocalDate.now();

        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);

    }

    public static void main(String[] args) {
        localDateMethod();
    }
}
