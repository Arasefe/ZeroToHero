package corejavaapi.stringbuilder;

public class StringBuilder9 {
    public static void main(String[] args) {
        StringBuilder sName=new StringBuilder();
        StringBuilder sName1=new StringBuilder();
        StringBuilder sName2=sName.append("Techtorial");
        System.out.println(sName==sName1);
        System.out.println(sName==sName2);

        StringBuilder sName3=new StringBuilder("Tech");
        StringBuilder sName4=new StringBuilder("Tech");
        // Car car=new Car("tOYOTA")
        // Car car1=new Car("tOYOTA")
        // == where they are pointing at
        // CAR.equals(car1)--where they are pointing the same object
        // .equals method in string is coming from String class
        // String and Wrapper class has .equals method so it will compare the values,
        // but in StringBuilder or Object no .equals method so it will take from Object class and it will compare
        // if they are pointing the same object.
        String car=" Toyota";
        String car1=" Toyota".trim();
        System.out.println(car==car1);
        // it will check if they are pointing to same location and check both of them has same value or not.
    }

}
