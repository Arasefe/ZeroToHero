package methodsandencapsulation.constructors;



public class StaticBlockExample {
    static {
        System.out.println("I am static block"); // run just for once for more than one objects.

    }
    // Instance Block
    {
        System.out.println("I am instance block");

    }
    public  StaticBlockExample(){
        System.out.println("I am in constructor");
    }

    public static void main(String[] args) {
        StaticBlockExample sbex=new StaticBlockExample();
        StaticBlockExample sbex2=new StaticBlockExample();
        StaticBlockExample sbex3=new StaticBlockExample();


    }
}
