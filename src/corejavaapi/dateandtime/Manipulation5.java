package corejavaapi.dateandtime;

import java.time.LocalTime;

public class Manipulation5 {
    public static LocalTime addTime(LocalTime time){
        System.out.println(time);
        time=time.plusHours(3).plusMinutes(30);
        System.out.println(time);
        return time;
    }

    public static void main(String[] args) {
        addTime(LocalTime.now());
    }
}
