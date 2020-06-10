package methodsandencapsulation.accessmodifiers;

public class ModifierTest {
    public static void main(String[] args) {
        ModifierPractice md=new ModifierPractice();
        int number=10;
        md.sum();   //50, Private Method, private method

        System.out.println(md.name);
        System.out.println(number); //10;
    }
}
