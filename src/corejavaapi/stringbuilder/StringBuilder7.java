package corejavaapi.stringbuilder;

public class StringBuilder7 {
    public static void main(String[] args) {
        StringBuilder builder1=new StringBuilder("Computer");
        System.out.println(builder1);

        System.out.println( builder1.charAt(2));
        System.out.println(builder1.charAt(2)=='m');    //true

        System.out.println(builder1.indexOf("k"));      // -1 there is no k

        System.out.println(builder1.charAt(10));        // index out of bounds exception

        System.out.println(builder1.substring(2));  // mputer

        System.out.println(builder1.substring(2,7));      // mpute

        // return type of substring method is String.Thus, we can not use any StringBuilder methods after substring
        // but we can use String methods.

        builder1.substring(4);                      // return type is String
        System.out.println(builder1);
        builder1.insert(8,"Apple");
        System.out.println(builder1);

        String str="Computer";
        str=str.replace("r","r Apple");

        System.out.println(str);

        String str2="Cormputer";
        str2=str2.replace("er","er Apple");
        System.out.println(str2);


    }
}
