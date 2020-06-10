package corejavaapi.arraypractice;

public class StringPractice {
    public static void main(String[] args) {
        String name="Techtorial";   //Pool
        String name1="Techtorial";  //Pool
        String name2=new String("Techtorial");
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);

        // == method is objetc will compare the values are stored in the same location or not.
        // if the values stored same location it will return true
        // otherwise it will return false
        System.out.println(name==name1);
        System.out.println(name==name2);

        System.out.println(name.equals(name1)); //compare values--->true
        System.out.println(name.equals(name2)); // compare values--->true

    }
}
