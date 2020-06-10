package classdesign.polymorphism4;

 public class Mammal {
    public Mammal(int age){
        System.out.println("Mammal");
    }
}
class Platybus extends Mammal{
     public Platybus(){
         super(5);
         System.out.println("Platybus");
     }

    public static void main(String[] args) {
        new Mammal(5);
    }
}
