package corejavaapi.arraypractice;

import java.util.Arrays;

public class SplitMethodWithDot {
    public static void main(String[] args) {
        /*

         */
        String jv="Array.is.today's.topic";
        String []arr=jv.split("\\.");
        for (String ar:arr){

        }
        System.out.println(Arrays.toString(arr));       // returns [] so we have to use \\
    }
}
