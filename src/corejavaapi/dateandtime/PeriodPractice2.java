package corejavaapi.dateandtime;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PeriodPractice2 {
    public static void durationMethod(){
        Period days= Period.ofDays(20);
        System.out.println(days);
        Period weeks=Period.ofWeeks(3);
        System.out.println(weeks);
        Period months=Period.ofMonths(6);
        System.out.println(months);
        Period years=Period.ofYears(1);
        System.out.println(years);

        // After 1 year, 6 months and 29 days, i will have graduated from Master

        Period fullDate=Period.of(1,6,20);
        System.out.println(fullDate);

        // After 1 year, 6 months and 29 days, i will have graduated from Techtorial
        Period fullDate2=Period.of(0,6,5);
        System.out.println(fullDate2);


        Period fullDate1=Period.ofYears(1).ofMonths(4).ofWeeks(3);     // Method chaining is OCA exam question
        System.out.println(fullDate1);                                  //we do not have method chaining in period if chain, value will be last one.

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        DateTimeFormatter dateFormat=DateTimeFormatter.BASIC_ISO_DATE;
        dateFormat.format(LocalDate.now());
        System.out.println(dateFormat.format(LocalDate.now()));
        //System.out.println(dateFormat.format(LocalTime.now()));     // WILL THROW UNSUPPORTED TEMPORAL TYPE EXCEPTION

        DateTimeFormatter formatTime=DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(formatTime.format(LocalTime.now()));

        DateTimeFormatter formatTime1=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //System.out.println(formatTime1.format(LocalTime.now()));

    }

    public static void main(String[] args) {
        durationMethod();
    }
}
