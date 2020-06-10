package operatorsandstatements.equality;

public class StringEquality4 {
    public static void main(String[] args) {
        String x="Hello World";
        String z=" Hello World".trim();
        System.out.println(x==z);
        System.out.println("+++++++++++++++++++++++++++++++++");
        methodEquality();
    }
    public static void methodEquality(){
        String x="Hello World";
        String z=" Hello World".trim();
        System.out.println(x.equals(z));

    }
}
