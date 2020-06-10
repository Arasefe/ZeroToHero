package classdesign.abstraction2;

public abstract class Animal {
    protected int age;
    public void eat(){
        System.out.println("Animal is eating");
    }
    public abstract String getName();

}
class Swan extends Animal{
    public String getName(){
    return "Swan";
    }

    public static void main(String[] args) {
        Swan swan=new Swan();
        System.out.println(swan.getName());     //Swan
        System.out.println(swan.age);           //0
    }
}
