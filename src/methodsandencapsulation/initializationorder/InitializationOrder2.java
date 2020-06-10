package methodsandencapsulation.initializationorder;

public class InitializationOrder2 {
    private String name="Torchie";
    {
        System.out.println(name);
    }
    private static int COUNT=0;
    static{
        System.out.println(COUNT);                  //0
    }
    {
        COUNT++;
        System.out.println(COUNT);                  //1
    }
    public InitializationOrder2(){
        System.out.println("Constructor");          //Constructor
    }

    public static void main(String[] args) {
        System.out.println("read to construct");
        new InitializationOrder2();
    }
}
