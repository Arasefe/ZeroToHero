package classdesign.abstractionMusa;

public class Bird extends Animal{
    public Bird(String name){
        this.name=name;
    }


    @Override
    public void sleep(double duration) {
        System.out.println(name+ " is sleeping "+duration+" hours");
    }

    @Override
    public String eat() {
        return name+ " is eating ";
    }

    @Override
    public void drink() {
        System.out.println(name +" is drinking milk... ");
    }

    @Override
    public String toString() {
        return "Bird[" +
                "name='" + name +
                ']';
    }
}
