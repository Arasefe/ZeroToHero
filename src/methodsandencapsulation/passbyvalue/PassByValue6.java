package methodsandencapsulation.passbyvalue;

public class PassByValue6 {
    public static void speak(String name){
        name="Sparky";
        System.out.println("speak Method"+name);
    }

    public static void main(String[] args) {
        String name="Webby";
        speak(name);
        System.out.println("Main Method"+name);
    }

}
