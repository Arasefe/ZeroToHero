package methodsandencapsulation.constructors;

public class Blocks {
    public Blocks(){
        System.out.println("Constructor "+1);
    }

    {
        System.out.println("Instance Block "+2);
    }
    static{
        System.out.println("Static Block "+3);
    }
    static {
        System.out.println("Static Block "+ 4);
    }
    {
        System.out.println("Instance Block "+ 5);
    }
}
