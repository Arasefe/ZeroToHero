package corejavaapi.stringmethods;

public class _2charAtMethod {
    public static void charAtMethod(String string){
        string ="animals";
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(2));
        System.out.println(string.charAt(3));
        System.out.println(string.charAt(5));
        System.out.println(string.charAt(6));

    }

    public static void main(String[] args) {
        charAtMethod("Never give up");      // passing info by value
    }
}
