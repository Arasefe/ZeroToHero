package operatorsandstatements.equality;

public class StringBuilderEquality1 {
    public static void stringBuilderMethod(){
        StringBuilder sb1=new StringBuilder("car");
        StringBuilder sb2=new StringBuilder("car");
        StringBuilder sb3=sb1.append("a");

        System.out.println(sb1==sb2);       // false as they are not pointing the same location
        System.out.println(sb1==sb3);       // they are referring to the same object
        System.out.println(sb2==sb3);       // they are not referring the same object

    }

    public static void main(String[] args) {
        stringBuilderMethod();
    }
}
