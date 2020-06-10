package classdesign.polymorphism2;

public class Man  extends Human implements Dad, Programmer {

    @Override
    public void feed() {
        System.out.println("Dad is feeding the family");

    }

    @Override
    public void eat() {
        System.out.println("Man is eating three times a day");
    }

    @Override
    protected void walk() {
        System.out.println("Man can walk 20 miles a day");
    }

    @Override
    void sleep() {
        System.out.println("Man should sleep at least 5 hours");
    }

    @Override
    public void code() {
        System.out.println("Man can code");
    }

    public static void main(String[] args) {
        Dad dad=new Man();
        dad.feed();
    }

}
