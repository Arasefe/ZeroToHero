package corejavaapi.stringmethods;

public class _9equalsAndequalsIgnoreCase2 {
    public static void main(String[] args) {
        String str1="javapoint";
        String str2="javapopint";
        String str3="JAVAPOINT";
        String str4="JAVAPOINT";
        System.out.println(str1.equals(str2));    // False
        System.out.println(str3.equals(str4));    // true
        System.out.println(str2.equals(str3));    // false
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        System.out.println(str1.equalsIgnoreCase(str4)); // true

    }
}
