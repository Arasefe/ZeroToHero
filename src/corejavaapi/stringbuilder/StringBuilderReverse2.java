package corejavaapi.stringbuilder;

public class StringBuilderReverse2 {
    public void reverseMethod(){
        StringBuilder sb=new StringBuilder("LOCATION");
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        StringBuilderReverse2 str=new StringBuilderReverse2();
        str.reverseMethod();
    }

}
