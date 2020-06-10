package methodsandencapsulation.initializationorder;

public class InitializationOrder3 {
    static{
        add(2);     // calls add() method thus prints 2
    }
    static void add(int num){
        System.out.println(num+ "");
    }
    InitializationOrder3(){
        add(5);
    }
    static{
        add(4);     // calls add() method thus prints 4
    }
    {
        add(6);
    }
    static{
        new InitializationOrder3(); // calls new to instantiate the object. This means we can go instance variables and initializers
    }
    {
        add(8);
    }

    public static void main(String[] args) {

    }
}
