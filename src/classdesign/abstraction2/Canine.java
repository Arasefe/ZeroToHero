package classdesign.abstraction2;

public class Canine {
}
class Dog extends Canine{

}
class Wolf extends Canine{

}
final class Husky extends Dog{

}
class Zoologist{
    Canine animal;
    public final void setAnimal(Dog animal){
        this.animal=animal;
    }

    public static void main(String[] args) {
        new Zoologist().setAnimal(new Husky());
    }
}
