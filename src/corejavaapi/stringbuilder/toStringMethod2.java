package corejavaapi.stringbuilder;


public class toStringMethod2 {
    public static String convertStringBuilder(StringBuilder stringBuilder){
       String str=stringBuilder.toString();
        System.out.println(str);
        return str;

    }

    public static void main(String[] args) {
        convertStringBuilder(new StringBuilder("ne mutlu turkum diyene"));
    }

}
