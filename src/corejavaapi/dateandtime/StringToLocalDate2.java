package corejavaapi.dateandtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate2 {
    public static void main(String[] args) {
        /**
         * Create the String value of "4/22/2020;
         * Convert String to LocalDate object
         * Format the local date object to 04 April,2020
         * 1.Convert String to LocalDate object
         * 2.Use the parse method to convert
         * 3. Create new
         */
        String date="4/22/2020";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("M/dd/yyyy");
        LocalDate localDate=LocalDate.parse(date,dateTimeFormatter);
        System.out.println(localDate);
        // 22 April,2020
        DateTimeFormatter expected=DateTimeFormatter.ofPattern("dd MMMM, yyyy");
        System.out.println(expected.format(localDate));
    }
}
