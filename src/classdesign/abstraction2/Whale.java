package classdesign.abstraction2;

public abstract class Whale {
    int age=5;
    protected abstract void sing();
}
class HumpbackWhale extends Whale{
    int age=6;
    public void sing(){
        System.out.println("HumpbackWhale is singing " + age);
    }

    public static void main(String[] args) {
        HumpbackWhale h=new HumpbackWhale();
        h.sing();
    }
}
