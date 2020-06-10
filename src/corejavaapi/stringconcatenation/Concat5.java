package corejavaapi.stringconcatenation;

public class Concat5 {
    public static void concatMethod(){
        String s1="1";
        String s2=s1.concat("2");
        String s3=s2.concat("3");
        String s4=s3.concat("4");
        System.out.println(s1);     //1
        System.out.println(s2);     //12
        System.out.println(s3);     //123
        System.out.println(s4);     //1234

    }

    public static void main(String[] args) {
        concatMethod();
    }
}
