package classdesign.abstractionMusa;

public class Dog extends Animal{
    public Dog(String name){
        this.name=name;
    }

    @Override
    public String eat(){

        return name+" is eating...";
    }
    @Override
    public void drink(){
        System.out.println(name + "is drinking raki....");
    }

    @Override
    public String toString() {
        return "Dog[" +
                "name='" + name +
                ']';
    }
}
