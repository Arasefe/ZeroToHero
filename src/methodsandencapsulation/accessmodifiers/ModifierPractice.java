package methodsandencapsulation.accessmodifiers;

public class ModifierPractice {
    private int studentNumber=50;
    protected String name="Techtorial";

    public void sum(){
        System.out.println(studentNumber);
        printOut();
    }
    private void printOut(){
        System.out.println("Private Method");
    }

}
