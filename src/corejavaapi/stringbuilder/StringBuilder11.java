package corejavaapi.stringbuilder;


public class StringBuilder11 {
    public static void StringBuilderMethod(){
        StringBuilder a=new StringBuilder("I have started my journey");
        a.append("in USA");
        StringBuilder b=a.append("since 2019");
        System.out.println("a="+ a);        //I have started my journey in USA since 2019.Because there is only one Object
        System.out.println("b="+b);         //I have started my journey in USA since 2019
    }

    public static void main(String[] args) {
        StringBuilderMethod();
    }
}
