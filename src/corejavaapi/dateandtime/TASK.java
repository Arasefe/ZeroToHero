package corejavaapi.dateandtime;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TASK {
    public static void main(String[] args) {
        /*
        TASK
        GIVEN THE FOLLOWING STRING FORMAT OF DATE AND TIME "15 05 2018 14:13"
        Convert String to DateTime Object
        After object create following date time structure 5/15/2018-14:33
         */

        String date="15 05 2018 14:13";
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd MM yyyy HH:mm");
        LocalDateTime localDate= LocalDateTime.parse(date,dateTimeFormatter);
        System.out.println(localDate);
        // 15 05 2018 14:13
        DateTimeFormatter expected=DateTimeFormatter.ofPattern("M/dd/yyyy-HH:mm");
        System.out.println(expected.format(localDate));
        //System.out.println(DateTimeFormatter.ofPattern("M/dd/yyyy-HH:mm").format(localDate));

    }
}
