package classdesign.polymorphism4;

public abstract class Whale {
    public abstract void dive();        //method

    public static void main(String[] args) {
        Whale whale=new Orca();
        whale.dive();
    }
}
class Orca extends Whale{
    public void dive(){                 //method overriding
        System.out.println("Orca diving");

    }
}
