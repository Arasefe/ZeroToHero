package corejavaapi.dateandtime;

public class Conversion2 {
    public static String updateDate(String str){
        /*
        String str="03-6-2018T00:23:0001";
        CONVERT TO FOLLOWING STRUCTURE
        mm/dd/yyyy
        create one method taking the String parameter it will return String object with following format
         */

        String []arr= str.split("T");                // splitMethod will return String []array
        str=arr[0].replace('-','/');
        System.out.println(str);
        return str;

    }

    public static void main(String[] args) {
        updateDate("03-6-2018T00:23:000");

    }
}

