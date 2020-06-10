package methodsandencapsulation.initializationorder;

public class InitializationOrder1 {
    private String name="Torchie";
    {
        System.out.println(name);
    }
    private static int COUNT=0;
    static{
        System.out.println(COUNT);
    }
    static{
        COUNT+=10;
        System.out.println(COUNT);
    }
    public InitializationOrder1(){
        System.out.println("Constructor");
    }
}