package classdesign.interface2;

public class Airplane implements Flyable, Noise{

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void makeNoise() {
        System.out.println("ViZuuuuuuuuhhhhhhh");

    }
}
