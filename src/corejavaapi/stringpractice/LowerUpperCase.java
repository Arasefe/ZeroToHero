package corejavaapi.stringpractice;

public class LowerUpperCase {
    public static void main(String[] args) {
        String success="Doing Whatever It Takes" ;
    success.toUpperCase();
        System.out.println(success);
        success=success.toUpperCase();
        System.out.println(success);
        success=success.toLowerCase();
        System.out.println(success);
        System.out.println(success.startsWith("D")); // return true
        System.out.println(success.startsWith("d")); // return false

        System.out.println(success.endsWith("s")); //return true
        System.out.println(success.endsWith("takes")); //return true
        System.out.println(success.contains("it"));
        System.out.println(success.equals("Doing Whatever It Takes"));
        System.out.println(success.equalsIgnoreCase("Doing Whatever  Takes"));
        success.substring(6);
        System.out.println(success.substring(6));  // ->whatever it takes
        System.out.println(success);   // doing whatever it takes
        System.out.println(success.substring(6,14)); // 6,7,8,9,10,11,12,13
    }
}
