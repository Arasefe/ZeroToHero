package classdesign.abstractionMusa;

public class Cat extends Animal{
    public Cat(String name){
        this.name=name;
        if(name.equals("Karabas")){
            throw new RuntimeException("Boyle bir isim olmaz...Please give a different name!");
        }
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public void drink() {

    }

    @Override
    public void sleep(double duration) {
        System.out.println(name+ "is sleeping"+ duration+" hours");
    }

    @Override
    public String toString() {
        return "Cat[" +
                "name='" + name +
                ']';
    }
}
