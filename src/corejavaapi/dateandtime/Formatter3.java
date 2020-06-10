package corejavaapi.dateandtime;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.time.LocalDate.parse;

public class Formatter3 {
    public static void formatter(){
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd MMM yyyy");
        String date="01 Jan 1977";
        LocalDate localDate=LocalDate.parse(date,dateTimeFormatter);
        System.out.println(localDate);

    }

    public static void main(String[] args) {
        formatter();
    }
}
