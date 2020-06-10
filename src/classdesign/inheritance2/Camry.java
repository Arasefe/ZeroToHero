package classdesign.inheritance2;

public class Camry  extends Car{
    String name;
    public Camry(String name){
        super(name);
        this.name=name;
    }
    @Override                   // return type has to be same or covariant
    public int averageSpeed(){
        return 35;
    }
    @Override
    public Integer maxSpeed(){
        return 125;
    }
}
