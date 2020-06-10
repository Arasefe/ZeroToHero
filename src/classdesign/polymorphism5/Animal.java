package classdesign.polymorphism5;
// variable hiding
public class Animal {
    public int length=2;                            //variable

}
class Jellyfish extends Animal{
    public int length=5;                            //variable hiding

    public static void main(String[] args) {
        Jellyfish jellyfish=new Jellyfish();
        Animal animal=new Jellyfish();
        System.out.println(jellyfish.length);       //5
        System.out.println(animal.length);          //2
    }
}
