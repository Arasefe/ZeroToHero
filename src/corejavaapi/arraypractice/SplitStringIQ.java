package corejavaapi.arraypractice;

import java.util.Arrays;

public class SplitStringIQ {
    public static void main(String[] args) {
        /*
        String str=“Today is a beautiful day”;
        Return type of split method is array.
        String [] words=str.split(“ “);——>return type is array
        System.out.println(Arrays.toString(words));
        [Today,is,a,beatiful,day];

        Exp
        String date=“15-5-2019:12.45”;
        Validate 2019
         */
        String date="11-7-2019-12.45";
        String [] values=date.split("-");
        System.out.println(Arrays.toString(values));
        if (values[2].equalsIgnoreCase("2019")){
            System.out.println("The year is 2019");
        }
        else {
            System.out.println("The year is not 2019");
        }
    }
}
