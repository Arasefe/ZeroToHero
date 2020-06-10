package corejavaapi.dateandtime;

public class Conversion3 {
    public static String method(){
        /*
        String str="09-06-2019T00:23:0001";(Java uses T to separate date and time)
        CONVERT TO FOLLOWING STRUCTURE
        mm/dd/yyyy
        create one method taking the String parameter it will return String object with following format mm/dd/yyyy
         */
        String str="09-06-2019T00:23:0001";
        str=str.substring(0,str.indexOf('T'));
        System.out.println(str);
        str=str.replace('-','/');
        System.out.println(str);
        return "";
    }

    public static void main(String[] args) {
        method();
    }
}
