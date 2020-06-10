package corejavaapi.dateandtime;

public class Conversion4 {
    public static void method(String str){
        /*
        String str="03-6-2018T00:23:0001";(Java uses T to separate date and time)
        CONVERT TO FOLLOWING STRUCTURE
        MM/dd/yyyy
        create one method taking the String parameter it will return String object with following format mm/dd/yyyy
        String str="03-6-2018T00:23:0001";
         */

        str=str.replace('-','/');
        str=str.substring(0,str.indexOf("T"));
        System.out.println(str);


    }

    public static void main(String[] args) {
        method("03-6-2018T00:23:0001");
    }
}
