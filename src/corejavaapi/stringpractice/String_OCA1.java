package corejavaapi.stringpractice;

public class String_OCA1 {
    public static void stringMethod(){
        int x=0;
        String s="null";
        if (s.equals(x)) System.out.println("Success"); // == can tot be applied to String
        else System.out.println("Failure");
    }

    public static void main(String[] args) {
        stringMethod();
    }
}
