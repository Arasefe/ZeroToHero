package corejavaapi.stringbuilder;

public class StringBuilder12 {
    public static void stringBuilder(){
        StringBuilder a=new StringBuilder("abc");
        StringBuilder b=a.append("de");
        b=b.append("f").append("g");
        System.out.println("a="+a);         //abcdefg because there is one Object and both pointing only one object
        System.out.println("b="+b);         //abcdefg
    }

    public static void main(String[] args) {
        stringBuilder();
    }
}
