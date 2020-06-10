package corejavaapi.stringconcatenation;

public class Concat4 {
    public static void method(){
        String s="1";
        s+="2";         // 12
        s+=3;           // 123
        System.out.println(s);
    }

    public static void main(String[] args) {
        method();
    }
}
