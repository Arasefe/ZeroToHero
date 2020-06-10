package corejavaapi.stringpractice;

public class MethodChaining {
    public static void main(String[] args) {
        String str="Zero to Hero";
        str=str.replace("Zero", "One");  // One to Hero
        str.toUpperCase();                                  // ONE TO HERO
        str.trim();                                         //ONE TO HERO
        str.substring(0,3);                                 //ONE
        System.out.println(str);
        String name=" Applications ";
        name.toLowerCase().trim().indexOf("t");             // after primitive data types we can not use any method
        System.out.println(name);                           // Lat method will decide the return type in method chaining

    }
}
