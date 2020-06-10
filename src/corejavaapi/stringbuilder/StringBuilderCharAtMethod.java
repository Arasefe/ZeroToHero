package corejavaapi.stringbuilder;

public class StringBuilderCharAtMethod {
    public static void stringBuilderMethod(){
        StringBuilder a=new StringBuilder("animals");
        String sub=a.substring(a.indexOf("a"),a.indexOf("al"));
        int length=a.length();                          // 7
        char ch=a.charAt(6);                            // s
        System.out.println(sub +" "+length+" "+ch );    // anim 7 s
    }

    public static void main(String[] args) {
        stringBuilderMethod();
    }
}
