package operatorsandstatements.equality;

public class StringEquality3 {
    public static void main(String[] args) {
        String x="Java is my world";
        String y="Java is my world";
        String z=new String("Java is my world");

        System.out.println(x==y);       // true
        System.out.println(x==z);       // false
        System.out.println(y==z);       // false

    }
}
