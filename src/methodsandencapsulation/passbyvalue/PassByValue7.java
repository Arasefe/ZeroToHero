package methodsandencapsulation.passbyvalue;

public class PassByValue7 {
    public static void speak(StringBuilder s){
        s.append(" Java");
        System.out.println(s);
    }

    public static void main(String[] args) {
        StringBuilder name=new StringBuilder();
        name.append("My life is");
        speak(name);
        System.out.println(name);

    }
}
