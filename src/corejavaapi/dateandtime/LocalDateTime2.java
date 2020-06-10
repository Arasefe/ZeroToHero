package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTime2 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());        //This method will print current date
        System.out.println(LocalTime.now());        // This method will print current time
        System.out.println(LocalDateTime.now());    // This method will print date and time

        LocalDate date=LocalDate.now();
        //return type of now is LocalDate object. We can assign our reference type.
        //LocalDate has a constructor but this is private
        // I can not access out of LocalDate class
        // LocalDate date1=new LocalDate();
        // You cannot create object using new keyword for LocalDate, LocalTime, and LocalDateTime

        System.out.println("Date is "+date);
        /**
         * of(int year,Month month,int day);
         * of(int year,int month,int day);
         */
        LocalDate date1=LocalDate.of(2020,01,07);
        System.out.println(date1);
        LocalDate date2=LocalDate.of(2020, Month.JANUARY,05);
        System.out.println(date2);

        LocalTime time=LocalTime.of(1,34);
        System.out.println(time);
        LocalTime time1=LocalTime.of(2,45,56);
        System.out.println(time1);
        LocalTime time2=LocalTime.of(4,34,23,343454557);
        System.out.println(time2);
        /**
         * LocalDateTime.now()-->2020,APRIL,15
         */
        LocalDateTime dateTime=LocalDateTime.of(2012,Month.APRIL,15,12,56);
        System.out.println(dateTime);
        LocalDateTime dateTime1=LocalDateTime.of(date1,time);
        System.out.println(dateTime1);
        /*
        LocalTime
        --->now();

         */
        LocalDateTime dateTime2=LocalDateTime.of(LocalDate.now(),LocalTime.now());
        System.out.println(dateTime2);


    }
}
