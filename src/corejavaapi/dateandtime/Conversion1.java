package corejavaapi.dateandtime;

public class Conversion1 {
    public static String updateDate(String str){
        /*
        String str="03-6-2018T00:23:0001";(Java uses T to separate date and time)
        CONVERT TO FOLLOWING STRUCTURE
        mm/dd/yyyy
        create one method taking the String parameter it will return String object with following format mm/dd/yyyy
         */

        str=str.replace('-','/');
        System.out.println(str);
        str=str.substring(0,str.indexOf('T'));
        str=str.substring(0,str.indexOf("T"));
        System.out.println(str);
        return str;

    }

    public static void main(String[] args) {
        updateDate("03-6-2018T00:23:0001");
    }
}
