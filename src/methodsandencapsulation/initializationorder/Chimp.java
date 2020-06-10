package methodsandencapsulation.initializationorder;

public class Chimp {
    public static void main(String[] args) {
        Rope.swing();
        new Rope().swing();
        System.out.println(Rope.LENGTH);
    }
}
