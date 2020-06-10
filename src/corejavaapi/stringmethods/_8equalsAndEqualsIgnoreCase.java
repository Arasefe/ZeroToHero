package corejavaapi.stringmethods;


public class _8equalsAndEqualsIgnoreCase {
    public void equalsMethod(){
        String str1="animals";
        String str2=new String("animals");
        String str3="ANIMALS";
        String str4=new String("Animals");
        System.out.println(str1.equals(str3));              //false
        System.out.println(str1.equals(str2));              //true
        System.out.println(str1.equals(str4));              //false
        System.out.println(str2.equalsIgnoreCase(str3));    //true
        System.out.println(str2.equals(str4));              //false
        System.out.println(str2.equalsIgnoreCase(str4));    //true
        System.out.println(str3.equals(str4));              //false
        System.out.println(str3.equalsIgnoreCase(str4));    //true
    }

    public static void main(String[] args) {
        _8equalsAndEqualsIgnoreCase obj=new _8equalsAndEqualsIgnoreCase();
        obj.equalsMethod();
    }
}
